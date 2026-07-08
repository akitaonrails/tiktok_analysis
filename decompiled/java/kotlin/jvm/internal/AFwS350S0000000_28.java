package kotlin.jvm.internal;

import X.C09AY;
import X.C104L;
import X.C107H;
import X.C1537480q70;
import X.C1537900q7g;
import X.C1541950qED;
import X.InterfaceC1631620sYq;
import android.content.Context;
import android.view.View;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.notice.api.ab.AddOptionForGuidanceExp;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.profile.business.live.notificationpost.PostNotificationSettingsAdapter;
import com.tts.oecverify.BdTuring;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Unit;

/* JADX INFO: loaded from: classes29.dex */
public class AFwS350S0000000_28 extends C09AY implements InterfaceC1631620sYq {
    public static final /* synthetic */ AtomicReferenceArray arr$ = new AtomicReferenceArray(13);
    public final int $t;

    public static AFwS350S0000000_28 get$arr$(int i) {
        AFwS350S0000000_28 aFwS350S0000000_28 = (AFwS350S0000000_28) arr$.get(i);
        if (aFwS350S0000000_28 != null) {
            return aFwS350S0000000_28;
        }
        arr$.compareAndSet(i, null, new AFwS350S0000000_28(i));
        return (AFwS350S0000000_28) arr$.get(i);
    }

