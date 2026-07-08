package com.ss.android.ugc.aweme.services.specialplus;

import android.content.Context;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public interface ISpecialPlusService {
    String getEffectId();

    String getEffectVideoPlusTab();

    String getIconType();

    List<String> getListOfPreviousAid();

    int getMaxTransformationsLimit();

    int getQuickPromoCount();

    long getQuickPromoPlusDebutTime();

    String getResourceType();

    List<String> getSpecialPlusEffectList();

    String getSpecialPlusTips();

    HashMap<String, Integer> getTransformationsCountMap(String str);

    int getTransformationsLimitPerEffect();

    void initCallBack();

    boolean isEffectVideoPlusEnabled();

    boolean isEffectVideoPlusShowed();

    boolean isEffectVideoPlusUnlimitedTransformations();

    boolean isNeedShowSpecialPlusDirect();

    boolean isQuickPromoPlusDisappearOptimization();

    boolean isQuickPromoPlusEnabled();

    boolean isTransformationLimitHit(String str, String str2);

    void preDownloadSuperEntranceRes(Context context);

    void saveLastAid(String str);

    void setEffectVideoPlusShowed(boolean z);

    void setEffectVideoPlusTab(String str);

    void setLastTransformationDate(long j);

    void setQuickPromoCount(int i);

    void setQuickPromoPlusDebutTime(long j);

    void setShouldShowQuickPromoPlusAuthor(boolean z);

    void setSpecialPlusClicked();

    void setSpecialPlusShowed();

    void setSpecialPlusState(boolean z);

    void setTransformationsCountMap(HashMap<String, Integer> map, String str);

    boolean shouldResetTransformationsMap();

    boolean shouldShowQuickPromoPlusAuthor();

    boolean shouldShowSpecialPlus();
}
