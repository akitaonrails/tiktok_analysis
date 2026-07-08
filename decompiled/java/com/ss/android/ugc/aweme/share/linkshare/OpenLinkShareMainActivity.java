package com.ss.android.ugc.aweme.share.linkshare;

import X.AbstractC19484711Kz;
import X.C09O8;
import X.C0C64;
import X.C0OM1;
import X.C11S5;
import X.C123100dR;
import X.C1251150ifB;
import X.C1260120ite;
import X.C12ES;
import X.C1308910kAL;
import X.C1388190mED;
import X.C1390920mIc;
import X.C13BV;
import X.C13LN;
import X.C1402840mbq;
import X.C1697810uHb;
import X.C1701940uOG;
import X.C1720106oR;
import X.C1954807lC;
import X.C19EG;
import X.C1B46;
import X.C1B4F;
import X.C1B4Q;
import X.C1B4X;
import X.C1B57;
import X.C1D15;
import X.C20684815ws;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2198861B4a;
import X.C2198871B4b;
import X.C2198911B4f;
import X.C2198931B4h;
import X.C2198941B4i;
import X.C2344009Gk;
import X.C2360509Mt;
import X.C2471909mP;
import X.C299020Bno;
import X.C335910DEv;
import X.C786410Ut5;
import X.C866950Xzh;
import X.DialogInterfaceOnCancelListenerC2249031D0z;
import X.EnumC21376718lB;
import X.EnumC2198891B4d;
import X.EnumC335920DEw;
import X.InterfaceC2198961B4k;
import X.InterfaceC586170Myt;
import Y.ARunnableS107S0100000_7;
import Y.ARunnableS133S0100000_33;
import Y.AfS178S0100000_9;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.common.LinkShareSettings;
import com.ss.android.ugc.aweme.common.MusicContent;
import com.ss.android.ugc.aweme.composer.model.LinkShareData;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.opensdkservice.IOpenPlatformService;
import com.ss.android.ugc.aweme.openshare.IShareRespSendService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.linkshare.api.OpenDspMusicListApi;
import com.ss.android.ugc.aweme.share.linkshare.model.DspMusicListResponse;
import com.ss.android.ugc.aweme.share.linkshare.model.LinkShareIntentModel;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS323S0000000_34;
import kotlin.jvm.internal.AwS182S0400000_34;
import kotlin.jvm.internal.AwS469S0200000_34;
import kotlin.jvm.internal.AwS578S0100000_34;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes35.dex */
public final class OpenLinkShareMainActivity extends BaseActivity implements InterfaceC2198961B4k, InterfaceC586170Myt {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYkKD02ZiklHELIOSJyQgICQ+LGEcOCAiBSY9IxYkKD02BSQlJw4wPCw6IDsq";
    public C1402840mbq LL;
    public TuxSheet LLILLJJLI;
    public C2198941B4i LLILLL;
    public LinkShareIntentModel LLILZ;

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.share.linkshare.OpenLinkShareMainActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.share.linkshare.OpenLinkShareMainActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.share.linkshare.OpenLinkShareMainActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.share.linkshare.OpenLinkShareMainActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.share.linkshare.OpenLinkShareMainActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void LLLLZIL() {
        String string;
        String string2;
        List stringArrayList;
        LinkShareIntentModel linkShareIntentModel;
        C1B4F c1b4f;
        AbstractC19484711Kz<DspMusicListResponse> abstractC19484711KzLJIJJLI;
        C1402840mbq c1402840mbq;
        LinkShareSettings linkShareSettings;
        String string3;
        String string4;
        String string5;
        Object obj;
        Bundle bundleLLLLLZL = LLLLLZL(getIntent());
        String str = "";
        if (bundleLLLLLZL == null || (string = bundleLLLLLZL.getString("com.tiktok.opensdk.share.extra.CLIENT_KEY")) == null) {
            string = "";
        }
        IOpenPlatformService iOpenPlatformService = (IOpenPlatformService) ServiceManager.get().getService(IOpenPlatformService.class);
        Pair<Boolean, Boolean> pairLJFF = iOpenPlatformService.LJFF();
        boolean zBooleanValue = pairLJFF.getFirst().booleanValue();
        if (pairLJFF.getSecond().booleanValue()) {
            LLLLZI(C1B4F.LJIIZILJ);
            return;
        }
        if (!zBooleanValue) {
            ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIILL(this);
            Bundle bundle = new Bundle();
            C786410Ut5.LJJJI("enter_method", "link_share", bundle);
            iOpenPlatformService.LJIIIIZZ(this, string, bundle, AFwS323S0000000_34.get$arr$(1));
            return;
        }
        int i = C2187451AjH.LIZ;
        Bundle bundleLLLLLZL2 = LLLLLZL(getIntent());
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (bundleLLLLLZL2 != null) {
            for (String str2 : bundleLLLLLZL2.keySet()) {
                try {
                    obj = bundleLLLLLZL2.get(str2);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    obj = null;
                } catch (OutOfMemoryError e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    obj = null;
                }
                int i2 = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Key: ");
                sbLIZ.append(str2);
                sbLIZ.append(" Value: ");
                sbLIZ.append(obj);
                C2188811AlT.LIZIZ(sbLIZ);
            }
        }
        Bundle bundleLLLLLZL3 = LLLLLZL(getIntent());
        if (bundleLLLLLZL3 == null || (string2 = bundleLLLLLZL3.getString("com.tiktok.opensdk.share.extra.CLIENT_KEY")) == null) {
            string2 = "";
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("launch_method", "link_share");
        c2344009Gk.LJFF("channel", string2);
        C20684815ws.LJIILLIIL("share_init", c2344009Gk.LIZ);
        Bundle bundleLLLLLZL4 = LLLLLZL(getIntent());
        String string6 = bundleLLLLLZL4 != null ? bundleLLLLLZL4.getString("com.tiktok.opensdk.share.extra.LINK") : null;
        Bundle bundleLLLLLZL5 = LLLLLZL(getIntent());
        String string7 = bundleLLLLLZL5 != null ? bundleLLLLLZL5.getString("com.tiktok.opensdk.share.extra.CALLER_RETURNED_LOCAL_ENTRY") : null;
        Bundle bundleLLLLLZL6 = LLLLLZL(getIntent());
        String string8 = bundleLLLLLZL6 != null ? bundleLLLLLZL6.getString("com.tiktok.opensdk.share.extra.CALLER_PACKAGE_NAME") : null;
        Bundle bundleLLLLLZL7 = LLLLLZL(getIntent());
        String string9 = bundleLLLLLZL7 != null ? bundleLLLLLZL7.getString("com.tiktok.opensdk.share.extra.MUSIC_ID") : null;
        boolean z = false;
        if (string9 != null && a0.LJLIIIL(string9).toString().length() == 0) {
            string9 = null;
        }
        Bundle bundleLLLLLZL8 = LLLLLZL(getIntent());
        int i3 = bundleLLLLLZL8 != null ? bundleLLLLLZL8.getInt("com.tiktok.opensdk.share.extra.MUSIC_START_TIME_MS", 0) : 0;
        Bundle bundleLLLLLZL9 = LLLLLZL(getIntent());
        if (bundleLLLLLZL9 == null || (stringArrayList = bundleLLLLLZL9.getStringArrayList("com.tiktok.opensdk.share.extra.MEDIA")) == null) {
            stringArrayList = C13BV.INSTANCE;
        }
        Bundle bundleLLLLLZL10 = LLLLLZL(getIntent());
        String string10 = bundleLLLLLZL10 != null ? bundleLLLLLZL10.getString("com.tiktok.opensdk.share.extra.BACKGROUND_IMAGE") : null;
        Bundle bundleLLLLLZL11 = LLLLLZL(getIntent());
        int i4 = bundleLLLLLZL11 != null ? bundleLLLLLZL11.getInt("com.tiktok.opensdk.share.extra.COVER_IMAGE_SIZE") : 0;
        Bundle bundleLLLLLZL12 = LLLLLZL(getIntent());
        String string11 = bundleLLLLLZL12 != null ? bundleLLLLLZL12.getString("com.tiktok.opensdk.share.extra.ENTITY_URI") : null;
        Bundle bundleLLLLLZL13 = LLLLLZL(getIntent());
        String strLJZL = (bundleLLLLLZL13 == null || (string5 = bundleLLLLLZL13.getString("com.tiktok.opensdk.share.extra.REQUEST_ID")) == null) ? null : C13LN.LJZL(100, string5);
        Bundle bundleLLLLLZL14 = LLLLLZL(getIntent());
        String string12 = bundleLLLLLZL14 != null ? bundleLLLLLZL14.getString("com.tiktok.opensdk.share.extra.MUSIC_METADATA") : null;
        Bundle bundleLLLLLZL15 = LLLLLZL(getIntent());
        boolean z2 = bundleLLLLLZL15 != null ? bundleLLLLLZL15.getBoolean("com.tiktok.opensdk.share.extra.IS_SHARE_TO_STORY_ONLY") : false;
        Bundle bundleLLLLLZL16 = LLLLLZL(getIntent());
        if (bundleLLLLLZL16 != null && (string4 = bundleLLLLLZL16.getString("com.tiktok.opensdk.share.extra.TEXT_IN_SHARE_CONTENT")) != null) {
            str = string4;
        }
        EnumC21376718lB.Companion.getClass();
        EnumC21376718lB enumC21376718lB = EnumC21376718lB.map.get(Integer.valueOf(i4));
        if (enumC21376718lB == null) {
            enumC21376718lB = EnumC21376718lB.NORMAL;
        }
        Bundle bundleLLLLLZL17 = LLLLLZL(getIntent());
        if (bundleLLLLLZL17 == null) {
            bundleLLLLLZL17 = new Bundle();
        }
        C1402840mbq c1402840mbq2 = new C1402840mbq(bundleLLLLLZL17);
        c1402840mbq2.mCallerPackage = string8;
        c1402840mbq2.mClientKey = string2;
        c1402840mbq2.callerLocalEntry = string7;
        c1402840mbq2.isLinkShare = true;
        c1402840mbq2.requestId = strLJZL;
        c1402840mbq2.linkShareSettings = new LinkShareSettings(z, z, 3, defaultConstructorMarker);
        this.LL = c1402840mbq2;
        C1B46 c1b46 = C1B46.LIZ;
        Bundle shareRequestBundle = c1402840mbq2.getShareRequestBundle();
        c1b46.getClass();
        C1B46.LJ(shareRequestBundle);
        Bundle bundleLLLLLZL18 = LLLLLZL(getIntent());
        String string13 = bundleLLLLLZL18 != null ? bundleLLLLLZL18.getString("com.tiktok.opensdk.share.extra.BACKGROUND_TOP_COLOR_HEX") : null;
        Bundle bundleLLLLLZL19 = LLLLLZL(getIntent());
        String string14 = bundleLLLLLZL19 != null ? bundleLLLLLZL19.getString("com.tiktok.opensdk.share.extra.BACKGROUND_BOTTOM_COLOR_HEX") : null;
        LinkShareData.BackgroundColor backgroundColor = (C866950Xzh.LIZ(string13) && C866950Xzh.LIZ(string14)) ? new LinkShareData.BackgroundColor(string13, string14) : null;
        CreativeInfo creativeInfo = new CreativeInfo(null, 0, null, 7, null);
        Bundle bundleLLLLLZL20 = LLLLLZL(getIntent());
        if (bundleLLLLLZL20 == null || (string3 = bundleLLLLLZL20.getString("com.tiktok.opensdk.share.extra.PROXY_INTENT_ACTION")) == null) {
            linkShareIntentModel = null;
        } else {
            EnumC2198891B4d.Companion.getClass();
            EnumC2198891B4d enumC2198891B4d = EnumC2198891B4d.map.get(string3);
            linkShareIntentModel = enumC2198891B4d != null ? new LinkShareIntentModel(enumC2198891B4d, string2, stringArrayList, enumC21376718lB, string6, creativeInfo, string9, i3, null, string10, string11, backgroundColor, string12, z2, str, 256, null) : null;
        }
        this.LLILZ = linkShareIntentModel;
        if (linkShareIntentModel == null) {
            LLLLZI(C1B4F.LJIJ);
            close();
            return;
        }
        for (String str3 : linkShareIntentModel.mediaUriPaths) {
            if (str3 == null) {
                c1b4f = C1B4F.LJJ;
            } else {
                try {
                    if (checkUriPermission(UriProtector.parse(str3), Binder.getCallingPid(), Binder.getCallingUid(), 1) != 0) {
                        int i5 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Permission of media at ");
                        sbLIZ2.append(str3);
                        sbLIZ2.append(" is not granted. [total:");
                        sbLIZ2.append(linkShareIntentModel.mediaUriPaths.size());
                        sbLIZ2.append(']');
                        C1720106oR.LIZ("LinkShareIntentModel", C2188811AlT.LIZIZ(sbLIZ2));
                        c1b4f = C1B4F.LJIIJ;
                    }
                } catch (Exception e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    c1b4f = C1B4F.LJIIIIZZ;
                }
            }
        }
        C09O8 c09o8 = C2198931B4h.LIZ[linkShareIntentModel.option.ordinal()] == 1 ? C09O8.VIDEO : C09O8.IMAGE;
        Iterator<String> it2 = linkShareIntentModel.mediaUriPaths.iterator();
        while (true) {
            if (it2.hasNext()) {
                String next = it2.next();
                CreativeInfo creativeInfo2 = linkShareIntentModel.creativeInfo;
                Uri uri = UriProtector.parse(next);
                if (u.LJIJI("content", uri.getScheme(), true) || u.LJIJI("file", uri.getScheme(), true)) {
                    C2360509Mt.LIZ.getClass();
                    String strLJ = C2360509Mt.LJ(this, uri, creativeInfo2, false);
                    if (strLJ != null) {
                        next = strLJ;
                    }
                }
                if (C2471909mP.LJJIII(next, true, 4) ^ (c09o8 == C09O8.IMAGE)) {
                    c1b4f = C1B4F.LJIJI;
                    break;
                }
            } else {
                String str4 = linkShareIntentModel.backgroundImagePath;
                if (str4 != null) {
                    CreativeInfo creativeInfo3 = linkShareIntentModel.creativeInfo;
                    Uri uri2 = UriProtector.parse(str4);
                    if (u.LJIJI("content", uri2.getScheme(), true) || u.LJIJI("file", uri2.getScheme(), true)) {
                        C2360509Mt.LIZ.getClass();
                        String strLJ2 = C2360509Mt.LJ(this, uri2, creativeInfo3, false);
                        if (strLJ2 != null) {
                            str4 = strLJ2;
                        }
                    }
                    if (!C2471909mP.LJJIII(str4, true, 4)) {
                        c1b4f = C1B4F.LJIJJ;
                    }
                }
            }
        }
        if (c1b4f != null) {
            LLLLZI(c1b4f);
            close();
            return;
        }
        this.LLILLL = new C2198941B4i(linkShareIntentModel);
        switch (C2198911B4f.LIZ[linkShareIntentModel.option.ordinal()]) {
            case 1:
                C1402840mbq c1402840mbq3 = this.LL;
                if (c1402840mbq3 != null) {
                    C2198861B4a c2198861B4a = new C2198861B4a(this, linkShareIntentModel.mediaUriPaths, C09O8.VIDEO, c1402840mbq3, linkShareIntentModel.creativeInfo);
                    c2198861B4a.LJFF = new WeakReference<>(this);
                    c2198861B4a.LIZIZ(false, null, null);
                    return;
                }
                return;
            case 2:
                C1402840mbq c1402840mbq4 = this.LL;
                if (c1402840mbq4 != null) {
                    C2198861B4a c2198861B4a2 = new C2198861B4a(this, linkShareIntentModel.mediaUriPaths, C09O8.IMAGE, c1402840mbq4, linkShareIntentModel.creativeInfo);
                    c2198861B4a2.LJFF = new WeakReference<>(this);
                    c2198861B4a2.LIZIZ(false, null, null);
                    return;
                }
                return;
            case 3:
                if (!linkShareIntentModel.isShareToStoryOnly) {
                    if (TtopLinkShareConfigSettings.LIZ().linkShareEnabled > 0) {
                        LLLLZLL(linkShareIntentModel, null);
                        return;
                    } else {
                        LLLLZI(C1B4F.LJIL);
                        close();
                        return;
                    }
                }
                if (C0C64.LJIILLIIL().LJIJ(31744, 1, "enable_external_content_direct_share_to_story", true) != 1) {
                    LLLLZI(C1B4F.LJJI);
                    close();
                    return;
                }
                C1402840mbq c1402840mbq5 = this.LL;
                if (c1402840mbq5 != null && (linkShareSettings = c1402840mbq5.linkShareSettings) != null) {
                    linkShareSettings.setDisableRecommendMusic(true);
                }
                C19EG c19egLIZIZ = C1388190mED.LIZIZ(this);
                if (c19egLIZIZ == null || (c1402840mbq = this.LL) == null) {
                    return;
                }
                C2198861B4a c2198861B4a3 = new C2198861B4a(c19egLIZIZ, linkShareIntentModel.mediaUriPaths, C09O8.IMAGE, c1402840mbq, linkShareIntentModel.creativeInfo);
                if (c19egLIZIZ instanceof InterfaceC2198961B4k) {
                    c2198861B4a3.LJFF = new WeakReference<>(c19egLIZIZ);
                }
                LinkShareIntentModel linkShareIntentModel2 = linkShareIntentModel;
                c2198861B4a3.LIZ(linkShareIntentModel2, new AwS469S0200000_34(new C1B4X(c19egLIZIZ, linkShareIntentModel2, c1402840mbq, c2198861B4a3, null), this, 4));
                return;
            case 4:
            case 5:
                if (TtopLinkShareConfigSettings.LIZ().linkShareEnabled <= 0) {
                    LLLLZI(C1B4F.LJIL);
                    close();
                    return;
                }
                C2198941B4i c2198941B4i = this.LLILLL;
                if (c2198941B4i != null) {
                    AwS469S0200000_34 awS469S0200000_34 = new AwS469S0200000_34(this, linkShareIntentModel, 2);
                    String str5 = c2198941B4i.LIZ.link;
                    if (str5 == null) {
                        awS469S0200000_34.invoke(null, null);
                        return;
                    }
                    if (!C123100dR.LIZ(str5)) {
                        awS469S0200000_34.invoke(null, null);
                        return;
                    }
                    C1B57 c1b57 = (C1B57) c2198941B4i.LIZIZ.getValue();
                    LinkShareIntentModel linkShareIntentModel3 = c2198941B4i.LIZ;
                    String str6 = linkShareIntentModel3.entityUri;
                    String str7 = linkShareIntentModel3.musicMetadata;
                    c1b57.getClass();
                    try {
                        abstractC19484711KzLJIJJLI = ((OpenDspMusicListApi) c1b57.LIZIZ.getValue()).getMusicList(URLEncoder.encode(str5, "UTF-8"), str6, str7);
                        break;
                    } catch (Exception e4) {
                        TryCatchGuardChecker.doCheck(e4);
                        abstractC19484711KzLJIJJLI = AbstractC19484711Kz.LJIJJLI(new DspMusicListResponse(-100, null, null, null, null, null, 62, null));
                    }
                    abstractC19484711KzLJIJJLI.LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJJIIZ(new AfS178S0100000_9(awS469S0200000_34, 88), new AfS178S0100000_9(awS469S0200000_34, 89));
                    return;
                }
                return;
            case 6:
                if (TtopLinkShareConfigSettings.LIZ().linkShareEnabled <= 0) {
                    LLLLZI(C1B4F.LJIL);
                    close();
                    return;
                }
                C1260120ite.LIZIZ(new ARunnableS107S0100000_7(this, 281));
                C1402840mbq c1402840mbq6 = this.LL;
                if (c1402840mbq6 != null) {
                    C2198861B4a c2198861B4a4 = new C2198861B4a(this, linkShareIntentModel.mediaUriPaths, C09O8.IMAGE, c1402840mbq6, linkShareIntentModel.creativeInfo);
                    c2198861B4a4.LJFF = new WeakReference<>(this);
                    c2198861B4a4.LIZ(linkShareIntentModel, new AwS182S0400000_34(this, linkShareIntentModel, c1402840mbq6, c2198861B4a4, 2));
                    return;
                }
                return;
            default:
                throw new C1954807lC();
        }
    }

    public final void close() {
        C1260120ite.LIZIZ(new ARunnableS133S0100000_33(this, 71));
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        LLLLZI(C1B4F.LJIILL);
        close();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStop() {
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        try {
            getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    @Override // X.InterfaceC2198961B4k
    public final void LLL() {
        close();
    }

    public static Bundle LLLLLZL(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // X.InterfaceC2198961B4k
    public final void LLILLL(C1B4Q c1b4q) {
        C2198871B4b.LIZJ(c1b4q.LIZIZ, this.LLILZ);
        if (!c1b4q.LIZ) {
            close();
        }
    }

    public final void LLLLZI(C1B4F c1b4f) {
        C2198871B4b.LIZJ(c1b4f, this.LLILZ);
        C1402840mbq c1402840mbq = this.LL;
        if (c1402840mbq != null) {
            ((IShareRespSendService) ServiceManager.get().getService(IShareRespSendService.class)).LIZIZ(this, c1402840mbq, c1b4f);
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.share.linkshare.OpenLinkShareMainActivity", "onCreate", true);
        super.onCreate(bundle);
        LLLLZIL();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.share.linkshare.OpenLinkShareMainActivity", "onCreate", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        boolean z;
        super.setTheme(i);
        if (C299020Bno.LIZ() != 0) {
            boolean z2 = false;
            if (!C1697810uHb.LJIIJJI(Integer.valueOf(R.style.a9t), Integer.valueOf(R.style.a9u), Integer.valueOf(R.style.a9v), Integer.valueOf(R.style.a9s)).contains(Integer.valueOf(i))) {
                Integer numLIZ = C1308910kAL.LIZ(R.attr.g0c, this);
                if (numLIZ != null && numLIZ.intValue() == -1) {
                    z = true;
                } else {
                    z = false;
                }
                Integer numLIZ2 = C1308910kAL.LIZ(R.attr.g0d, this);
                if (numLIZ2 == null || numLIZ2.intValue() != 0) {
                    z2 = true;
                }
                if (z) {
                    getTheme().applyStyle(R.style.a9u, true);
                } else {
                    getTheme().applyStyle(R.style.a9t, true);
                }
                if (z2) {
                    getTheme().applyStyle(R.style.a9v, true);
                } else {
                    getTheme().applyStyle(R.style.a9s, true);
                }
            }
        }
        EnumC335920DEw enumC335920DEwLIZ = C335910DEv.LIZ();
        if (enumC335920DEwLIZ == EnumC335920DEw.V1) {
            getTheme().applyStyle(R.style.a9x, true);
        } else {
            if (enumC335920DEwLIZ != EnumC335920DEw.V2) {
                return;
            }
            getTheme().applyStyle(R.style.a9y, true);
        }
    }

    public final void LLLLZLL(LinkShareIntentModel linkShareIntentModel, Music music) {
        String idStr;
        C1402840mbq c1402840mbq = this.LL;
        if (c1402840mbq != null) {
            if (music != null && (idStr = music.getIdStr()) != null) {
                c1402840mbq.mMusicContent = new MusicContent(idStr, linkShareIntentModel.musicStartTimeMs);
                music.setMusicBeginTime(linkShareIntentModel.musicStartTimeMs);
            }
            LinkShareEntryFragment linkShareEntryFragment = new LinkShareEntryFragment();
            Bundle bundle = new Bundle();
            C786410Ut5.LJJIJL(bundle, "link_share_model", linkShareIntentModel);
            C786410Ut5.LJJIZ(bundle, "link_share_context", c1402840mbq);
            if (music != null) {
                C786410Ut5.LJJIZ(bundle, "link_share_music", music);
            }
            linkShareEntryFragment.setArguments(bundle);
            int iLJIIIIZZ = (int) (((double) C12ES.LJIIIIZZ(this)) * 0.9d);
            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
            c1390920mIc.LIZ.LLJJIJI = linkShareEntryFragment;
            c1390920mIc.LJIIIIZZ(1);
            TuxSheet tuxSheet = c1390920mIc.LIZ;
            tuxSheet.LLJJL = iLJIIIIZZ;
            tuxSheet.LLJJIJIIJIL = true;
            tuxSheet.LLJLLL = false;
            C0OM1 c0om1 = new C0OM1();
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
            c1251150ifB.LIZJ(new AwS578S0100000_34(this, 69));
            c0om1.LIZIZ(c1251150ifB);
            c0om1.LIZLLL = false;
            TuxSheet tuxSheet2 = c1390920mIc.LIZ;
            tuxSheet2.LLJJIJIL = c0om1;
            tuxSheet2.LLJJJ = null;
            tuxSheet2.LLILLL = false;
            tuxSheet2.LLJLLIL = true;
            tuxSheet2.LLJLILLLLZIIL = false;
            tuxSheet2.LLILLJJLI = new C1D15(this, 0);
            tuxSheet2.LL = new DialogInterfaceOnCancelListenerC2249031D0z(this, 0);
            this.LLILLJJLI = tuxSheet2;
            tuxSheet2.show(getSupportFragmentManager(), "TTOP_LinkShare");
        }
    }

    @Override // X.InterfaceC586170Myt
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        int i3;
        if (user != null) {
            LLLLZIL();
            ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJI(this);
            return;
        }
        Activity[] activityStack = ActivityStack.getActivityStack();
        int length = activityStack.length;
        int i4 = 0;
        while (true) {
            i3 = -1;
            if (i4 < length) {
                if (activityStack[i4] instanceof OpenLinkShareMainActivity) {
                    break;
                } else {
                    i4++;
                }
            } else {
                i4 = -1;
                break;
            }
        }
        Activity[] activityStack2 = ActivityStack.getActivityStack();
        int length2 = activityStack2.length - 1;
        if (length2 >= 0) {
            while (true) {
                int i5 = length2 - 1;
                if (Intrinsics.LJFF(activityStack2[length2].getClass().getSimpleName(), "AuthorizeActivity")) {
                    i3 = length2;
                    break;
                } else if (i5 < 0) {
                    break;
                } else {
                    length2 = i5;
                }
            }
        }
        if (i4 >= 0 && i4 < i3) {
            return;
        }
        ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJI(this);
        close();
        LLLLZI(C1B4F.LJIIIZ);
    }
}
