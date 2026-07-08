package com.bytedance.android.livesdkapi.host;

import X.C006A;
import X.C05JF;
import X.C09JN;
import X.C1106210etP;
import X.C197039127h;
import X.C19EG;
import X.InterfaceC1372610lp5;
import X.InterfaceC473070Igr;
import X.InterfaceC473650Ihn;
import X.InterfaceC473660Iho;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Pair;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public interface IHostShare extends C006A {
    Pair<String, Drawable> getBreathShareAnimShareRes(Context context, String str, String str2);

    String getBundleKey(int i);

    List<Long> getInternalShareSortedUids();

    Dialog getLongPressShareDialog(Activity activity, C1106210etP c1106210etP, InterfaceC1372610lp5 interfaceC1372610lp5);

    Fragment getLongPressShareDialog2Fragment(Activity activity, C1106210etP c1106210etP, InterfaceC1372610lp5 interfaceC1372610lp5);

    int getRepostIconRes();

    Dialog getShareDialog(Activity activity, C1106210etP c1106210etP, InterfaceC1372610lp5 interfaceC1372610lp5);

    User getShareExternalLinkShareUser(long j);

    C197039127h getShareRelationButton(Context context, C05JF c05jf);

    TuxSheet getShareTuxSheet(Activity activity, C1106210etP c1106210etP, InterfaceC1372610lp5 interfaceC1372610lp5);

    void getShortUrl(String str, InterfaceC473660Iho interfaceC473660Iho);

    void getUrlModelAndShowAnim(InterfaceC473650Ihn interfaceC473650Ihn);

    boolean isImChannel(String str);

    Boolean isSharer(long j);

    /* bridge */ /* synthetic */ void onInit();

    void postFollowRecommendEvent(String str, String str2, String str3);

    void postFollowStatus(String str, int i);

    void refreshScreenShotConfig();

    void registerShareUserInfoListener(long j, InterfaceC473070Igr interfaceC473070Igr);

    void repost(long j, Map<String, String> map);

    void setScreenShotConfig();

    void share(Activity activity, C1106210etP c1106210etP, InterfaceC1372610lp5 interfaceC1372610lp5);

    void shareLiveReplay(C19EG c19eg, String str, String str2, String str3, String str4, String str5, String str6, String str7);

    void shareSingleMessage(Activity activity, String str, C1106210etP c1106210etP, C09JN<Boolean> c09jn);

    void shareSingleMessageToMultiUser(Activity activity, List<String> list, C1106210etP c1106210etP, C09JN<Boolean> c09jn);

    void shareStreamGoal(Activity activity, String str, C1106210etP c1106210etP, C09JN<Boolean> c09jn);

    void shareSubInvitation(Activity activity, C1106210etP c1106210etP, InterfaceC1372610lp5 interfaceC1372610lp5);

    void shareSubscribeLink(Activity activity, C1106210etP c1106210etP, InterfaceC1372610lp5 interfaceC1372610lp5);

    void showScreenTimeDialog(Bundle bundle);
}
