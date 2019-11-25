# TabbedActivity
Ejemplo de TabbedActivity, con un header con una libreria externa de youtube para que reproduzca directamente desde youtube

### Dependencias Necesarias

En build.gradle(Module:app)

dependencies {
    implementation 'com.github.PierfrancescoSoffritti:AndroidYouTubePlayer:7.0.1'
}

En build.gradle(Project:)


buildscript {
    repositories {
        google()
        jcenter()
        
    }
    dependencies {
        classpath 'com.android.tools.build:gradle:3.5.2'
        
        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}
 ### Dependencias Necesarias en gradle
allprojects {
    repositories {
        google()
        jcenter()
        maven {
            url 'https://maven.google.com/'
            name 'Google'
        }
        maven { url 'https://jitpack.io' }
        maven { url "https://oss.sonatype.org/content/repositories/snapshots/" }
    }
}

task clean(type: Delete) {
    delete rootProject.buildDir
}

  



## Funcionamiento Desplazamiento entre tabs

 private void setupViewPager (ViewPager viewPager){
        SectionsPageAdapter adapter = new SectionsPageAdapter(getSupportFragmentManager());
        adapter.addFragment(new Tab1Fragment(), "TAB1");
        adapter.addFragment(new Tab2Fragment(), "TAB2");
        adapter.addFragment(new Tab3Fragment(), "TAB3");
        viewPager.setAdapter(adapter);
    }

Tener en cuenta que debes crear los fragmentos como Fragment(Blank) 


## Funcionamiento Youtube

  YouTubePlayerView youTubePlayerView = findViewById(R.id.youtube_player_view);
        youTubePlayerView.initialize(new YouTubePlayerInitListener() {
            @Override
            public void onInitSuccess(final YouTubePlayer initializedYouTubePlayer) {
                initializedYouTubePlayer.addListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady() {
                        initializedYouTubePlayer.loadVideo("id_video", 0); //example: watch?v="CiPJocKuYC0"

                    }

                });

            }
        }, true);
        
    
    
    
  
