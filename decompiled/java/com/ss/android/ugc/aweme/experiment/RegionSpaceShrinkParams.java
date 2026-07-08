package com.ss.android.ugc.aweme.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes34.dex */
public class RegionSpaceShrinkParams {

    @C09CT("enable")
    public boolean enable;

    @C09CT("firstDelay")
    public int firstDelay = -1;

    @C09CT("periodOfCheck")
    public int periodOfCheck = -1;

    @C09CT("periodOfShrink")
    public float periodOfShrink = 0.65f;

    @C09CT("periodOfLessMemoryUsage")
    public float periodOfLessMemoryUsage = 0.45f;

    @C09CT("shrinkStep")
    public int shrinkStep = 125;

    @C09CT("lowerLimit")
    public int lowerLimit = 384;
}
