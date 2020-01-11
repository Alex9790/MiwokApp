package com.example.miwokapp;

public class Word {

    private String miwokWord;
    private String defaultWord;
    private static final int NO_IMAGE = -1;
    private int imageResource = NO_IMAGE;   //en caso de que la lista de palabras tenga o no imagenes
    private int mAudioResourceID;   //recurso para el audio de la palabra


    public Word (String miwokWord, String defaultWord, int imageResource, int audioResourceID){
        this.miwokWord = miwokWord;
        this.defaultWord = defaultWord;
        this.imageResource = imageResource;
        this.mAudioResourceID = audioResourceID;
    }
    public Word (String miwokWord, String defaultWord, int audioResourceID){
        this.miwokWord = miwokWord;
        this.defaultWord = defaultWord;
        this.mAudioResourceID = audioResourceID;
    }

    public String getMiwokWord() {
        return miwokWord;
    }

    public void setMiwokWord(String miwokWord) {
        this.miwokWord = miwokWord;
    }

    public String getDefaultWord() {
        return defaultWord;
    }

    public void setDefaultWord(String defaultWord) {
        this.defaultWord = defaultWord;
    }

    public int getImageResource() {
        return imageResource;
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }

    public boolean hasImage(){
        return imageResource != NO_IMAGE;
    }

    public int getmAudioResourceID() {
        return mAudioResourceID;
    }

    public void setmAudioResourceID(int mAudioResourceID) {
        this.mAudioResourceID = mAudioResourceID;
    }

    //util para debuggear, puedes observar el contenido de cada palabra de la lista
    @Override
    public String toString() {
        return "Word{" +
                "miwokWord='" + miwokWord + '\'' +
                ", defaultWord='" + defaultWord + '\'' +
                ", imageResource=" + imageResource +
                ", mAudioResourceID=" + mAudioResourceID +
                '}';
    }
}
