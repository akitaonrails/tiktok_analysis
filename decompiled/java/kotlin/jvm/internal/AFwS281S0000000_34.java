package kotlin.jvm.internal;

import X.AbstractDialogInterfaceC1397690mTX;
import X.C09AY;
import X.C1023640ckE;
import X.C1043500dGG;
import X.C128Y;
import X.C19EG;
import X.C1BH3;
import X.C1BVD;
import X.C1BYV;
import X.C20684815ws;
import X.C2238341CjA;
import X.C2238811Cjv;
import X.C2238891Ck3;
import X.C2245781CvA;
import X.C2246381Cw8;
import X.C2248581Czg;
import X.C2344009Gk;
import X.C291001Au;
import X.C475600Ikw;
import X.ConditionC2216081BoM;
import X.EnumC2246361Cw6;
import X.InterfaceC2198731B3n;
import X.InterfaceC2214741BmC;
import X.InterfaceC2238351CjB;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.ss.android.ugc.aweme.authorize.BaseI18nAuthorizedFragment;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.data.model.AutoReplyStatusStruct;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.edit.EditEffectModel;
import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.openauthorize.entity.OAuthScope;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.bduploader.BDImageXUploader;
import com.ss.bduploader.BDImageXUploaderBase;
import com.ss.bduploader.BDVideoUploader;
import com.ss.bduploader.BDVideoUploaderBase;
import com.tts.oecverify.BdTuring;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes35.dex */
public class AFwS281S0000000_34 extends C09AY implements Function1 {
    public static final /* synthetic */ AtomicReferenceArray arr$ = new AtomicReferenceArray(76);
    public final int $t;

