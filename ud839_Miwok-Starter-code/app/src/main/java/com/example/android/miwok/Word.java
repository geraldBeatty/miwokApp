package com.example.android.miwok;

/**
 * Created by Rebecca and Gerald on 08/05/2017.
 */

public class Word
{
    private String mMiwokWord;

    private String mEnglishWord;

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    private static final int IMAGE_PROVIDED = 0;

    private int mMediaFile;

    public Word(String englishWord,String miwokWord, int imageResourceId, int mediaFile)
    {
        mMiwokWord = miwokWord;
        mEnglishWord = englishWord;
        mImageResourceId = imageResourceId;
        mMediaFile = mediaFile;
    }

    public Word(String englishWord,String miwokWord, int mediaFile)
    {
        mMiwokWord = miwokWord;
        mEnglishWord = englishWord;
        mMediaFile = mediaFile;
    }

    public String getMiworkWord()
    {
        return mMiwokWord;
    }

    public String getEnglishWord()
    {
        return mEnglishWord;
    }

    public int getmImageResourceId() {return mImageResourceId;}

    public boolean hasImage()
    {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public int getmMediaFile() {return mMediaFile;}

    @Override
    public String toString() {
        return "Word{" +
                "mMiwokWord='" + mMiwokWord + '\'' +
                ", mEnglishWord='" + mEnglishWord + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mMediaFile=" + mMediaFile +
                '}';
    }
}