    @Override // X.InterfaceC1631620sYq
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            case 2:
                return invoke$2(this, obj, obj2, obj3);
            case 3:
                return invoke$3(this, obj, obj2, obj3);
            case 4:
                return invoke$4(this, obj, obj2, obj3);
            case 5:
                return invoke$5(this, obj, obj2, obj3);
            case 6:
                return invoke$6(this, obj, obj2, obj3);
            case 7:
                return invoke$7(this, obj, obj2, obj3);
            case 8:
                return invoke$8(this, obj, obj2, obj3);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj, obj2, obj3);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj, obj2, obj3);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj, obj2, obj3);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFwS350S0000000_28(int i) {
        super(3);
        this.$t = i;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$0(AFwS350S0000000_28 aFwS350S0000000_28, Object obj, Object obj2, Object obj3) {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AFwS350S0000000_28 r12, java.lang.Object r13, java.lang.Object r14, java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AFwS350S0000000_28.invoke$1(kotlin.jvm.internal.AFwS350S0000000_28, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$10(AFwS350S0000000_28 aFwS350S0000000_28, Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        C107H.LIZ(true);
        SmartRouter.buildRoute(((View) obj2).getContext(), C104L.LIZIZ("content_reuse_permission")).open();
        return Unit.LIZ;
    }

    public static final Object invoke$11(AFwS350S0000000_28 aFwS350S0000000_28, Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        SmartRouter.buildRoute(((View) obj2).getContext(), C104L.LIZIZ("comment_permission")).open();
        return Unit.LIZ;
    }

    public static final Object invoke$12(AFwS350S0000000_28 aFwS350S0000000_28, Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        SmartRouter.buildRoute(((View) obj2).getContext(), C104L.LIZIZ("direct_message_sheet")).open();
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$2(kotlin.jvm.internal.AFwS350S0000000_28 r5, java.lang.Object r6, java.lang.Object r7, java.lang.Object r8) {
        /*
            X.109T r6 = (X.C109T) r6
            android.view.View r7 = (android.view.View) r7
            java.lang.Number r8 = (java.lang.Number) r8
            int r5 = r8.intValue()
            android.content.Context r1 = r7.getContext()
            r4 = 1
            if (r5 == r4) goto L49
            X.104w r0 = X.C191880104w.LIZ
            r0.getClass()
            java.lang.String r3 = "advertiser_update_dm_consent"
            boolean r0 = X.C191880104w.LJIILIIL(r3)
            if (r0 == 0) goto L49
            X.0mTM r2 = new X.0mTM
            r2.<init>(r1)
            r0 = 2131830661(0x7f112785, float:1.9294326E38)
            r2.LJFF(r0)
            r0 = 2131830660(0x7f112784, float:1.9294324E38)
            r2.LIZ(r0)
            kotlin.jvm.internal.AwS109S0201000_28 r1 = new kotlin.jvm.internal.AwS109S0201000_28
            r0 = 5
            r1.<init>(r6, r7, r5, r0)
            X.C985403tE.LIZ(r2, r1)
            X.0mTF r0 = new X.0mTF
            r0.<init>(r2)
            r0.LIZLLL()
            r0 = 2
            X.C191880104w.LJIJ(r0, r3)
        L44:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            return r0
        L49:
            r4 = 0
            goto L44
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AFwS350S0000000_28.invoke$2(kotlin.jvm.internal.AFwS350S0000000_28, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$3(kotlin.jvm.internal.AFwS350S0000000_28 r10, java.lang.Object r11, java.lang.Object r12, java.lang.Object r13) {
        /*
            r7 = r12
            X.109T r11 = (X.C109T) r11
            android.view.View r7 = (android.view.View) r7
            java.lang.Number r13 = (java.lang.Number) r13
            int r3 = r13.intValue()
            X.104w r0 = X.C191880104w.LIZ
            r0.getClass()
            com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2 r0 = X.C191880104w.LJIIL()
            java.lang.String r1 = "dm_setting_others"
            r6 = 0
            if (r0 == 0) goto L91
            java.lang.Integer r0 = r0.LIZ(r1)
        L1d:
            X.106i r5 = X.C191918106i.LIZ
            r5.getClass()
            X.C191918106i.LIZLLL(r3, r0, r1)
            if (r0 == 0) goto L8f
            int r0 = r0.intValue()
            r4 = 3
            if (r0 != r4) goto L8f
            r0 = 2
            if (r3 != r0) goto L8f
            com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2 r1 = X.C191880104w.LJIIL()
            if (r1 == 0) goto L8d
            java.lang.String r0 = "dm_setting_potential_connection"
            java.lang.Integer r2 = r1.LIZ(r0)
        L3d:
            com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2 r1 = X.C191880104w.LJIIL()
            if (r1 == 0) goto L49
            java.lang.String r0 = "dm_setting_friends"
            java.lang.Integer r6 = r1.LIZ(r0)
        L49:
            if (r2 == 0) goto L8f
            int r0 = r2.intValue()
            if (r0 != r4) goto L8f
            if (r6 == 0) goto L75
            int r0 = r6.intValue()
            if (r0 != r4) goto L75
            java.lang.String r10 = "others_on_tiktok"
            kotlin.jvm.internal.AwS149S0201000_28 r13 = new kotlin.jvm.internal.AwS149S0201000_28
            r0 = 7
            r13.<init>(r11, r7, r3, r0)
            r11 = 0
            r5.getClass()
            r8 = 2131831734(0x7f112bb6, float:1.9296502E38)
            r9 = 2131831733(0x7f112bb5, float:1.92965E38)
            r12 = r11
            X.C191918106i.LJ(r7, r8, r9, r10, r11, r12, r13)
        L6f:
            r0 = 1
        L70:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L75:
            java.lang.String r10 = "others_on_tiktok"
            kotlin.jvm.internal.AwS149S0201000_28 r13 = new kotlin.jvm.internal.AwS149S0201000_28
            r0 = 8
            r13.<init>(r11, r7, r3, r0)
            r11 = 0
            r5.getClass()
            r8 = 2131831738(0x7f112bba, float:1.929651E38)
            r9 = 2131831737(0x7f112bb9, float:1.9296508E38)
            r12 = r11
            X.C191918106i.LJ(r7, r8, r9, r10, r11, r12, r13)
            goto L6f
        L8d:
            r2 = r6
            goto L3d
        L8f:
            r0 = 0
            goto L70
        L91:
            r0 = r6
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AFwS350S0000000_28.invoke$3(kotlin.jvm.internal.AFwS350S0000000_28, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$4(kotlin.jvm.internal.AFwS350S0000000_28 r10, java.lang.Object r11, java.lang.Object r12, java.lang.Object r13) {
        /*
            r6 = r12
            X.109T r11 = (X.C109T) r11
            android.view.View r6 = (android.view.View) r6
            java.lang.Number r13 = (java.lang.Number) r13
            int r2 = r13.intValue()
            X.104w r0 = X.C191880104w.LIZ
            r0.getClass()
            com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2 r0 = X.C191880104w.LJIIL()
            java.lang.String r1 = "dm_setting_friends"
            r5 = 0
            if (r0 == 0) goto La4
            java.lang.Integer r0 = r0.LIZ(r1)
        L1d:
            X.106i r4 = X.C191918106i.LIZ
            r4.getClass()
            X.C191918106i.LIZLLL(r2, r0, r1)
            if (r0 == 0) goto La2
            int r0 = r0.intValue()
            r10 = 1
            if (r0 != r10) goto La2
            r0 = 3
            if (r2 != r0) goto La2
            com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2 r1 = X.C191880104w.LJIIL()
            if (r1 == 0) goto La0
            java.lang.String r0 = "dm_setting_potential_connection"
            java.lang.Integer r3 = r1.LIZ(r0)
        L3d:
            com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2 r1 = X.C191880104w.LJIIL()
            if (r1 == 0) goto L49
            java.lang.String r0 = "dm_setting_others"
            java.lang.Integer r5 = r1.LIZ(r0)
        L49:
            if (r3 == 0) goto L8c
            int r0 = r3.intValue()
            r1 = 2
            if (r0 != r1) goto L8c
            if (r5 == 0) goto L75
            int r0 = r5.intValue()
            if (r0 != r1) goto L75
            java.lang.String r9 = "friends"
            kotlin.jvm.internal.AwS149S0201000_28 r12 = new kotlin.jvm.internal.AwS149S0201000_28
            r0 = 9
            r12.<init>(r11, r6, r2, r0)
            r11 = 0
            r4.getClass()
            r7 = 2131831341(0x7f112a2d, float:1.9295705E38)
            r8 = 2131831340(0x7f112a2c, float:1.9295703E38)
            X.C191918106i.LJ(r6, r7, r8, r9, r10, r11, r12)
        L70:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)
            return r0
        L75:
            java.lang.String r9 = "friends"
            kotlin.jvm.internal.AwS149S0201000_28 r12 = new kotlin.jvm.internal.AwS149S0201000_28
            r0 = 10
            r12.<init>(r11, r6, r2, r0)
            r11 = 0
            r4.getClass()
            r7 = 2131831343(0x7f112a2f, float:1.9295709E38)
            r8 = 2131831342(0x7f112a2e, float:1.9295707E38)
            X.C191918106i.LJ(r6, r7, r8, r9, r10, r11, r12)
            goto L70
        L8c:
            r7 = 2131831339(0x7f112a2b, float:1.92957E38)
            r8 = 2131831338(0x7f112a2a, float:1.9295699E38)
            java.lang.String r9 = "friends"
            kotlin.jvm.internal.AwS149S0201000_28 r12 = new kotlin.jvm.internal.AwS149S0201000_28
            r0 = 11
            r12.<init>(r11, r6, r2, r0)
            r11 = r10
            X.C191918106i.LJ(r6, r7, r8, r9, r10, r11, r12)
            goto L70
        La0:
            r3 = r5
            goto L3d
        La2:
            r10 = 0
            goto L70
        La4:
            r0 = r5
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AFwS350S0000000_28.invoke$4(kotlin.jvm.internal.AFwS350S0000000_28, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$5(AFwS350S0000000_28 aFwS350S0000000_28, Object obj, Object obj2, Object obj3) {
        PostNotificationSettingsAdapter.OptionsItemHolder optionsItemHolder = (PostNotificationSettingsAdapter.OptionsItemHolder) obj;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
        PostNotificationSettingsAdapter.LLILZLL = zBooleanValue2;
        PostNotificationSettingsAdapter.LLILZIL = zBooleanValue;
        boolean z = false;
        if (zBooleanValue) {
            if (AddOptionForGuidanceExp.LJFF && zBooleanValue2) {
                User user = optionsItemHolder.LLJJIJIL;
                if (user != null && user.getFollowStatus() == 2) {
                    z = true;
                }
                optionsItemHolder.X5(z);
            } else {
                optionsItemHolder.X5(true);
            }
        } else {
            optionsItemHolder.X5(false);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AFwS350S0000000_28 aFwS350S0000000_28, Object obj, Object obj2, Object obj3) {
        Context context = (Context) obj;
        String str = (String) obj2;
        C1537480q70 c1537480q70 = (C1537480q70) obj3;
        if (c1537480q70 instanceof SparkContext) {
            C1537900q7g c1537900q7g = C1541950qED.LIZJ;
            SparkContext sparkContext = (SparkContext) c1537480q70;
            sparkContext.usePreload = true;
            c1537900q7g.getClass();
            return new C1541950qED(context, sparkContext).LIZ(false);
        }
        C1537900q7g c1537900q7g2 = C1541950qED.LIZJ;
        SparkContext sparkContext2 = new SparkContext();
        sparkContext2.LJJLIIJ(str);
        sparkContext2.usePreload = true;
        c1537900q7g2.getClass();
        return new C1541950qED(context, sparkContext2).LIZ(false);
    }

    public static final Object invoke$7(AFwS350S0000000_28 aFwS350S0000000_28, Object obj, Object obj2, Object obj3) {
        Context context = (Context) obj;
        String str = (String) obj2;
        C1537480q70 c1537480q70 = (C1537480q70) obj3;
        if (c1537480q70 instanceof SparkContext) {
            C1537900q7g c1537900q7g = C1541950qED.LIZJ;
            SparkContext sparkContext = (SparkContext) c1537480q70;
            sparkContext.usePreload = true;
            c1537900q7g.getClass();
            return new C1541950qED(context, sparkContext).LIZ(false);
        }
        C1537900q7g c1537900q7g2 = C1541950qED.LIZJ;
        SparkContext sparkContext2 = new SparkContext();
        sparkContext2.LJJLIIJ(str);
        sparkContext2.usePreload = true;
        c1537900q7g2.getClass();
        return new C1541950qED(context, sparkContext2).LIZ(false);
    }

    public static final Object invoke$8(AFwS350S0000000_28 aFwS350S0000000_28, Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        SmartRouter.buildRoute(((View) obj2).getContext(), C104L.LIZIZ("duet_sheet")).open();
        return Unit.LIZ;
    }

    public static final Object invoke$9(AFwS350S0000000_28 aFwS350S0000000_28, Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        SmartRouter.buildRoute(((View) obj2).getContext(), C104L.LIZIZ("stitch_sheet")).open();
        return Unit.LIZ;
    }
}
