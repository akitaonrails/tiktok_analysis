package com.ss.android.ugc.aweme.translation.service;

import X.C19EG;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.setting.serverpush.model.ContentLanguage;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public interface IDefaultDNTController {
    void clearDefaultDNTLangsAndSetHasUserManuallyModifiedDNTs();

    void clearHasShownDNTEditToastForLang();

    String[] findRemovedLanguages(String[] strArr, String[] strArr2);

    String[] getDefaultDNTLangs();

    List<ContentLanguage> getDoNotTranslateList();

    boolean getHasUserManuallyModifiedDNT();

    String[] getPredictedDNTLangs();

    String[] getSelectedDoNotTranslateLanguageCodes();

    boolean hasDismissedDNTNote();

    void markDismissedDNTNote();

    void markShowEditDNTToastForLang(String str);

    void onPushSettingUpdated(List<? extends ContentLanguage> list, List<? extends ContentLanguage> list2, boolean z);

    void resetDismissedDNTNoteCacheValue();

    void setDNTHasBeenManuallyModified(boolean z);

    void setDefaultDNTLangs(String[] strArr);

    void setDoNotTranslateList(List<? extends ContentLanguage> list);

    void setPredictedDNTLangs(String[] strArr);

    void setSelectedDoNotTranslateLanguageCodes(String[] strArr);

    boolean shouldShowDNTToastForLang(String str);

    void showEditDNTBottomToast(Aweme aweme, Fragment fragment, C19EG c19eg, String str, int i, String str2);
}
