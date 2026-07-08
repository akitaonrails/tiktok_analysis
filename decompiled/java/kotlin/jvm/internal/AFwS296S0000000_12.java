package kotlin.jvm.internal;

import X.C098200Yq;
import X.C09AY;
import X.C0IJT;
import X.C0JG7;
import X.C0UKC;
import X.C1049250dPX;
import X.C1061730djf;
import X.C1107580evc;
import X.C1161920gLG;
import X.C1389890mGx;
import X.C13LE;
import X.C1529590puH;
import X.C1537060q6K;
import X.C1548820qPI;
import X.C189200o6;
import X.C20441214yg;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C2821017j;
import X.C291001Au;
import X.C397901gf;
import X.C474500IjA;
import X.C747440TTq;
import X.C782660Un2;
import X.C811103Ev;
import X.InterfaceC1105930esx;
import android.net.Uri;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.sheet.LiveSheetHostFragment;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.broadcast.preview.widget.revision.PreviewBannerWidget;
import com.bytedance.android.livesdk.dataChannel.RoomUserChannel;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes13.dex */
public class AFwS296S0000000_12 extends C09AY implements Function2 {
    public static final /* synthetic */ AtomicReferenceArray arr$ = new AtomicReferenceArray(24);
    public final int $t;

    public static AFwS296S0000000_12 get$arr$(int i) {
        AFwS296S0000000_12 aFwS296S0000000_12 = (AFwS296S0000000_12) arr$.get(i);
        if (aFwS296S0000000_12 != null) {
            return aFwS296S0000000_12;
        }
        arr$.compareAndSet(i, null, new AFwS296S0000000_12(i));
        return (AFwS296S0000000_12) arr$.get(i);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            case 5:
                return invoke$5(this, obj, obj2);
            case 6:
                return invoke$6(this, obj, obj2);
            case 7:
                return invoke$7(this, obj, obj2);
            case 8:
                return invoke$8(this, obj, obj2);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj, obj2);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj, obj2);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj, obj2);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj, obj2);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj, obj2);
            case 14:
                return invoke$14(this, obj, obj2);
            case 15:
                return invoke$15(this, obj, obj2);
            case 16:
                return invoke$16(this, obj, obj2);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this, obj, obj2);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this, obj, obj2);
            case 19:
                return invoke$19(this, obj, obj2);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this, obj, obj2);
            case 21:
                return invoke$21(this, obj, obj2);
            case 22:
                return invoke$22(this, obj, obj2);
            case 23:
                return invoke$23(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFwS296S0000000_12(int i) {
        super(2);
        this.$t = i;
    }

    public static final Object invoke$0(AFwS296S0000000_12 aFwS296S0000000_12, Object obj, Object obj2) {
        if (((Boolean) obj).booleanValue()) {
            LiveSheetHostFragment.LLIZLLLIL = true;
            LiveDialogFragment.Companion.getClass();
            LiveDialogFragment.disableAnim = true;
            C20441214yg.LIZIZ("LiveAnchorFunctionDowngrade", "DIALOG_ANIMATION_BLOCK is block");
        } else {
            LiveSheetHostFragment.LLIZLLLIL = false;
            LiveDialogFragment.Companion.getClass();
            LiveDialogFragment.disableAnim = false;
            C20441214yg.LIZIZ("LiveAnchorFunctionDowngrade", "DIALOG_ANIMATION_BLOCK is not block");
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AFwS296S0000000_12 aFwS296S0000000_12, Object obj, Object obj2) {
        C747440TTq.LIZ((TextView) obj, ((Boolean) obj2).booleanValue(), null, null, 6);
        return Unit.LIZ;
    }

    public static final Object invoke$10(AFwS296S0000000_12 aFwS296S0000000_12, Object obj, Object obj2) {
        return Boolean.TRUE;
    }

    public static final Object invoke$11(AFwS296S0000000_12 aFwS296S0000000_12, Object obj, Object obj2) {
        int iIntValue = ((Number) obj).intValue();
        Integer num = (Integer) obj2;
        if (num != null) {
            iIntValue = num.intValue();
        }
        PreviewBannerWidget previewBannerWidget = (PreviewBannerWidget) C0UKC.LJFF(C13LE.LIZ(PreviewBannerWidget.class));
        if (previewBannerWidget != null) {
            previewBannerWidget.I1(iIntValue);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$12(AFwS296S0000000_12 aFwS296S0000000_12, Object obj, Object obj2) {
        return Boolean.valueOf(Intrinsics.LJFF(C1107580evc.LIZLLL((String) obj), C1107580evc.LIZLLL((String) obj2)));
    }

    public static final Object invoke$13(AFwS296S0000000_12 aFwS296S0000000_12, Object obj, Object obj2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(0, "prompt_type");
        C20684815ws.LJIILLIIL("click_ttadfree_reminder", c2344009Gk.LIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$14(AFwS296S0000000_12 aFwS296S0000000_12, Object obj, Object obj2) {
        WeakReference<InterfaceC1105930esx> weakReference;
        InterfaceC1105930esx interfaceC1105930esx;
        String str = (String) obj2;
        boolean z = C782660Un2.LIZ;
        String strLIZLLL = C1107580evc.LIZLLL((String) obj);
        boolean zLJJIIZI = false;
        if (strLIZLLL != null) {
            zLJJIIZI = a0.LJJIIZI(str, strLIZLLL, false);
            C1537060q6K c1537060q6K = C1529590puH.LIZ;
            if (C1537060q6K.LIZ("live_lop_pns_fe_age", C782660Un2.LIZLLL)) {
                if (zLJJIIZI && (weakReference = C782660Un2.LJ) != null && (interfaceC1105930esx = weakReference.get()) != null && interfaceC1105930esx.LIZIZ()) {
                    C782660Un2.LJ = null;
                    if (!C782660Un2.LIZIZ) {
                        C782660Un2.LIZIZ = true;
                        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_lop_dob_page_preload_success");
                        c474500IjALIZ.LJJII(C782660Un2.LIZJ, "live_type");
                        c474500IjALIZ.LIZ();
                    }
                }
            } else {
                C782660Un2.LJ = null;
            }
        }
        return Boolean.valueOf(zLJJIIZI);
    }

    public static final Object invoke$15(AFwS296S0000000_12 aFwS296S0000000_12, Object obj, Object obj2) {
        String str = (String) obj2;
        boolean z = C782660Un2.LIZ;
        String strLIZLLL = C1107580evc.LIZLLL((String) obj);
        String str2 = "https://inapp.tiktokv.com/tpp/inapp/age-verification/dob.html";
        if (strLIZLLL == null) {
            strLIZLLL = "https://inapp.tiktokv.com/tpp/inapp/age-verification/dob.html";
        }
        String strLIZLLL2 = C1107580evc.LIZLLL(str);
        if (strLIZLLL2 != null) {
            str2 = strLIZLLL2;
        }
        return Boolean.valueOf(Intrinsics.LJFF(strLIZLLL, str2));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* bridge */ /* synthetic */ java.lang.Object invoke$16(kotlin.jvm.internal.AFwS296S0000000_12 r0, java.lang.Object r1, java.lang.Object r2) {
        /*
            java.util.List r2 = (java.util.List) r2
            if (r1 == 0) goto L12
            boolean r0 = r2.isEmpty()
            r1 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L12
        Ld:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        L12:
            r1 = 0
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AFwS296S0000000_12.invoke$16(kotlin.jvm.internal.AFwS296S0000000_12, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$17(AFwS296S0000000_12 aFwS296S0000000_12, Object obj, Object obj2) {
        Object c098200Yq;
        Object c098200Yq2;
        Uri uriLIZ;
        String str = (String) obj2;
        try {
            c098200Yq = UriProtector.parse((String) obj);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Uri uriLIZ2 = null;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Uri uri = (Uri) c098200Yq;
        try {
            c098200Yq2 = UriProtector.parse(str);
            C189200o6.m2constructorimpl(c098200Yq2);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq2 = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq2);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq2)) {
            c098200Yq2 = null;
        }
        Uri uri2 = (Uri) c098200Yq2;
        if (uri != null) {
            C1049250dPX.LIZ.getClass();
            uriLIZ = C2821017j.LIZ(uri, C1049250dPX.LIZJ);
        } else {
            uriLIZ = null;
        }
        if (uri2 != null) {
            C1049250dPX.LIZ.getClass();
            uriLIZ2 = C2821017j.LIZ(uri2, C1049250dPX.LIZJ);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tempSchema1 = ");
        sbLIZ.append(uriLIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        C811103Ev.LIZ("PromoteAdHybridDelegate");
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("tempSchema2 = ");
        sbLIZ2.append(uriLIZ2);
        C2188811AlT.LIZIZ(sbLIZ2);
        C811103Ev.LIZ("PromoteAdHybridDelegate");
        return Boolean.valueOf(Intrinsics.LJFF(uriLIZ, uriLIZ2));
    }

    public static final /* bridge */ /* synthetic */ Object invoke$18(AFwS296S0000000_12 aFwS296S0000000_12, Object obj, Object obj2) {
        ((Number) obj).longValue();
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$19(kotlin.jvm.internal.AFwS296S0000000_12 r1, java.lang.Object r2, java.lang.Object r3) {
        /*
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r1 = r3.booleanValue()
            r0 = 2131100543(0x7f06037f, float:1.781347E38)
            if (r1 == 0) goto L1c
            java.lang.Integer r0 = X.C1308910kAL.LIZJ(r0, r2)
            if (r0 == 0) goto L27
            int r0 = r0.intValue()
        L17:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L1c:
            java.lang.Integer r0 = X.C1308910kAL.LIZJ(r0, r2)
            if (r0 == 0) goto L27
            int r0 = r0.intValue()
            goto L17
        L27:
            r0 = 0
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AFwS296S0000000_12.invoke$19(kotlin.jvm.internal.AFwS296S0000000_12, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$2(AFwS296S0000000_12 aFwS296S0000000_12, Object obj, Object obj2) {
        C20441214yg.LJ("LiveGoalEffect", "download gift icon failed!");
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$20(kotlin.jvm.internal.AFwS296S0000000_12 r1, java.lang.Object r2, java.lang.Object r3) {
        /*
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r1 = r3.booleanValue()
            r0 = 2131100540(0x7f06037c, float:1.7813464E38)
            if (r1 == 0) goto L1c
            java.lang.Integer r0 = X.C1308910kAL.LIZJ(r0, r2)
            if (r0 == 0) goto L27
            int r0 = r0.intValue()
        L17:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L1c:
            java.lang.Integer r0 = X.C1308910kAL.LIZJ(r0, r2)
            if (r0 == 0) goto L27
            int r0 = r0.intValue()
            goto L17
        L27:
            r0 = 0
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AFwS296S0000000_12.invoke$20(kotlin.jvm.internal.AFwS296S0000000_12, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* bridge */ /* synthetic */ java.lang.Object invoke$21(kotlin.jvm.internal.AFwS296S0000000_12 r0, java.lang.Object r1, java.lang.Object r2) {
        /*
            java.util.List r2 = (java.util.List) r2
            if (r1 == 0) goto L12
            boolean r0 = r2.isEmpty()
            r1 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L12
        Ld:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        L12:
            r1 = 0
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AFwS296S0000000_12.invoke$21(kotlin.jvm.internal.AFwS296S0000000_12, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* bridge */ /* synthetic */ java.lang.Object invoke$22(kotlin.jvm.internal.AFwS296S0000000_12 r0, java.lang.Object r1, java.lang.Object r2) {
        /*
            java.util.List r2 = (java.util.List) r2
            if (r1 == 0) goto L12
            boolean r0 = r2.isEmpty()
            r1 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L12
        Ld:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        L12:
            r1 = 0
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AFwS296S0000000_12.invoke$22(kotlin.jvm.internal.AFwS296S0000000_12, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$23(AFwS296S0000000_12 aFwS296S0000000_12, Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("fullscreen", Boolean.valueOf(zBooleanValue));
        linkedHashMap.put("showFavoriteGuide", Boolean.valueOf(Intrinsics.LJFF(obj, Boolean.TRUE)));
        long jCurrentTimeMillis = System.currentTimeMillis();
        new C1061730djf();
        C1548820qPI.LIZIZ(new C397901gf(jCurrentTimeMillis, C1061730djf.LIZLLL(linkedHashMap), "PDP_SHOW_FAVORITE_POPUP"));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AFwS296S0000000_12 aFwS296S0000000_12, Object obj, Object obj2) {
        C20441214yg.LJ("LiveGoalEffect", "download gift icon failed!");
        return Unit.LIZ;
    }

    public static final Object invoke$4(AFwS296S0000000_12 aFwS296S0000000_12, Object obj, Object obj2) {
        String str;
        C474500IjA c474500IjA = (C474500IjA) obj2;
        User user = (User) ((DataChannel) obj).gg0(RoomUserChannel.class);
        if (user != null) {
            if (((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).ND(user) == C0JG7.GUEST_AUDIENCE) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            c474500IjA.LJJII(str, "is_guest");
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AFwS296S0000000_12 aFwS296S0000000_12, Object obj, Object obj2) {
        String str;
        C474500IjA c474500IjA = (C474500IjA) obj2;
        User user = (User) ((DataChannel) obj).gg0(RoomUserChannel.class);
        if (user != null) {
            if (((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).ND(user) == C0JG7.GUEST_AUDIENCE) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            c474500IjA.LJJII(str, "is_guest");
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AFwS296S0000000_12 aFwS296S0000000_12, Object obj, Object obj2) {
        ((AccessibilityNodeInfoCompat) obj2).setClassName(Button.class.getName());
        return Unit.LIZ;
    }

    public static final Object invoke$7(AFwS296S0000000_12 aFwS296S0000000_12, Object obj, Object obj2) {
        String str;
        UIAssem uIAssem = (UIAssem) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null && (str = (String) c291001Au.LIZ()) != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(uIAssem.LJJIJL());
            c1389890mGx.LJIIJ(str);
            c1389890mGx.LJIIJJI();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AFwS296S0000000_12 aFwS296S0000000_12, Object obj, Object obj2) {
        ((AccessibilityNodeInfoCompat) obj2).setClassName(Button.class.getName());
        return Unit.LIZ;
    }

    public static final Object invoke$9(AFwS296S0000000_12 aFwS296S0000000_12, Object obj, Object obj2) {
        ((AccessibilityNodeInfoCompat) obj2).setClassName(Button.class.getName());
        return Unit.LIZ;
    }
}