    public static AFwS281S0000000_34 get$arr$(int i) {
        AFwS281S0000000_34 aFwS281S0000000_34 = (AFwS281S0000000_34) arr$.get(i);
        if (aFwS281S0000000_34 != null) {
            return aFwS281S0000000_34;
        }
        arr$.compareAndSet(i, null, new AFwS281S0000000_34(i));
        return (AFwS281S0000000_34) arr$.get(i);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj);
            case 14:
                return invoke$14(this, obj);
            case 15:
                return invoke$15(this, obj);
            case 16:
                return invoke$16(this, obj);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this, obj);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this, obj);
            case 19:
                return invoke$19(this, obj);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this, obj);
            case 21:
                return invoke$21(this, obj);
            case 22:
                return invoke$22(this, obj);
            case 23:
                return invoke$23(this, obj);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return invoke$24(this, obj);
            case 25:
                return invoke$25(this, obj);
            case 26:
                return invoke$26(this, obj);
            case 27:
                return invoke$27(this, obj);
            case 28:
                return invoke$28(this, obj);
            case 29:
                return invoke$29(this, obj);
            case 30:
                return invoke$30(this, obj);
            case 31:
                return invoke$31(this, obj);
            case 32:
                return invoke$32(this, obj);
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                return invoke$33(this, obj);
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                return invoke$34(this, obj);
            case 35:
                return invoke$35(this, obj);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                return invoke$36(this, obj);
            case 37:
                return invoke$37(this, obj);
            case 38:
                return invoke$38(this, obj);
            case 39:
                return invoke$39(this, obj);
            case 40:
                return invoke$40(this, obj);
            case 41:
                return invoke$41(this, obj);
            case 42:
                return invoke$42(this, obj);
            case 43:
                return invoke$43(this, obj);
            case 44:
                return invoke$44(this, obj);
            case 45:
                return invoke$45(this, obj);
            case 46:
                return invoke$46(this, obj);
            case 47:
                return invoke$47(this, obj);
            case 48:
                return invoke$48(this, obj);
            case 49:
                return invoke$49(this, obj);
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                return invoke$50(this, obj);
            case 51:
                return invoke$51(this, obj);
            case 52:
                return invoke$52(this, obj);
            case 53:
                return invoke$53(this, obj);
            case 54:
                return invoke$54(this, obj);
            case 55:
                return invoke$55(this, obj);
            case 56:
                return invoke$56(this, obj);
            case 57:
                return invoke$57(this, obj);
            case 58:
                return invoke$58(this, obj);
            case 59:
                return invoke$59(this, obj);
            case 60:
                return invoke$60(this, obj);
            case 61:
                return invoke$61(this, obj);
            case BaseNotice.CREATOR /* 62 */:
                return invoke$62(this, obj);
            case 63:
                return invoke$63(this, obj);
            case 64:
                return invoke$64(this, obj);
            case 65:
                return invoke$65(this, obj);
            case 66:
                return invoke$66(this, obj);
            case 67:
                return invoke$67(this, obj);
            case 68:
                return invoke$68(this, obj);
            case 69:
                return invoke$69(this, obj);
            case 70:
                return invoke$70(this, obj);
            case 71:
                return invoke$71(this, obj);
            case DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE /* 72 */:
                return invoke$72(this, obj);
            case 73:
                return invoke$73(this, obj);
            case 74:
                return invoke$74(this, obj);
            case 75:
                return invoke$75(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFwS281S0000000_34(int i) {
        super(1);
        this.$t = i;
    }

    public static final Object invoke$0(AFwS281S0000000_34 aFwS281S0000000_34, Object obj) {
        int size;
        List list = (List) obj;
        if (list != null) {
            size = list.size();
        } else {
            size = 0;
        }
        return Integer.valueOf(size);
    }

    public static final Object invoke$1(AFwS281S0000000_34 aFwS281S0000000_34, Object obj) {
        return ((OAuthScope) obj).scopeName;
    }

    public static final Object invoke$12(AFwS281S0000000_34 aFwS281S0000000_34, Object obj) {
        return C2245781CvA.LIZ((C2245781CvA) obj, null, null, null, null, null, new C291001Au(Unit.LIZ), null, 95);
    }

    public static final Object invoke$13(AFwS281S0000000_34 aFwS281S0000000_34, Object obj) {
        return C2245781CvA.LIZ((C2245781CvA) obj, null, null, null, null, null, null, new C291001Au(Unit.LIZ), 63);
    }

    public static final Object invoke$14(AFwS281S0000000_34 aFwS281S0000000_34, Object obj) {
        return C2245781CvA.LIZ((C2245781CvA) obj, null, null, null, new C291001Au(Boolean.TRUE), null, null, null, 119);
    }

    public static final Object invoke$15(AFwS281S0000000_34 aFwS281S0000000_34, Object obj) {
        CreativeModel creativeModel = (CreativeModel) obj;
        if (creativeModel != null) {
            return creativeModel.editEffectModel;
        }
        return null;
    }

    public static final Object invoke$16(AFwS281S0000000_34 aFwS281S0000000_34, Object obj) {
        EditEffectModel editEffectModel = (EditEffectModel) obj;
        if (editEffectModel != null) {
            return Boolean.valueOf(editEffectModel.hasClippedEffect);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x004f A[Catch: Exception -> 0x0060, TryCatch #0 {Exception -> 0x0060, blocks: (B:3:0x0002, B:5:0x002f, B:7:0x003d, B:9:0x004f, B:11:0x0055), top: B:16:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* bridge */ /* synthetic */ java.lang.Object invoke$17(kotlin.jvm.internal.AFwS281S0000000_34 r4, java.lang.Object r5) {
        /*
            byte[] r5 = (byte[]) r5
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Exception -> L60
            java.nio.charset.Charset r0 = kotlin.text.Charsets.UTF_8     // Catch: java.lang.Exception -> L60
            r1.<init>(r5, r0)     // Catch: java.lang.Exception -> L60
            java.lang.Class<com.ss.android.ugc.aweme.im.contacts.impl.model.IMContactEvent> r0 = com.ss.android.ugc.aweme.im.contacts.impl.model.IMContactEvent.class
            java.lang.Object r4 = X.C08JS.LIZ(r1, r0)     // Catch: java.lang.Exception -> L60
            com.ss.android.ugc.aweme.im.contacts.impl.model.IMContactEvent r4 = (com.ss.android.ugc.aweme.im.contacts.impl.model.IMContactEvent) r4     // Catch: java.lang.Exception -> L60
            X.1BFe r0 = X.C2201761BFe.LIZ     // Catch: java.lang.Exception -> L60
            r0.getClass()     // Catch: java.lang.Exception -> L60
            X.054G r3 = X.C2201761BFe.LIZIZ     // Catch: java.lang.Exception -> L60
            X.1BFU r2 = new X.1BFU     // Catch: java.lang.Exception -> L60
            r1 = 0
            r2.<init>(r4, r1)     // Catch: java.lang.Exception -> L60
            r0 = 3
            X.C23250099c.LIZLLL(r3, r1, r1, r2, r0)     // Catch: java.lang.Exception -> L60
            com.ss.android.ugc.aweme.im.common.setting.IMContactSetting r0 = com.ss.android.ugc.aweme.im.common.setting.IMContactSetting.LIZ     // Catch: java.lang.Exception -> L60
            r0.getClass()     // Catch: java.lang.Exception -> L60
            com.ss.android.ugc.aweme.im.common.setting.IMContactSetting$ContactUserListConfig r0 = com.ss.android.ugc.aweme.im.common.setting.IMContactSetting.LIZ()     // Catch: java.lang.Exception -> L60
            boolean r0 = r0.debugTool     // Catch: java.lang.Exception -> L60
            if (r0 == 0) goto L64
            X.0I0B r1 = X.C0I0B.LJFF     // Catch: java.lang.Exception -> L60
            X.05vB r0 = r1.LIZJ()     // Catch: java.lang.Exception -> L60
            X.0Z7w r0 = (X.C894660Z7w) r0     // Catch: java.lang.Exception -> L60
            boolean r0 = X.C894660Z7w.LIZJ()     // Catch: java.lang.Exception -> L60
            if (r0 != 0) goto L4f
            X.05vB r0 = r1.LIZJ()     // Catch: java.lang.Exception -> L60
            X.0Z7w r0 = (X.C894660Z7w) r0     // Catch: java.lang.Exception -> L60
            java.lang.String r1 = X.C894660Z7w.LIZIZ()     // Catch: java.lang.Exception -> L60
            java.lang.String r0 = "local_test"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)     // Catch: java.lang.Exception -> L60
            if (r0 == 0) goto L64
        L4f:
            android.content.Context r2 = X.C1383370m6R.LJIILIIL()     // Catch: java.lang.Exception -> L60
            if (r2 == 0) goto L64
            Y.ARunnableS73S0200000_4 r1 = new Y.ARunnableS73S0200000_4     // Catch: java.lang.Exception -> L60
            r0 = 11
            r1.<init>(r2, r5, r0)     // Catch: java.lang.Exception -> L60
            X.C1481605r4.LIZIZ(r1)     // Catch: java.lang.Exception -> L60
            goto L64
        L60:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L64:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AFwS281S0000000_34.invoke$17(kotlin.jvm.internal.AFwS281S0000000_34, java.lang.Object):java.lang.Object");
    }

    public static final /* bridge */ /* synthetic */ Object invoke$18(AFwS281S0000000_34 aFwS281S0000000_34, Object obj) {
        return Unit.LIZ;
    }

    public static final Object invoke$2(AFwS281S0000000_34 aFwS281S0000000_34, Object obj) {
        C128Y c128y = BaseI18nAuthorizedFragment.LLJLLL;
        if (c128y instanceof InterfaceC2198731B3n) {
            ((InterfaceC2198731B3n) c128y).u8("auth_error_switch_account");
        }
        return Unit.LIZ;
    }

    public static final Object invoke$20(AFwS281S0000000_34 aFwS281S0000000_34, Object obj) {
        return ((String) obj).toLowerCase(Locale.ROOT);
    }

    public static final /* bridge */ /* synthetic */ Object invoke$21(AFwS281S0000000_34 aFwS281S0000000_34, Object obj) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$22(AFwS281S0000000_34 aFwS281S0000000_34, Object obj) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$23(AFwS281S0000000_34 aFwS281S0000000_34, Object obj) {
        return Unit.LIZ;
    }

    public static final Object invoke$24(AFwS281S0000000_34 aFwS281S0000000_34, Object obj) {
        return new C2238341CjA((InterfaceC2238351CjB) obj);
    }

    public static final /* bridge */ /* synthetic */ Object invoke$25(AFwS281S0000000_34 aFwS281S0000000_34, Object obj) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$26(AFwS281S0000000_34 aFwS281S0000000_34, Object obj) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$27(AFwS281S0000000_34 aFwS281S0000000_34, Object obj) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$28(AFwS281S0000000_34 aFwS281S0000000_34, Object obj) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$29(AFwS281S0000000_34 aFwS281S0000000_34, Object obj) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$3(AFwS281S0000000_34 aFwS281S0000000_34, Object obj) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$30(AFwS281S0000000_34 aFwS281S0000000_34, Object obj) {
        return Unit.LIZ;
    }

    public static final Object invoke$34(AFwS281S0000000_34 aFwS281S0000000_34, Object obj) {
        return C2246381Cw8.LIZ((C2246381Cw8) obj, null, null, null, null, null, EnumC2246361Cw6.OVERFLOW, false, null, 223);
    }

    public static final Object invoke$35(AFwS281S0000000_34 aFwS281S0000000_34, Object obj) {
        return C2246381Cw8.LIZ((C2246381Cw8) obj, null, null, null, null, null, null, false, new C291001Au(Boolean.TRUE), 127);
    }

    public static final Object invoke$36(AFwS281S0000000_34 aFwS281S0000000_34, Object obj) {
        ((InterfaceC2214741BmC) obj).setOperationResult(Boolean.TRUE);
        return Unit.LIZ;
    }

    public static final Object invoke$37(AFwS281S0000000_34 aFwS281S0000000_34, Object obj) {
        ((InterfaceC2214741BmC) obj).setOperationResult(Boolean.FALSE);
        return Unit.LIZ;
    }

    public static final Object invoke$38(AFwS281S0000000_34 aFwS281S0000000_34, Object obj) {
        ((InterfaceC2214741BmC) obj).setOperationResult(Boolean.TRUE);
        return Unit.LIZ;
    }

    public static final Object invoke$39(AFwS281S0000000_34 aFwS281S0000000_34, Object obj) {
        ((InterfaceC2214741BmC) obj).setOperationResult(Boolean.FALSE);
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$4(AFwS281S0000000_34 aFwS281S0000000_34, Object obj) {
        return Unit.LIZ;
    }

    public static final Object invoke$40(AFwS281S0000000_34 aFwS281S0000000_34, Object obj) {
        ((InterfaceC2214741BmC) obj).setOperationResult(Boolean.TRUE);
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$41(AFwS281S0000000_34 aFwS281S0000000_34, Object obj) {
        return Unit.LIZ;
    }

    public static final Object invoke$42(AFwS281S0000000_34 aFwS281S0000000_34, Object obj) {
        C1BVD.LIZ.getClass();
        Function0<Unit> function0 = C1BVD.LIZJ;
        if (function0 != null) {
            function0.invoke();
        }
        C1BVD.LIZJ = null;
        return Unit.LIZ;
    }

    public static final Object invoke$43(AFwS281S0000000_34 aFwS281S0000000_34, Object obj) {
        ((ConditionC2216081BoM) obj).signalAll();
        return Unit.LIZ;
    }

    public static final Object invoke$44(AFwS281S0000000_34 aFwS281S0000000_34, Object obj) {
        if (!Intrinsics.LJFF(((AbstractDialogInterfaceC1397690mTX) obj).LLIZ, 0)) {
            C1BH3.LIZ.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJII(C1BH3.LIZIZ.LIZ);
            c2344009Gk.LJIIIIZZ("click_type", "click_cancel");
            C20684815ws.LJIILLIIL("search_card_click", c2344009Gk.LIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$45(AFwS281S0000000_34 aFwS281S0000000_34, Object obj) {
        return Boolean.valueOf(obj instanceof C2238891Ck3);
    }

    public static final Object invoke$46(AFwS281S0000000_34 aFwS281S0000000_34, Object obj) {
        return Boolean.valueOf(((C2238811Cjv) obj).LIZ.isShutdown());
    }

    public static final /* bridge */ /* synthetic */ Object invoke$47(AFwS281S0000000_34 aFwS281S0000000_34, Object obj) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$48(AFwS281S0000000_34 aFwS281S0000000_34, Object obj) {
        return Unit.LIZ;
    }

    public static final Object invoke$49(AFwS281S0000000_34 aFwS281S0000000_34, Object obj) {
        ((BDVideoUploaderBase) obj).allowMergeUpload();
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$5(AFwS281S0000000_34 aFwS281S0000000_34, Object obj) {
        return Unit.LIZ;
    }

    public static final Object invoke$50(AFwS281S0000000_34 aFwS281S0000000_34, Object obj) {
        ((BDVideoUploader) obj).cancelUpload();
        return Unit.LIZ;
    }

    public static final Object invoke$51(AFwS281S0000000_34 aFwS281S0000000_34, Object obj) {
        return ((BDVideoUploaderBase) obj).getUploadContextSnapshot();
    }

    public static final Object invoke$52(AFwS281S0000000_34 aFwS281S0000000_34, Object obj) {
        ((BDVideoUploaderBase) obj).stop();
        return Unit.LIZ;
    }

    public static final Object invoke$53(AFwS281S0000000_34 aFwS281S0000000_34, Object obj) {
        ((BDVideoUploaderBase) obj).start();
        return Unit.LIZ;
    }

    public static final Object invoke$54(AFwS281S0000000_34 aFwS281S0000000_34, Object obj) {
        ((BDVideoUploaderBase) obj).start();
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$55(AFwS281S0000000_34 aFwS281S0000000_34, Object obj) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$56(AFwS281S0000000_34 aFwS281S0000000_34, Object obj) {
        return Unit.LIZ;
    }

    public static final Object invoke$57(AFwS281S0000000_34 aFwS281S0000000_34, Object obj) {
        C1BYV.LIZ.getClass();
        C1BYV.LJIIJ((C19EG) obj);
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$58(AFwS281S0000000_34 aFwS281S0000000_34, Object obj) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$59(AFwS281S0000000_34 aFwS281S0000000_34, Object obj) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$6(AFwS281S0000000_34 aFwS281S0000000_34, Object obj) {
        return Unit.LIZ;
    }

    public static final Object invoke$60(AFwS281S0000000_34 aFwS281S0000000_34, Object obj) {
        C1043500dGG.LIZ.getClass();
        ((C1023640ckE) obj).withParam(C1043500dGG.LJJJLZIJ, "custom_tab");
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$61(AFwS281S0000000_34 aFwS281S0000000_34, Object obj) {
        return Unit.LIZ;
    }

    public static final Object invoke$62(AFwS281S0000000_34 aFwS281S0000000_34, Object obj) {
        return C2245781CvA.LIZ((C2245781CvA) obj, null, null, null, null, new C291001Au(Boolean.TRUE), null, null, 111);
    }

    public static final Object invoke$63(AFwS281S0000000_34 aFwS281S0000000_34, Object obj) {
        return ((C2248581Czg) obj).LJFF;
    }

    public static final Object invoke$64(AFwS281S0000000_34 aFwS281S0000000_34, Object obj) {
        return ((C2248581Czg) obj).LJFF;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$65(AFwS281S0000000_34 aFwS281S0000000_34, Object obj) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$66(AFwS281S0000000_34 aFwS281S0000000_34, Object obj) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$67(AFwS281S0000000_34 aFwS281S0000000_34, Object obj) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$68(AFwS281S0000000_34 aFwS281S0000000_34, Object obj) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$69(AFwS281S0000000_34 aFwS281S0000000_34, Object obj) {
        return Unit.LIZ;
    }

    public static final Object invoke$7(AFwS281S0000000_34 aFwS281S0000000_34, Object obj) {
        AutoReplyStatusStruct autoReplyStatusStruct = (AutoReplyStatusStruct) obj;
        long j = autoReplyStatusStruct.replyId;
        int i = autoReplyStatusStruct.reviewStatus;
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        return null;
                    }
                }
            }
        }
        return new C475600Ikw(j, i2, autoReplyStatusStruct.keyword, autoReplyStatusStruct.content, autoReplyStatusStruct.reviewReason);
    }

    public static final /* bridge */ /* synthetic */ Object invoke$70(AFwS281S0000000_34 aFwS281S0000000_34, Object obj) {
        return Unit.LIZ;
    }

    public static final Object invoke$71(AFwS281S0000000_34 aFwS281S0000000_34, Object obj) {
        ((BDImageXUploader) obj).cancelUpload();
        return Unit.LIZ;
    }

    public static final Object invoke$72(AFwS281S0000000_34 aFwS281S0000000_34, Object obj) {
        return ((BDImageXUploaderBase) obj).getUploadContextSnapshot();
    }

    public static final Object invoke$73(AFwS281S0000000_34 aFwS281S0000000_34, Object obj) {
        ((BDImageXUploaderBase) obj).start();
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$10(AFwS281S0000000_34 aFwS281S0000000_34, Object obj) {
        return obj;
    }

    public static /* bridge */ /* synthetic */ Object invoke$11(AFwS281S0000000_34 aFwS281S0000000_34, Object obj) {
        return obj;
    }

    public static /* bridge */ /* synthetic */ Object invoke$19(AFwS281S0000000_34 aFwS281S0000000_34, Object obj) {
        return obj;
    }

    public static /* bridge */ /* synthetic */ Object invoke$31(AFwS281S0000000_34 aFwS281S0000000_34, Object obj) {
        return obj;
    }

    public static /* bridge */ /* synthetic */ Object invoke$32(AFwS281S0000000_34 aFwS281S0000000_34, Object obj) {
        return obj;
    }

    public static /* bridge */ /* synthetic */ Object invoke$33(AFwS281S0000000_34 aFwS281S0000000_34, Object obj) {
        return obj;
    }

    public static /* bridge */ /* synthetic */ Object invoke$74(AFwS281S0000000_34 aFwS281S0000000_34, Object obj) {
        return obj;
    }

    public static /* bridge */ /* synthetic */ Object invoke$75(AFwS281S0000000_34 aFwS281S0000000_34, Object obj) {
        return obj;
    }

    public static /* bridge */ /* synthetic */ Object invoke$8(AFwS281S0000000_34 aFwS281S0000000_34, Object obj) {
        return obj;
    }

    public static /* bridge */ /* synthetic */ Object invoke$9(AFwS281S0000000_34 aFwS281S0000000_34, Object obj) {
        return obj;
    }
}
