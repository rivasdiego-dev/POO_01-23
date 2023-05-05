package com.uca.soundsandimages.models;

public class Sound {
    private String soundPath;
    private String imagePath;
    private String title;
    private String description;

    public Sound(String soundPath, String imagePath, String title, String description) {
        this.soundPath = soundPath;
        this.imagePath = imagePath;
        this.title = title;
        this.description = description;
    }

    public String getSoundPath() {
        return soundPath;
    }

    public void setSoundPath(String soundPath) {
        this.soundPath = soundPath;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Sound{" + "soundPath=" + soundPath + ", imagePath=" + imagePath + ", title=" + title + ", description=" + description + '}';
    }
}