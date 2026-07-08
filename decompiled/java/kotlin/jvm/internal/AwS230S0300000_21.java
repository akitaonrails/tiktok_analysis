package kotlin.jvm.internal;

import X.AbstractC848400XPy;
import X.C00I8;
import X.C013C;
import X.C036E;
import X.C04UD;
import X.C06UM;
import X.C09AY;
import X.C0SXF;
import X.C0VSJ;
import X.C0XQ7;
import X.C0Y8T;
import X.C1104190eq9;
import X.C1158140gFA;
import X.C1164270gP3;
import X.C123100dR;
import X.C127A;
import X.C1341800l1O;
import X.C1342780l2y;
import X.C1344420l5c;
import X.C1344860l6K;
import X.C1345120l6k;
import X.C1346950l9h;
import X.C1351950lHl;
import X.C1352520lIg;
import X.C1353360lK2;
import X.C1354540lLw;
import X.C1354580lM0;
import X.C1361150lWb;
import X.C1361720lXW;
import X.C1361900lXo;
import X.C1361910lXp;
import X.C1361920lXq;
import X.C1362030lY1;
import X.C1362120lYA;
import X.C1362170lYF;
import X.C1362190lYH;
import X.C1363340la8;
import X.C1365870leD;
import X.C1374270lrl;
import X.C1374350lrt;
import X.C1374410lrz;
import X.C1374420ls0;
import X.C1374430ls1;
import X.C1374510ls9;
import X.C1374520lsA;
import X.C1374560lsE;
import X.C1374720lsU;
import X.C1375540lto;
import X.C1380610m1z;
import X.C1381210m2x;
import X.C1383870m7F;
import X.C1384300m7w;
import X.C1387170mCZ;
import X.C1388830mFF;
import X.C1389890mGx;
import X.C1392540mLE;
import X.C1393030mM1;
import X.C1393100mM8;
import X.C1393570mMt;
import X.C1394000mNa;
import X.C1394730mOl;
import X.C1397480mTC;
import X.C1399210mVz;
import X.C13DV;
import X.C13LP;
import X.C1440005kM;
import X.C15438062q;
import X.C15442062u;
import X.C1697810uHb;
import X.C1697820uHc;
import X.C189200o6;
import X.C1909107dp;
import X.C1953307kx;
import X.C197039127h;
import X.C19EG;
import X.C1ER1;
import X.C2203008k8;
import X.C23260099m;
import X.C2344009Gk;
import X.C259800zU;
import X.C291001Au;
import X.C337180DJs;
import X.C452340HoW;
import X.C696590RUb;
import X.C712520RxC;
import X.C786410Ut5;
import X.C913380ZsO;
import X.EnumC1346360l8k;
import X.EnumC1352510lIf;
import X.EnumC1361130lWZ;
import X.EnumC1392960mLu;
import X.EnumC255700yp;
import X.EnumC328260Cts;
import X.InterfaceC1361730lXX;
import X.InterfaceC1364105Vn;
import X.InterfaceC1369790lkX;
import X.InterfaceC1380630m21;
import X.InterfaceC1380640m22;
import X.InterfaceC1380660m24;
import X.InterfaceC1381220m2y;
import X.InterfaceC1381230m2z;
import X.InterfaceC1383970m7P;
import X.InterfaceC1393560mMs;
import X.InterfaceC705550Rlx;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.comment.audio.ui.recorder.CommentAudioRecordViewModel;
import com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.AbstractBottomPriorityComponent;
import com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.protocol.BottomBarProtocol;
import com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.ui.BottomBarFragment;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.KeyboardVMV2;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.RefactorKeyboardPanelV2;
import com.ss.android.ugc.aweme.comment.model.CommentImageModel;
import com.ss.android.ugc.aweme.comment.model.CommentInputContent;
import com.ss.android.ugc.aweme.comment.model.CommentResponse;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentPublishViewModel;
import com.ss.android.ugc.aweme.eventtrack.eventfiles.DeleteDanmakuEvent;
import com.ss.android.ugc.aweme.experiment.CommentStickerTypingRecConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.common.model.BaseContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.contacts.api.service.IIMContactUtilService;
import com.ss.android.ugc.aweme.internalshare.impl.refactor.assem.ICreateGroupAbility;
import com.ss.android.ugc.aweme.internalshare.impl.refactor.assem.SharePanelSendButtonAssem;
import com.ss.android.ugc.aweme.internalshare.impl.refactor.vm.ShareContactListViewModel;
import com.ss.android.ugc.aweme.longpress.LPPProtocol;
import com.ss.android.ugc.aweme.model.DanmakuListViewModel;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.panel.DanmakuListFragment;
import com.ss.android.ugc.aweme.platform.AnchorEventCenter;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.fragment.muflist.MufUserCell;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.tiktok.anchor.StickerAnchorMaker;
import com.ss.android.ugc.tiktok.report.interfaces.IReportService;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public class AwS230S0300000_21 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS230S0300000_21 awS230S0300000_21, Object obj) throws JSONException {
        C013C c013c = (C013C) awS230S0300000_21.l0;
        if (!c013c.element) {
            c013c.element = true;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("error_code", 3);
            jSONObject.put("error_msg", "user cancel");
            ((C1387170mCZ) awS230S0300000_21.l1).LJ((Number) awS230S0300000_21.l2, jSONObject);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS230S0300000_21 awS230S0300000_21, Object obj) {
        return C1352520lIg.LIZ((C1352520lIg) obj, EnumC1352510lIf.STOPPED, ((CommentAudioRecordViewModel) awS230S0300000_21.l1).wQ2(((Number) ((Pair) awS230S0300000_21.l0).getSecond()).longValue()), false, 0, (String) ((Pair) awS230S0300000_21.l0).getFirst(), null, (float[]) awS230S0300000_21.l2, 348);
    }

    public static final Object invoke$10(AwS230S0300000_21 awS230S0300000_21, Object obj) {
        String str = (String) obj;
        if (str != null) {
            C1953307kx.LIZ.getClass();
            if (C1953307kx.LIZLLL(str)) {
                C1374410lrz c1374410lrz = (C1374410lrz) awS230S0300000_21.l1;
                Context context = (Context) awS230S0300000_21.l2;
                c1374410lrz.LIZ.LJIJ(new C1374270lrl(C2203008k8.LIZ(context, new C0VSJ(str)), null, null, null, 62), context, null);
            }
        }
        ((Function1) awS230S0300000_21.l0).invoke(Boolean.TRUE);
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS230S0300000_21 awS230S0300000_21, Object obj) {
        String str = (String) obj;
        if (str != null && C123100dR.LIZ(str)) {
            InterfaceC1369790lkX interfaceC1369790lkX = (InterfaceC1369790lkX) awS230S0300000_21.l1;
            Context context = (Context) awS230S0300000_21.l2;
            if (interfaceC1369790lkX != null) {
                C1374270lrl c1374270lrl = new C1374270lrl(C1374720lsU.LJFF(context, str), null, null, null, 62);
                String str2 = c1374270lrl.LJ;
                if (str2 == null) {
                    str2 = "";
                }
                c1374270lrl.LIZIZ("content_url", str2);
                c1374270lrl.LIZIZ("fb_app_id", "597615686992125");
                c1374270lrl.LIZIZ("media_type", "video/mp4");
                interfaceC1369790lkX.LJJIIJ(c1374270lrl, context, null);
            }
        }
        ((Function1) awS230S0300000_21.l0).invoke(Boolean.TRUE);
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS230S0300000_21 awS230S0300000_21, Object obj) {
        String str = (String) obj;
        if (str != null && C123100dR.LIZ(str)) {
            C1374510ls9 c1374510ls9 = (C1374510ls9) awS230S0300000_21.l1;
            Context context = (Context) awS230S0300000_21.l2;
            c1374510ls9.LIZ.LJIJ(new C1374270lrl(C2203008k8.LIZ(context, new C0VSJ(str)), null, null, null, 62), context, null);
        }
        ((Function1) awS230S0300000_21.l0).invoke(Boolean.TRUE);
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS230S0300000_21 awS230S0300000_21, Object obj) {
        String str = (String) obj;
        if (str != null && C123100dR.LIZ(str)) {
            C1374560lsE c1374560lsE = (C1374560lsE) awS230S0300000_21.l1;
            Context context = (Context) awS230S0300000_21.l2;
            InterfaceC1369790lkX interfaceC1369790lkX = c1374560lsE.LIZ;
            C1374270lrl c1374270lrl = new C1374270lrl(C1374720lsU.LJFF(C1374720lsU.LIZIZ(), str), null, null, null, 62);
            String str2 = c1374270lrl.LJ;
            if (str2 == null) {
                str2 = "";
            }
            c1374270lrl.LIZIZ("content_url", str2);
            c1374270lrl.LIZIZ("media_type", "video/*");
            interfaceC1369790lkX.LJIJ(c1374270lrl, context, null);
        }
        ((Function1) awS230S0300000_21.l0).invoke(Boolean.TRUE);
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS230S0300000_21 awS230S0300000_21, Object obj) {
        String str = (String) obj;
        if (str != null && C123100dR.LIZ(str)) {
            C1374420ls0 c1374420ls0 = (C1374420ls0) awS230S0300000_21.l1;
            Context context = (Context) awS230S0300000_21.l2;
            c1374420ls0.LIZ.LJIJ(new C1374270lrl(C2203008k8.LIZ(context, new C0VSJ(str)), null, null, null, 62), context, null);
        }
        ((Function1) awS230S0300000_21.l0).invoke(Boolean.TRUE);
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS230S0300000_21 awS230S0300000_21, Object obj) {
        String str = (String) obj;
        if (str != null && C123100dR.LIZ(str)) {
            C1374430ls1 c1374430ls1 = (C1374430ls1) awS230S0300000_21.l1;
            c1374430ls1.LIZ.LJIJ(new C1374270lrl(C1374720lsU.LJFF(C1374720lsU.LIZIZ(), str), null, null, null, 62), (Context) awS230S0300000_21.l2, null);
        }
        ((Function1) awS230S0300000_21.l0).invoke(Boolean.TRUE);
        return Unit.LIZ;
    }

    public static final Object invoke$16(AwS230S0300000_21 awS230S0300000_21, Object obj) {
        String str = (String) obj;
        if (str != null && C123100dR.LIZ(str)) {
            C1374350lrt c1374350lrt = (C1374350lrt) awS230S0300000_21.l1;
            Context context = (Context) awS230S0300000_21.l2;
            c1374350lrt.LIZ.LJIJ(new C1374270lrl(C2203008k8.LIZ(context, new C0VSJ(str)), null, null, null, 62), context, null);
        }
        ((Function1) awS230S0300000_21.l0).invoke(Boolean.TRUE);
        return Unit.LIZ;
    }

    public static final Object invoke$17(AwS230S0300000_21 awS230S0300000_21, Object obj) {
        String str = (String) obj;
        if (str != null && C123100dR.LIZ(str)) {
            C1374520lsA c1374520lsA = (C1374520lsA) awS230S0300000_21.l1;
            Context context = (Context) awS230S0300000_21.l2;
            c1374520lsA.LIZ.LJIJ(new C1374270lrl(C2203008k8.LIZ(context, new C0VSJ(str)), null, null, null, 62), context, null);
        }
        ((Function1) awS230S0300000_21.l0).invoke(Boolean.TRUE);
        return Unit.LIZ;
    }

    public static final Object invoke$18(AwS230S0300000_21 awS230S0300000_21, Object obj) {
        ((InterfaceC1369790lkX) awS230S0300000_21.l0).LJJJIL(new C1375540lto(C2203008k8.LIZ((Context) awS230S0300000_21.l1, new C0VSJ((String) obj)), "", null, null, null, false, 248), (Context) awS230S0300000_21.l1, null);
        ((Function1) awS230S0300000_21.l2).invoke(Boolean.TRUE);
        return Unit.LIZ;
    }

    public static final Object invoke$19(AwS230S0300000_21 awS230S0300000_21, Object obj) {
        if (Intrinsics.LJFF(((StickerAnchorMaker) awS230S0300000_21.l0).LLJIJIL, "template")) {
            ((StickerAnchorMaker) awS230S0300000_21.l0).LJJJLL((C1394730mOl) awS230S0300000_21.l1, (C2344009Gk) awS230S0300000_21.l2);
        } else {
            StickerAnchorMaker stickerAnchorMaker = (StickerAnchorMaker) awS230S0300000_21.l0;
            stickerAnchorMaker.getClass();
            stickerAnchorMaker.LJJIJ(new AwS600S0100000_21(stickerAnchorMaker, 281));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS230S0300000_21 awS230S0300000_21, Object obj) {
        C1354540lLw.LIZJ((Function0) awS230S0300000_21.l0, (C1354580lM0) awS230S0300000_21.l1, (C1354540lLw) awS230S0300000_21.l2, (Bitmap) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$20(AwS230S0300000_21 awS230S0300000_21, Object obj) {
        C1ER1.LIZIZ.w0(((C1353360lK2) awS230S0300000_21.l0).getContext(), ((TextExtraStruct) awS230S0300000_21.l1).getSearchKeyword(), (TextExtraStruct) awS230S0300000_21.l1, (Map) awS230S0300000_21.l2, (String) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$21(AwS230S0300000_21 awS230S0300000_21, Object obj) {
        C1381210m2x c1381210m2x = (C1381210m2x) awS230S0300000_21.l0;
        InterfaceC1381220m2y interfaceC1381220m2y = (InterfaceC1381220m2y) awS230S0300000_21.l1;
        c1381210m2x.getClass();
        IReportService.LIZ.getClass();
        C06UM.LIZ().report(new AwS600S0100000_21(interfaceC1381220m2y, 252));
        ((CompletionBlock) awS230S0300000_21.l2).onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1381230m2z.class, null), "");
        return Unit.LIZ;
    }

    public static final Object invoke$22(AwS230S0300000_21 awS230S0300000_21, Object obj) {
        ((C1399210mVz) awS230S0300000_21.l0).LJJJLL((C1397480mTC) awS230S0300000_21.l1, (C2344009Gk) awS230S0300000_21.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$23(AwS230S0300000_21 awS230S0300000_21, Object obj) {
        ((C1394000mNa) awS230S0300000_21.l0).LJJJLL((C1394730mOl) awS230S0300000_21.l1, (C2344009Gk) awS230S0300000_21.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$24(AwS230S0300000_21 awS230S0300000_21, Object obj) {
        InterfaceC1393560mMs interfaceC1393560mMs = (InterfaceC1393560mMs) obj;
        C712520RxC c712520RxC = (C712520RxC) awS230S0300000_21.l0;
        C2344009Gk c2344009GkLIZJ = C1392540mLE.LIZJ(interfaceC1393560mMs, c712520RxC, "click_anchor", ((C1393570mMt) awS230S0300000_21.l1).LJI(c712520RxC));
        c2344009GkLIZJ.LJII(C1104190eq9.LIZ(((InterfaceC705550Rlx) awS230S0300000_21.l2).rootView(), "c20736.d0"));
        interfaceC1393560mMs.LJIIJJI(c2344009GkLIZJ);
        return Unit.LIZ;
    }

    public static final Object invoke$25(AwS230S0300000_21 awS230S0300000_21, Object obj) {
        return C1362190lYH.LIZ((C1362190lYH) obj, (List) awS230S0300000_21.l0, (List) awS230S0300000_21.l1, (Set) awS230S0300000_21.l2, false, false, null, null, false, null, 1016);
    }

    public static final Object invoke$26(AwS230S0300000_21 awS230S0300000_21, Object obj) {
        C1354580lM0 c1354580lM0 = (C1354580lM0) awS230S0300000_21.l0;
        c1354580lM0.LJI = (Bitmap) obj;
        ((C1354540lLw) awS230S0300000_21.l1).LIZIZ(c1354580lM0, (Function0) awS230S0300000_21.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$27(AwS230S0300000_21 awS230S0300000_21, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            ((C1393030mM1) awS230S0300000_21.l0).LIZJ.setIconRes(R.raw.icon_eye_slash_fill);
            C337180DJs.LIZJ(((C1393030mM1) awS230S0300000_21.l0).LIZJ);
            ((User) awS230S0300000_21.l1).setIsMute(true);
        } else {
            ((C127A) awS230S0300000_21.l2).LJIILJJIL(false);
            ((User) awS230S0300000_21.l1).setIsMute(false);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$28(AwS230S0300000_21 awS230S0300000_21, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            C337180DJs.LIZ(((C1393030mM1) awS230S0300000_21.l0).LIZJ);
            ((User) awS230S0300000_21.l1).setIsMute(false);
        } else {
            ((C127A) awS230S0300000_21.l2).LJIILJJIL(true);
            ((User) awS230S0300000_21.l1).setIsMute(true);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$29(AwS230S0300000_21 awS230S0300000_21, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            ((MufUserCell) awS230S0300000_21.l0).N5().setIconRes(R.raw.icon_eye_slash_fill);
            C337180DJs.LIZJ(((MufUserCell) awS230S0300000_21.l0).N5());
            ((User) awS230S0300000_21.l1).setIsMute(true);
        } else {
            ((C127A) awS230S0300000_21.l2).LJIILJJIL(false);
            ((User) awS230S0300000_21.l1).setIsMute(false);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS230S0300000_21 awS230S0300000_21, Object obj) {
        CommentInputContent commentInputContent = (CommentInputContent) awS230S0300000_21.l0;
        C1341800l1O c1341800l1O = KeyboardVMV2.LLJJIJIL;
        Aweme aweme = (Aweme) awS230S0300000_21.l1;
        EnumC1346360l8k enumC1346360l8k = (EnumC1346360l8k) awS230S0300000_21.l2;
        c1341800l1O.getClass();
        commentInputContent.uniqueId = C1341800l1O.LIZIZ(aweme, enumC1346360l8k);
        return C1346950l9h.LIZ((C1346950l9h) obj, null, false, 0, 0, null, false, false, false, new C291001Au((CommentInputContent) awS230S0300000_21.l0), null, null, null, null, false, null, null, null, false, false, null, false, false, false, false, false, null, null, false, null, -513);
    }

    public static final Object invoke$30(AwS230S0300000_21 awS230S0300000_21, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            C337180DJs.LIZ(((MufUserCell) awS230S0300000_21.l0).N5());
            ((User) awS230S0300000_21.l1).setIsMute(false);
        } else {
            ((C127A) awS230S0300000_21.l2).LJIILJJIL(true);
            ((User) awS230S0300000_21.l1).setIsMute(true);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$31(AwS230S0300000_21 awS230S0300000_21, Object obj) {
        C696590RUb c696590RUb = (C696590RUb) obj;
        BottomBarFragment bottomBarFragment = (BottomBarFragment) awS230S0300000_21.l0;
        View view = (View) awS230S0300000_21.l1;
        bottomBarFragment.getClass();
        FrameLayout frameLayout = new FrameLayout(view.getContext());
        C786410Ut5.a6(frameLayout, new ViewGroup.MarginLayoutParams(-1, -1));
        frameLayout.setId(R.id.fq0);
        c696590RUb.LLJ = frameLayout;
        c696590RUb.LLJI = (UIContentAssem) ((BottomBarProtocol) awS230S0300000_21.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$32(AwS230S0300000_21 awS230S0300000_21, Object obj) {
        Assembler assembler = (Assembler) obj;
        List<BottomBarProtocol> list = (List) awS230S0300000_21.l0;
        if (list != null) {
            BottomBarFragment bottomBarFragment = (BottomBarFragment) awS230S0300000_21.l1;
            View view = (View) awS230S0300000_21.l2;
            for (BottomBarProtocol bottomBarProtocol : list) {
                if (bottomBarProtocol instanceof AbstractBottomPriorityComponent) {
                    if (((AbstractBottomPriorityComponent) bottomBarProtocol).Go(bottomBarFragment.xp0())) {
                        assembler.QQ2(bottomBarFragment, new AwS230S0300000_21(bottomBarFragment, view, bottomBarProtocol, 31));
                    }
                } else {
                    throw new IllegalStateException("The type implementing BottomBarProtocol is not supported!");
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$33(AwS230S0300000_21 awS230S0300000_21, Object obj) {
        ((InterfaceC1393560mMs) awS230S0300000_21.l0).LJJJLL((View) obj, (C2344009Gk) awS230S0300000_21.l1);
        if (C04UD.LIZ()) {
            C1361920lXq c1361920lXq = (C1361920lXq) C1361900lXo.LIZ("event_entrance_click");
            if (c1361920lXq != null) {
                C1388830mFF c1388830mFF = (C1388830mFF) awS230S0300000_21.l2;
                InterfaceC1393560mMs interfaceC1393560mMs = (InterfaceC1393560mMs) awS230S0300000_21.l0;
                c1361920lXq.LIZJ = "click_anchor";
                c1361920lXq.LIZLLL = true;
                AnchorEventCenter anchorEventCenter = c1388830mFF.LIZJ;
                if (anchorEventCenter != null) {
                    anchorEventCenter.kF(c1361920lXq, interfaceC1393560mMs);
                }
            }
            C1361910lXp c1361910lXp = (C1361910lXp) C1361900lXo.LIZ("event_enter_detail");
            if (c1361910lXp != null) {
                C1388830mFF c1388830mFF2 = (C1388830mFF) awS230S0300000_21.l2;
                InterfaceC1393560mMs interfaceC1393560mMs2 = (InterfaceC1393560mMs) awS230S0300000_21.l0;
                c1361910lXp.LIZJ = "click_anchor";
                c1361910lXp.LIZLLL = true;
                AnchorEventCenter anchorEventCenter2 = c1388830mFF2.LIZJ;
                if (anchorEventCenter2 != null) {
                    anchorEventCenter2.kF(c1361910lXp, interfaceC1393560mMs2);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$34(AwS230S0300000_21 awS230S0300000_21, Object obj) {
        LPPProtocol lPPProtocol;
        InterfaceC1380660m24 interfaceC1380660m24LIZ;
        InterfaceC1380630m21 interfaceC1380630m21 = (InterfaceC1380630m21) obj;
        C1380610m1z c1380610m1zLIZLLL = ((InterfaceC1380640m22) awS230S0300000_21.l0).LIZLLL();
        if (c1380610m1zLIZLLL != null && (lPPProtocol = c1380610m1zLIZLLL.LIZIZ) != null && (interfaceC1380660m24LIZ = lPPProtocol.LIZ(interfaceC1380630m21.getKey())) != null && ((Boolean) ((Function1) awS230S0300000_21.l1).invoke(interfaceC1380660m24LIZ)).booleanValue()) {
            ((Function1) awS230S0300000_21.l2).invoke(interfaceC1380660m24LIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$35(AwS230S0300000_21 awS230S0300000_21, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            String string = ((SharePackage) awS230S0300000_21.l0).extras.getString("enter_from");
            if (string == null || string.length() <= 0) {
                string = null;
            }
            List listSingletonList = Collections.singletonList(((C1363340la8) awS230S0300000_21.l1).LIZ);
            IMContact iMContact = ((C1363340la8) awS230S0300000_21.l1).LIZ;
            SharePackage sharePackage = (SharePackage) awS230S0300000_21.l0;
            C1440005kM.LIZ(new C1365870leD(listSingletonList, iMContact, 1, false, sharePackage.itemType, string, null, null, sharePackage.extras.getString("tako_message_id"), false, false, false));
            InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) awS230S0300000_21.l2;
            Unit unit = Unit.LIZ;
            C189200o6.m2constructorimpl(unit);
            interfaceC1364105Vn.resumeWith(unit);
        } else {
            ((C1363340la8) awS230S0300000_21.l1).LIZJ.setValue(EnumC328260Cts.INIT);
            ((C1363340la8) awS230S0300000_21.l1).LIZ.setShareSuccess(false);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$36(AwS230S0300000_21 awS230S0300000_21, Object obj) {
        Assembler assembler = (Assembler) obj;
        CommentStickerTypingRecConfig commentStickerTypingRecConfigLIZ = C452340HoW.LIZ();
        if (commentStickerTypingRecConfigLIZ == null) {
            commentStickerTypingRecConfigLIZ = C452340HoW.LIZ;
        }
        if (commentStickerTypingRecConfigLIZ.enabled) {
            ((RefactorKeyboardPanelV2) awS230S0300000_21.l0).sp(assembler);
        }
        if (!((C013C) awS230S0300000_21.l2).element) {
            ((RefactorKeyboardPanelV2) awS230S0300000_21.l0).kp(assembler);
        }
        RefactorKeyboardPanelV2 refactorKeyboardPanelV2 = (RefactorKeyboardPanelV2) awS230S0300000_21.l0;
        refactorKeyboardPanelV2.getClass();
        assembler.QQ2(refactorKeyboardPanelV2, new AwS598S0100000_19(refactorKeyboardPanelV2, 897));
        ((RefactorKeyboardPanelV2) awS230S0300000_21.l0).lp(assembler);
        return Unit.LIZ;
    }

    public static final Object invoke$37(AwS230S0300000_21 awS230S0300000_21, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            C1393100mM8.LIZJ((User) awS230S0300000_21.l0, (EnumC1392960mLu) awS230S0300000_21.l1, true);
        } else {
            ((C127A) awS230S0300000_21.l2).LJIILJJIL(false);
            C1393100mM8.LIZJ((User) awS230S0300000_21.l0, (EnumC1392960mLu) awS230S0300000_21.l1, false);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$38(AwS230S0300000_21 awS230S0300000_21, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            C1393100mM8.LIZJ((User) awS230S0300000_21.l0, (EnumC1392960mLu) awS230S0300000_21.l1, false);
        } else {
            ((C127A) awS230S0300000_21.l2).LJIILJJIL(true);
            C1393100mM8.LIZJ((User) awS230S0300000_21.l0, (EnumC1392960mLu) awS230S0300000_21.l1, true);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:340:0x056b, code lost:
    
        r5 = r2.LJIIIIZZ();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x052e  */
    /* JADX WARN: Type inference failed for: r0v121 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v45, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r15v0, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r21v0, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r22v0, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r23v0, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r28v1, types: [kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [com.ss.android.ugc.aweme.comment.model.Comment] */
    /* JADX WARN: Type inference failed for: r4v6, types: [com.ss.android.ugc.aweme.texttoimage.ITextToImageService] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [com.ss.android.ugc.aweme.feed.model.Aweme] */
    /* JADX WARN: Type inference failed for: r7v133 */
    /* JADX WARN: Type inference failed for: r7v134 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [com.ss.android.ugc.aweme.comment.model.Comment] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$4(kotlin.jvm.internal.AwS230S0300000_21 r27, java.lang.Object r28) {
        /*
            Method dump skipped, instruction units count: 2332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS230S0300000_21.invoke$4(kotlin.jvm.internal.AwS230S0300000_21, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$5(AwS230S0300000_21 awS230S0300000_21, Object obj) {
        CommentImageModel commentImageModel;
        boolean z = C1344420l5c.LIZ;
        C1344420l5c.LIZ(((CommentResponse) awS230S0300000_21.l0).comment);
        boolean z2 = false;
        if (C1351950lHl.LJII(((CommentResponse) awS230S0300000_21.l0).comment)) {
            int i = C1344860l6K.LIZ;
            String awemeId = ((CommentResponse) awS230S0300000_21.l0).comment.getAwemeId();
            List<CommentImageModel> list = ((C1345120l6k) awS230S0300000_21.l1).LIZJ;
            if (list != null) {
                commentImageModel = (CommentImageModel) ListProtector.get(list, 0);
            } else {
                commentImageModel = null;
            }
            C1344860l6K.LIZ(commentImageModel, awemeId);
        }
        CommentPublishViewModel commentPublishViewModel = (CommentPublishViewModel) awS230S0300000_21.l2;
        CommentResponse commentResponse = (CommentResponse) awS230S0300000_21.l0;
        if (commentResponse.commentSurprise != null) {
            z2 = true;
        }
        commentPublishViewModel.FQ2(commentResponse, z2);
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS230S0300000_21 awS230S0300000_21, Object obj) {
        IMConversation iMConversationLJII;
        Bundle bundle;
        Serializable serializable = (Serializable) obj;
        SharePanelSendButtonAssem sharePanelSendButtonAssem = (SharePanelSendButtonAssem) awS230S0300000_21.l0;
        ICreateGroupAbility iCreateGroupAbility = (ICreateGroupAbility) awS230S0300000_21.l1;
        C197039127h c197039127hLo = sharePanelSendButtonAssem.Lo();
        if (c197039127hLo != null) {
            c197039127hLo.setLoading(false);
        }
        C197039127h c197039127hLo2 = sharePanelSendButtonAssem.Lo();
        if (c197039127hLo2 != null) {
            c197039127hLo2.setBackgroundResource(R.drawable.c_q);
        }
        iCreateGroupAbility.TM1(false);
        if (serializable != null && (serializable instanceof C0Y8T)) {
            SharePackage sharePackage = (SharePackage) awS230S0300000_21.l2;
            if (sharePackage != null && (bundle = sharePackage.extras) != null) {
                bundle.putBoolean("is_new_group", true);
            }
            SharePanelSendButtonAssem sharePanelSendButtonAssem2 = (SharePanelSendButtonAssem) awS230S0300000_21.l0;
            IMContact[] iMContactArr = new IMContact[1];
            IIMContactUtilService.LIZ.getClass();
            IIMContactUtilService iIMContactUtilServiceLIZ = C913380ZsO.LIZ();
            if (iIMContactUtilServiceLIZ != null && (iMConversationLJII = iIMContactUtilServiceLIZ.LJII((C0Y8T) serializable)) != null) {
                iMContactArr[0] = iMConversationLJII;
                sharePanelSendButtonAssem2.Ho(C1697810uHb.LJIILJJIL(iMContactArr));
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS230S0300000_21 awS230S0300000_21, Object obj) {
        return C1362190lYH.LIZ((C1362190lYH) obj, (List) awS230S0300000_21.l0, (List) awS230S0300000_21.l1, (Set) awS230S0300000_21.l2, false, false, null, null, false, null, 1016);
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [T, java.util.ArrayList] */
    public static final Object invoke$8(AwS230S0300000_21 awS230S0300000_21, Object obj) {
        List<IMContact> list;
        SharePackage sharePackage;
        C1362190lYH c1362190lYH = (C1362190lYH) obj;
        List<InterfaceC1361730lXX> list2 = c1362190lYH.LL;
        if (list2 != null && (list = c1362190lYH.LLILLJJLI) != null) {
            Iterator<InterfaceC1361730lXX> it2 = list2.iterator();
            int i = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (it2.next() instanceof C1362030lY1) {
                    if (i >= 0) {
                        Set setLLIIIZ = C13LP.LLIIIZ(c1362190lYH.LLILLL);
                        ?? arrayList = new ArrayList();
                        List list3 = (List) awS230S0300000_21.l0;
                        ShareContactListViewModel shareContactListViewModel = (ShareContactListViewModel) awS230S0300000_21.l2;
                        for (Object obj2 : list3) {
                            if (!shareContactListViewModel.gr0(C1362190lYH.LIZ(c1362190lYH, null, null, C15442062u.LJIIIIZZ(obj2, setLLIIIZ), false, false, null, null, false, null, 1019)) && (setLLIIIZ.size() < shareContactListViewModel.yQ2() || setLLIIIZ.contains(obj2))) {
                                setLLIIIZ.add(obj2);
                                arrayList.add(obj2);
                            }
                        }
                        ((C259800zU) awS230S0300000_21.l1).element = arrayList;
                        List list4 = (List) awS230S0300000_21.l0;
                        C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
                        c13dvLIZIZ.addAll(list4);
                        for (IMContact iMContact : list) {
                            if (!c13dvLIZIZ.contains(iMContact)) {
                                c13dvLIZIZ.add(iMContact);
                            }
                        }
                        List listLIZ = C1697820uHc.LIZ(c13dvLIZIZ);
                        C1361720lXW c1361720lXW = ((ShareContactListViewModel) awS230S0300000_21.l2).LLILZLL;
                        if (c1361720lXW != null) {
                            C1362190lYH c1362190lYHLIZ = C1362190lYH.LIZ(c1362190lYH, null, listLIZ, setLLIIIZ, false, false, null, null, false, null, 1017);
                            Iterator it3 = ((List) awS230S0300000_21.l0).iterator();
                            int i2 = 0;
                            while (true) {
                                if (it3.hasNext()) {
                                    Object next = it3.next();
                                    if ((next instanceof IMUser) || (next instanceof IMConversation)) {
                                        break;
                                    }
                                    i2++;
                                } else {
                                    i2 = -1;
                                    break;
                                }
                            }
                            ShareContactListViewModel shareContactListViewModel2 = (ShareContactListViewModel) awS230S0300000_21.l2;
                            C1362120lYA c1362120lYA = shareContactListViewModel2.LLILLJJLI;
                            if (c1362120lYA != null && (sharePackage = c1362120lYA.LL) != null) {
                                IMContact iMContact2 = null;
                                C1362170lYF c1362170lYF = new C1362170lYF(c1362190lYHLIZ, shareContactListViewModel2, sharePackage, null);
                                List list5 = (List) awS230S0300000_21.l0;
                                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list5, 10));
                                int i3 = 0;
                                for (Object obj3 : list5) {
                                    int i4 = i3 + 1;
                                    if (i3 >= 0) {
                                        IMContact iMContact3 = (IMContact) obj3;
                                        arrayList2.add(c1361720lXW.LIZ(c1361720lXW.LIZIZ(i3, iMContact3), c1362170lYF, iMContact3));
                                        i3 = i4;
                                    } else {
                                        C1697810uHb.LJIJI();
                                        throw null;
                                    }
                                }
                                C1362170lYF c1362170lYF2 = new C1362170lYF(c1362190lYHLIZ, (ShareContactListViewModel) awS230S0300000_21.l2, sharePackage, null);
                                List list6 = (List) awS230S0300000_21.l0;
                                C13DV c13dvLIZIZ2 = C1697820uHc.LIZIZ();
                                int i5 = i + 1;
                                int size = list2.size();
                                while (i5 < size) {
                                    InterfaceC1361730lXX interfaceC1361730lXX = (InterfaceC1361730lXX) ListProtector.get(list2, i5);
                                    IMContact iMContactLJLJJI = interfaceC1361730lXX.LJLJJI();
                                    if (iMContactLJLJJI != null) {
                                        if (!(list6 instanceof Collection) || !list6.isEmpty()) {
                                            Iterator it4 = list6.iterator();
                                            while (it4.hasNext()) {
                                                if (Intrinsics.LJFF(((BaseContact) it4.next()).getUid(), iMContactLJLJJI.getUid())) {
                                                    break;
                                                }
                                            }
                                        }
                                        iMContact2 = null;
                                        c13dvLIZIZ2.add(c1361720lXW.LIZ(interfaceC1361730lXX, c1362170lYF2, iMContact2));
                                    } else {
                                        c13dvLIZIZ2.add(c1361720lXW.LIZ(interfaceC1361730lXX, c1362170lYF2, iMContact2));
                                    }
                                    i5++;
                                    iMContact2 = null;
                                }
                                List listLIZ2 = C1697820uHc.LIZ(c13dvLIZIZ2);
                                C13DV c13dvLIZIZ3 = C1697820uHc.LIZIZ();
                                for (int i6 = 0; i6 < i; i6++) {
                                    c13dvLIZIZ3.add(c1361720lXW.LIZ((InterfaceC1361730lXX) ListProtector.get(list2, i6), c1362170lYF2, null));
                                }
                                List listLIZ3 = C1697820uHc.LIZ(c13dvLIZIZ3);
                                List listLJLIL = C13LP.LJLIL(listLIZ2, C13LP.LJLIL(arrayList2, listLIZ3));
                                if (i2 >= 0) {
                                    ArrayList arrayList3 = new ArrayList();
                                    int i7 = 0;
                                    for (Object obj4 : arrayList2) {
                                        int i8 = i7 + 1;
                                        if (i7 >= 0) {
                                            if (i7 != i2) {
                                                arrayList3.add(obj4);
                                            }
                                            i7 = i8;
                                        } else {
                                            C1697810uHb.LJIJI();
                                            throw null;
                                        }
                                    }
                                    ((ShareContactListViewModel) awS230S0300000_21.l2).setState(new AwS16S0401000_21(C13LP.LJLIL(listLIZ2, C13LP.LJLIL(arrayList3, listLIZ3)), (List<? extends InterfaceC1361730lXX>) listLIZ, (List<? extends IMContact>) setLLIIIZ, (Set<IMContact>) listLJLIL, (List<? extends InterfaceC1361730lXX>) (i + i2), 3));
                                } else {
                                    ((ShareContactListViewModel) awS230S0300000_21.l2).setState(new AwS230S0300000_21(listLJLIL, (List<? extends InterfaceC1361730lXX>) listLIZ, (List<? extends IMContact>) setLLIIIZ, (Set<IMContact>) 25));
                                }
                            }
                        }
                    }
                } else {
                    i++;
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS230S0300000_21 awS230S0300000_21, Object obj) {
        ((DanmakuListFragment) awS230S0300000_21.l0).getContext();
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (!C036E.LIZ.LIZIZ()) {
            C1389890mGx c1389890mGx = new C1389890mGx((View) awS230S0300000_21.l1);
            c1389890mGx.LJIIIZ(2131829435);
            c1389890mGx.LJIIJJI();
        } else {
            DanmakuListViewModel danmakuListViewModelSR = ((DanmakuListFragment) awS230S0300000_21.l0).SR();
            C1158140gFA c1158140gFA = (C1158140gFA) awS230S0300000_21.l2;
            C1384300m7w c1384300m7w = c1158140gFA.LL;
            C1361150lWb c1361150lWb = C1361150lWb.LIZ;
            Aweme aweme = danmakuListViewModelSR.LL;
            String str = danmakuListViewModelSR.LLILLJJLI;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            String str3 = c1384300m7w.LJIIJJI;
            if (str3 != null) {
                str2 = str3;
            }
            boolean zLJFF = Intrinsics.LJFF(c1384300m7w.LJIIZILJ, ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
            String value = EnumC1361130lWZ.DANMAKU_LIST.getValue();
            EnumC255700yp enumC255700yp = EnumC255700yp.IS_NOT_LANDSCAPE;
            c1361150lWb.getClass();
            C1361150lWb.LJI(new DeleteDanmakuEvent(), Collections.singletonList(new C00I8(str2, zLJFF ? 1 : 0, value, enumC255700yp.getValue())), aweme, C0SXF.LJJIFFI(null, Boolean.FALSE, str));
            C1383870m7F c1383870m7F = danmakuListViewModelSR.LLILLL;
            if (c1383870m7F != null) {
                c1383870m7F.LIZIZ(c1384300m7w, new InterfaceC1383970m7P() { // from class: X.0m7B
                    @Override // X.InterfaceC1383970m7P
                    public final void onFail() {
                    }

                    @Override // X.InterfaceC1383970m7P
                    public final void onSuccess() {
                    }
                });
            }
            danmakuListViewModelSR.listRemoveItem(c1158140gFA);
            danmakuListViewModelSR.withState(new AwS600S0100000_21(danmakuListViewModelSR, 381));
            C1440005kM.LIZ(new C1164270gP3(((C1158140gFA) awS230S0300000_21.l2).LL));
        }
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS230S0300000_21(android.content.Context r3, X.InterfaceC1369790lkX r4, kotlin.jvm.functions.Function1 r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            int r6 = 11 - r6
            if (r6 == 0) goto L12
            r1 = r2
            r1.l0 = r4
            r1.l1 = r3
            r1.l2 = r5
            r0 = 1
        Le:
            r1.<init>(r0)
            return
        L12:
            r1 = r2
            r1.l0 = r5
            r1.l1 = r4
            r1.l2 = r3
            r0 = 1
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS230S0300000_21.<init>(android.content.Context, X.0lkX, kotlin.jvm.functions.Function1, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS230S0300000_21(C013C c013c, C1387170mCZ c1387170mCZ, Number number, int i) {
        super(1);
        this.$t = i;
        this.l0 = c013c;
        this.l1 = c1387170mCZ;
        this.l2 = number;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS230S0300000_21(C712520RxC c712520RxC, C1393570mMt c1393570mMt, InterfaceC705550Rlx interfaceC705550Rlx, int i) {
        super(1);
        this.$t = i;
        this.l0 = c712520RxC;
        this.l1 = c1393570mMt;
        this.l2 = interfaceC705550Rlx;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS230S0300000_21(C1342780l2y c1342780l2y, CommentPublishViewModel commentPublishViewModel, CommentResponse commentResponse, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1342780l2y;
        this.l1 = commentPublishViewModel;
        this.l2 = commentResponse;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS230S0300000_21(C1353360lK2 c1353360lK2, C1353360lK2 c1353360lK22, TextExtraStruct textExtraStruct, Map<String, String> map) {
        super(1);
        this.$t = map;
        this.l0 = c1353360lK2;
        this.l1 = c1353360lK22;
        this.l2 = textExtraStruct;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS230S0300000_21(C1354540lLw c1354540lLw, C1354580lM0 c1354580lM0, Function0 function0, int i) {
        super(1);
        this.$t = i;
        this.l0 = function0;
        this.l1 = c1354580lM0;
        this.l2 = c1354540lLw;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS230S0300000_21(C1354540lLw c1354540lLw, C1354580lM0 c1354580lM0, AwS149S0400000_21 awS149S0400000_21, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1354580lM0;
        this.l1 = c1354540lLw;
        this.l2 = awS149S0400000_21;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS230S0300000_21(InterfaceC1380640m22 interfaceC1380640m22, AFwS259S0000000_21 aFwS259S0000000_21, AwS600S0100000_21 awS600S0100000_21, int i) {
        super(1);
        this.$t = i;
        this.l0 = interfaceC1380640m22;
        this.l1 = aFwS259S0000000_21;
        this.l2 = awS600S0100000_21;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS230S0300000_21(C1393030mM1 c1393030mM1, User user, C127A c127a, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1393030mM1;
        this.l1 = user;
        this.l2 = c127a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS230S0300000_21(InterfaceC1393560mMs interfaceC1393560mMs, C2344009Gk c2344009Gk, C1388830mFF c1388830mFF, int i) {
        super(1);
        this.$t = i;
        this.l0 = interfaceC1393560mMs;
        this.l1 = c2344009Gk;
        this.l2 = c1388830mFF;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS230S0300000_21(C1394000mNa c1394000mNa, C1394730mOl c1394730mOl, C2344009Gk c2344009Gk, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1394000mNa;
        this.l1 = c1394730mOl;
        this.l2 = c2344009Gk;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS230S0300000_21(C1399210mVz c1399210mVz, C1397480mTC c1397480mTC, C2344009Gk c2344009Gk, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1399210mVz;
        this.l1 = c1397480mTC;
        this.l2 = c2344009Gk;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS230S0300000_21(View view, C1158140gFA c1158140gFA, DanmakuListFragment danmakuListFragment, int i) {
        super(1);
        this.$t = i;
        this.l0 = danmakuListFragment;
        this.l1 = view;
        this.l2 = c1158140gFA;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS230S0300000_21(BottomBarFragment bottomBarFragment, View view, BottomBarProtocol bottomBarProtocol, int i) {
        super(1);
        this.$t = i;
        this.l0 = bottomBarFragment;
        this.l1 = view;
        this.l2 = bottomBarProtocol;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS230S0300000_21(RefactorKeyboardPanelV2 refactorKeyboardPanelV2, View view, C013C c013c, int i) {
        super(1);
        this.$t = i;
        this.l0 = refactorKeyboardPanelV2;
        this.l1 = view;
        this.l2 = c013c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS230S0300000_21(CommentInputContent commentInputContent, Aweme aweme, EnumC1346360l8k enumC1346360l8k, int i) {
        super(1);
        this.$t = i;
        this.l0 = commentInputContent;
        this.l1 = aweme;
        this.l2 = enumC1346360l8k;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS230S0300000_21(CommentResponse commentResponse, C1345120l6k c1345120l6k, CommentPublishViewModel commentPublishViewModel, int i) {
        super(1);
        this.$t = i;
        this.l0 = commentResponse;
        this.l1 = c1345120l6k;
        this.l2 = commentPublishViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS230S0300000_21(SharePanelSendButtonAssem sharePanelSendButtonAssem, ICreateGroupAbility iCreateGroupAbility, SharePackage sharePackage, int i) {
        super(1);
        this.$t = i;
        this.l0 = sharePanelSendButtonAssem;
        this.l1 = iCreateGroupAbility;
        this.l2 = sharePackage;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS230S0300000_21(User user, EnumC1392960mLu enumC1392960mLu, C127A c127a, int i) {
        super(1);
        this.$t = i;
        this.l0 = user;
        this.l1 = enumC1392960mLu;
        this.l2 = c127a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS230S0300000_21(MufUserCell mufUserCell, User user, C127A c127a, int i) {
        super(1);
        this.$t = i;
        this.l0 = mufUserCell;
        this.l1 = user;
        this.l2 = c127a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS230S0300000_21(SharePackage sharePackage, C1363340la8 c1363340la8, C23260099m c23260099m, int i) {
        super(1);
        this.$t = i;
        this.l0 = sharePackage;
        this.l1 = c1363340la8;
        this.l2 = c23260099m;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS230S0300000_21(StickerAnchorMaker stickerAnchorMaker, C1394730mOl c1394730mOl, C2344009Gk c2344009Gk, int i) {
        super(1);
        this.$t = i;
        this.l0 = stickerAnchorMaker;
        this.l1 = c1394730mOl;
        this.l2 = c2344009Gk;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS230S0300000_21(List list, List<? extends IMContact> list2, C259800zU<List<IMContact>> c259800zU, ShareContactListViewModel shareContactListViewModel) {
        super(1);
        this.$t = shareContactListViewModel;
        this.l0 = list;
        this.l1 = list2;
        this.l2 = c259800zU;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS230S0300000_21(List list, List<? extends BottomBarProtocol> list2, BottomBarFragment bottomBarFragment, View view) {
        super(1);
        this.$t = view;
        this.l0 = list;
        this.l1 = list2;
        this.l2 = bottomBarFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS230S0300000_21(List list, List<? extends InterfaceC1361730lXX> list2, List<? extends IMContact> list3, Set<IMContact> set) {
        super(1);
        this.$t = set;
        this.l0 = list;
        this.l1 = list2;
        this.l2 = list3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS230S0300000_21(Pair pair, Pair<String, Long> pair2, CommentAudioRecordViewModel commentAudioRecordViewModel, float[] fArr) {
        super(1);
        this.$t = fArr;
        this.l0 = pair;
        this.l1 = pair2;
        this.l2 = commentAudioRecordViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS230S0300000_21(Function1 function1, Function1<? super Boolean, Unit> function12, C1374350lrt c1374350lrt, Context context) {
        super(1);
        this.$t = context;
        this.l0 = function1;
        this.l1 = function12;
        this.l2 = c1374350lrt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS230S0300000_21(Function1 function1, Function1<? super Boolean, Unit> function12, C1374410lrz c1374410lrz, Context context) {
        super(1);
        this.$t = context;
        this.l0 = function1;
        this.l1 = function12;
        this.l2 = c1374410lrz;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS230S0300000_21(Function1 function1, Function1<? super Boolean, Unit> function12, C1374420ls0 c1374420ls0, Context context) {
        super(1);
        this.$t = context;
        this.l0 = function1;
        this.l1 = function12;
        this.l2 = c1374420ls0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS230S0300000_21(Function1 function1, Function1<? super Boolean, Unit> function12, C1374430ls1 c1374430ls1, Context context) {
        super(1);
        this.$t = context;
        this.l0 = function1;
        this.l1 = function12;
        this.l2 = c1374430ls1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS230S0300000_21(Function1 function1, Function1<? super Boolean, Unit> function12, C1374510ls9 c1374510ls9, Context context) {
        super(1);
        this.$t = context;
        this.l0 = function1;
        this.l1 = function12;
        this.l2 = c1374510ls9;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS230S0300000_21(Function1 function1, Function1<? super Boolean, Unit> function12, C1374520lsA c1374520lsA, Context context) {
        super(1);
        this.$t = context;
        this.l0 = function1;
        this.l1 = function12;
        this.l2 = c1374520lsA;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS230S0300000_21(Function1 function1, Function1<? super Boolean, Unit> function12, C1374560lsE c1374560lsE, Context context) {
        super(1);
        this.$t = context;
        this.l0 = function1;
        this.l1 = function12;
        this.l2 = c1374560lsE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS230S0300000_21(C1381210m2x c1381210m2x, C1381210m2x c1381210m2x2, C19EG c19eg, InterfaceC1381220m2y interfaceC1381220m2y, CompletionBlock<InterfaceC1381230m2z> completionBlock) {
        super(1);
        this.$t = completionBlock;
        this.l0 = c1381210m2x;
        this.l1 = c19eg;
        this.l2 = interfaceC1381220m2y;
    }
}
