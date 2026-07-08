package kotlin.jvm.internal;

import X.C07ZA;
import X.C09AY;
import X.C1002190cBd;
import X.C1023640ckE;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1397620mTQ;
import X.C13BV;
import X.C13LP;
import X.C15438062q;
import X.C1801950wzZ;
import X.C1802070wzl;
import X.C1804840x4E;
import X.C1806600x74;
import X.C1838970xxH;
import X.C1850190yFN;
import X.C1852860yJg;
import X.C1853060yK0;
import X.C1853070yK1;
import X.C1855040yNC;
import X.C1857530yRD;
import X.C1861040yWs;
import X.C1861520yXe;
import X.C1862480yZC;
import X.C1863220yaO;
import X.C1863340yaa;
import X.C20227614Cs;
import X.C2097608Jq;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C291001Au;
import X.C500260Jjc;
import X.C786410Ut5;
import X.C911590ZpV;
import X.EnumC1783370wVb;
import X.EnumC1791270wiL;
import X.EnumC1799930wwJ;
import X.EnumC1861450yXX;
import X.InterfaceC1783650wW3;
import android.content.Context;
import android.os.SystemClock;
import android.widget.ImageView;
import com.bytedance.android.live.walletnew.RechargeDialogNew;
import com.bytedance.android.live.walletnew.RechargeViewModel;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.wallet.Diamond;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.IMAiGroupShotConfig;
import com.ss.android.ugc.aweme.IMAiGroupShotServiceImpl;
import com.ss.android.ugc.aweme.compliance.business.policynotice.ui.UniversalPopupPanelUI;
import com.ss.android.ugc.aweme.exp.groupshot.AIGroupShotConfig;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tako.autoplay.TakoAutoPlayController;
import com.ss.android.ugc.aweme.tako.botpage.actionbar.model.TakoActiveBotItem;
import com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.MessageSender;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoClientExt;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.model.SmartSearchItem;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes28.dex */
public class AwS141S1100000_27 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public String s0;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS141S1100000_27 awS141S1100000_27, Object obj) {
        C1861040yWs c1861040yWs = (C1861040yWs) obj;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(c1861040yWs.LL.LIZ);
        C291001Au c291001Au = new C291001Au(arrayList);
        boolean z = false;
        ((MessageViewModel) awS141S1100000_27.l1).lR2(arrayList, EnumC1861450yXX.ASK_QUESTION_BEFORE, new C1861520yXe(awS141S1100000_27.s0, false, false, false, null, null, null, null, null, null, false, 2046));
        return C1861040yWs.LIZ(c1861040yWs, c291001Au, false, true, null, null, false, false, new C1857530yRD(z, z, 127), null, false, 0L, false, null, null, null, null, null, null, false, null, false, null, 0L, null, null, null, null, null, 1073741690);
    }

    public static final Object invoke$1(AwS141S1100000_27 awS141S1100000_27, Object obj) {
        ArrayList arrayList;
        List<Diamond> listLJIIJ;
        C1804840x4E c1804840x4E = (C1804840x4E) obj;
        RechargeViewModel rechargeViewModelQS = ((RechargeDialogNew) awS141S1100000_27.l1).qS();
        Boolean boolValueOf = null;
        if (c1804840x4E != null && (listLJIIJ = c1804840x4E.LJIIJ(awS141S1100000_27.s0)) != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(listLJIIJ, 10));
            for (Diamond diamond : listLJIIJ) {
                arrayList.add(new C1806600x74(diamond.LIZ, diamond));
            }
        } else {
            arrayList = null;
            if (c1804840x4E != null) {
            }
            return rechargeViewModelQS.UQ2(awS141S1100000_27.s0, arrayList, C500260Jjc.LJJJI(boolValueOf), true);
        }
        boolValueOf = Boolean.valueOf(c1804840x4E.LJIJJLI());
        return rechargeViewModelQS.UQ2(awS141S1100000_27.s0, arrayList, C500260Jjc.LJJJI(boolValueOf), true);
    }

    public static final Object invoke$10(AwS141S1100000_27 awS141S1100000_27, Object obj) {
        return C1855040yNC.LIZ((C1855040yNC) obj, null, null, null, null, false, false, (List) awS141S1100000_27.l1, awS141S1100000_27.s0, null, false, null, null, null, null, null, false, false, false, 261951);
    }

    public static final Object invoke$11(AwS141S1100000_27 awS141S1100000_27, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        String string = awS141S1100000_27.s0;
        if (string == null) {
            string = ((Context) awS141S1100000_27.l1).getResources().getString(2131850939);
        }
        c1397620mTQ.LIZJ(0, string, AFwS269S0000000_27.get$arr$(383));
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS141S1100000_27 awS141S1100000_27, Object obj) {
        C07ZA c07za = (C07ZA) obj;
        EnumC1799930wwJ enumC1799930wwJLIZ = C1801950wzZ.LIZ(((C1802070wzl) awS141S1100000_27.l1).LIZIZ.invoke(), awS141S1100000_27.s0, c07za, ((C1802070wzl) awS141S1100000_27.l1).LJFF);
        if (enumC1799930wwJLIZ == null) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("mission cta route failed, type:");
            sbLIZ.append(c07za.LIZ);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        return enumC1799930wwJLIZ;
    }

    public static final Object invoke$13(AwS141S1100000_27 awS141S1100000_27, Object obj) {
        return C1853070yK1.LIZ((C1853070yK1) obj, null, new C1852860yJg((List) awS141S1100000_27.l1, awS141S1100000_27.s0, false, 4), null, null, null, null, 219);
    }

    public static final Object invoke$14(AwS141S1100000_27 awS141S1100000_27, Object obj) {
        Message message = (Message) obj;
        message.sender = new MessageSender(1, 0L, 0L, true, "");
        message.msgType = 3;
        message.uuid = awS141S1100000_27.s0;
        String searchMessageId = ((TakoEnterParams) awS141S1100000_27.l1).getSearchMessageId();
        if (searchMessageId == null) {
            searchMessageId = "";
        }
        message.msgId = searchMessageId;
        message.LIZLLL = System.currentTimeMillis();
        message.LIZIZ = 1;
        if (C20227614Cs.LIZIZ((TakoEnterParams) awS141S1100000_27.l1)) {
            TakoEnterParams takoEnterParams = (TakoEnterParams) awS141S1100000_27.l1;
            message.botId = takoEnterParams.botInfo.botId;
            message.subSessionId = takoEnterParams.getSubProcessId();
        }
        message.LIZJ(new AwS609S0100000_30((TakoEnterParams) awS141S1100000_27.l1, 218));
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS141S1100000_27 awS141S1100000_27, Object obj) {
        C1863220yaO c1863220yaO = (C1863220yaO) obj;
        c1863220yaO.LIZ = false;
        c1863220yaO.LIZIZ = false;
        String strLIZ = C1862480yZC.LIZ(((TakoEnterParams) awS141S1100000_27.l1).getCarriedRepeatKey());
        if (strLIZ == null) {
            strLIZ = awS141S1100000_27.s0;
        }
        c1863220yaO.LIZJ = strLIZ;
        return Unit.LIZ;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$16(kotlin.jvm.internal.AwS141S1100000_27 r10, java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS141S1100000_27.invoke$16(kotlin.jvm.internal.AwS141S1100000_27, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$17(AwS141S1100000_27 awS141S1100000_27, Object obj) {
        C1863220yaO c1863220yaO = (C1863220yaO) obj;
        c1863220yaO.LIZ = false;
        c1863220yaO.LIZIZ = false;
        String strLIZ = C1862480yZC.LIZ(((TakoEnterParams) awS141S1100000_27.l1).getCarriedRepeatKey());
        if (strLIZ == null) {
            strLIZ = awS141S1100000_27.s0;
        }
        c1863220yaO.LIZJ = strLIZ;
        return Unit.LIZ;
    }

    public static final Object invoke$18(AwS141S1100000_27 awS141S1100000_27, Object obj) {
        new AwS141S1100000_27((TakoEnterParams) awS141S1100000_27.l1, awS141S1100000_27.s0, 17).invoke(((C1863340yaa) obj).LIZLLL);
        return Unit.LIZ;
    }

    public static final Object invoke$19(AwS141S1100000_27 awS141S1100000_27, Object obj) {
        Message message = (Message) obj;
        message.sender = new MessageSender(2, 0L, 0L, false, "");
        message.msgType = 3;
        message.uuid = UUID.randomUUID().toString();
        message.LIZLLL = System.currentTimeMillis();
        message.LIZIZ = 1;
        message.LIZJ(new AwS80S1000000_30(awS141S1100000_27.s0, 8));
        TakoActiveBotItem takoActiveBotItem = (TakoActiveBotItem) awS141S1100000_27.l1;
        message.botId = takoActiveBotItem.bot.botId;
        message.subSessionId = takoActiveBotItem.processId;
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS141S1100000_27 awS141S1100000_27, Object obj) {
        IMAiGroupShotServiceImpl iMAiGroupShotServiceImpl = (IMAiGroupShotServiceImpl) awS141S1100000_27.l1;
        String str = awS141S1100000_27.s0;
        iMAiGroupShotServiceImpl.getClass();
        return IMAiGroupShotServiceImpl.LJFF(str, (String) obj);
    }

    public static final Object invoke$20(AwS141S1100000_27 awS141S1100000_27, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        TakoAutoPlayController takoAutoPlayController = (TakoAutoPlayController) awS141S1100000_27.l1;
        takoAutoPlayController.LJIILL.put(awS141S1100000_27.s0, Boolean.valueOf(zBooleanValue));
        InterfaceC1783650wW3 interfaceC1783650wW3 = takoAutoPlayController.LIZIZ.LIZ;
        if (interfaceC1783650wW3 != null) {
            interfaceC1783650wW3.LJIILJJIL(zBooleanValue);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$21(AwS141S1100000_27 awS141S1100000_27, Object obj) {
        return C1853060yK0.LIZ((C1853060yK0) obj, null, null, false, null, new C1852860yJg((List) awS141S1100000_27.l1, awS141S1100000_27.s0, false, 4), null, null, false, null, null, null, null, null, 0, null, 65391);
    }

    public static final Object invoke$22(AwS141S1100000_27 awS141S1100000_27, Object obj) {
        long jUptimeMillis;
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1838970xxH c1838970xxH = (C1838970xxH) awS141S1100000_27.l1;
        c1023640ckE.withContext(C13LP.LJJJLZIJ(((Number) c1838970xxH.LLIZLLLIL.getValue()).intValue(), (List) c1838970xxH.LLILZ.LLILLJJLI.getValue()));
        C1850190yFN.LIZ.getClass();
        c1023640ckE.withParam(C1850190yFN.LJ, awS141S1100000_27.s0);
        c1023640ckE.withParam(C1850190yFN.LJFF, ((C1838970xxH) awS141S1100000_27.l1).LLIZLLLIL.getValue());
        c1023640ckE.withParam(C1850190yFN.LJIIZILJ, Boolean.FALSE);
        C1002190cBd c1002190cBd = C1850190yFN.LJIJ;
        Long l = ((C1838970xxH) awS141S1100000_27.l1).LLILZLL;
        if (l != null) {
            jUptimeMillis = SystemClock.uptimeMillis() - l.longValue();
        } else {
            jUptimeMillis = 0;
        }
        c1023640ckE.withParam(c1002190cBd, Long.valueOf(jUptimeMillis));
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object] */
    public static final Object invoke$23(AwS141S1100000_27 awS141S1100000_27, Object obj) {
        TakoMixFeed takoMixFeed = (TakoMixFeed) obj;
        List<BaseImage> list = takoMixFeed.images;
        String str = awS141S1100000_27.s0;
        Function1 function1 = (Function1) awS141S1100000_27.l1;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (BaseImage baseImageInvoke : list) {
            if (Intrinsics.LJFF(baseImageInvoke.imageUuid, str)) {
                baseImageInvoke = function1.invoke(baseImageInvoke);
            }
            arrayList.add(baseImageInvoke);
        }
        takoMixFeed.images = arrayList;
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS141S1100000_27 awS141S1100000_27, Object obj) {
        IMAiGroupShotServiceImpl iMAiGroupShotServiceImpl = (IMAiGroupShotServiceImpl) awS141S1100000_27.l1;
        String str = awS141S1100000_27.s0;
        C13BV c13bv = C13BV.INSTANCE;
        iMAiGroupShotServiceImpl.getClass();
        return new IMAiGroupShotConfig.ContactSelectConfig.CustomTopAction.Visible(R.raw.icon_two_person_large_fill, R.raw.icon_chevron_right_offset_ltr, new IMAiGroupShotConfig.Text.FromRes(2131835412), new IMAiGroupShotConfig.CustomClick.MoveToNext(new IMAiGroupShotConfig.ContactSelectConfig.Selecting(iMAiGroupShotServiceImpl.LIZ, ((AIGroupShotConfig) C911590ZpV.LIZ.getValue()).inviteFriendsGroupLimit - 1, c13bv, new AwS141S1100000_27(iMAiGroupShotServiceImpl, str, 8), EnumC1783370wVb.MUF, str, new IMAiGroupShotConfig.Action.CreateNewGroup(str)), 1));
    }

    public static /* bridge */ /* synthetic */ Object invoke$4(AwS141S1100000_27 awS141S1100000_27, Object obj) {
        C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(awS141S1100000_27.s0);
        c1331670kl3LJIIIZ.LJJIJL(((UniversalPopupPanelUI) awS141S1100000_27.l1).requireContext());
        c1331670kl3LJIIIZ.LJJI((ImageView) obj);
        c1331670kl3LJIIIZ.LIZLLL(((UniversalPopupPanelUI) awS141S1100000_27.l1).getClass().getSimpleName());
        C786410Ut5.h3(c1331670kl3LJIIIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS141S1100000_27 awS141S1100000_27, Object obj) {
        TakoMixFeed takoMixFeed = (TakoMixFeed) obj;
        List<BaseImage> list = takoMixFeed.images;
        String str = awS141S1100000_27.s0;
        BaseImage baseImage = (BaseImage) awS141S1100000_27.l1;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (BaseImage baseImageCopy : list) {
            if (Intrinsics.LJFF(baseImageCopy.uri, str) && Intrinsics.LJFF(baseImageCopy.imageUuid, baseImage.imageUuid)) {
                baseImageCopy = baseImageCopy.copy(baseImageCopy.imageId, baseImageCopy.innerUrlList, baseImageCopy.urlList, baseImageCopy.thumbnailUrlList, baseImageCopy.width, baseImageCopy.height, baseImageCopy.uri, 0L, baseImageCopy.localCachePath, baseImageCopy.compressedFilePath, baseImageCopy.compressedFileSize, baseImageCopy.imageSource, 4, baseImageCopy.originalFileSize, baseImageCopy.imageUuid, baseImageCopy.stdSize, baseImageCopy.imageSceneType, baseImageCopy.extraInfo);
            }
            arrayList.add(baseImageCopy);
        }
        takoMixFeed.images = arrayList;
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS141S1100000_27 awS141S1100000_27, Object obj) {
        String string;
        TakoMixFeed takoMixFeed = (TakoMixFeed) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(awS141S1100000_27.s0);
        sbLIZ.append("-1");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        Pair[] pairArr = new Pair[4];
        String str = ((SmartSearchItem) awS141S1100000_27.l1).panelImplId;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        pairArr[0] = new Pair("panel_impr_id", str);
        String str3 = ((SmartSearchItem) awS141S1100000_27.l1).wordContent;
        if (str3 == null) {
            str3 = "";
        }
        pairArr[1] = new Pair("words_content", str3);
        String str4 = ((SmartSearchItem) awS141S1100000_27.l1).messageType;
        if (str4 == null) {
            str4 = "";
        }
        pairArr[2] = new Pair("message_type", str4);
        Integer numIsPhoto = ((SmartSearchItem) awS141S1100000_27.l1).isPhoto();
        if (numIsPhoto != null && (string = numIsPhoto.toString()) != null) {
            str2 = string;
        }
        pairArr[3] = new Pair("is_photo", str2);
        takoMixFeed.clientExt = new TakoClientExt(strLIZIZ, "", true, C2097608Jq.LJIIIIZZ(pairArr));
        return Unit.LIZ;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$7(kotlin.jvm.internal.AwS141S1100000_27 r10, java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS141S1100000_27.invoke$7(kotlin.jvm.internal.AwS141S1100000_27, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$8(AwS141S1100000_27 awS141S1100000_27, Object obj) {
        IMAiGroupShotServiceImpl iMAiGroupShotServiceImpl = (IMAiGroupShotServiceImpl) awS141S1100000_27.l1;
        String str = awS141S1100000_27.s0;
        iMAiGroupShotServiceImpl.getClass();
        return IMAiGroupShotServiceImpl.LJFF(str, (String) obj);
    }

    public static final Object invoke$9(AwS141S1100000_27 awS141S1100000_27, Object obj) {
        if (obj == EnumC1791270wiL.SUCCEED) {
            SmartRouter.buildRoute((Context) awS141S1100000_27.l1, awS141S1100000_27.s0).open();
        }
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS141S1100000_27(com.ss.android.ugc.aweme.tako.model.TakoEnterParams r3, java.lang.String r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            switch(r5) {
                case 7: goto Lf;
                case 15: goto Lf;
                case 16: goto Lf;
                case 17: goto Lf;
                case 18: goto Lf;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.s0 = r4
            r1.l1 = r3
            r0 = 1
        Lb:
            r1.<init>(r0)
            return
        Lf:
            r1 = r2
            r1.l1 = r3
            r1.s0 = r4
            r0 = 1
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS141S1100000_27.<init>(com.ss.android.ugc.aweme.tako.model.TakoEnterParams, java.lang.String, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS141S1100000_27(C1802070wzl c1802070wzl, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c1802070wzl;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS141S1100000_27(C1838970xxH c1838970xxH, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c1838970xxH;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS141S1100000_27(Context context, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = context;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS141S1100000_27(RechargeDialogNew rechargeDialogNew, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = rechargeDialogNew;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS141S1100000_27(IMAiGroupShotServiceImpl iMAiGroupShotServiceImpl, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = iMAiGroupShotServiceImpl;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS141S1100000_27(TakoAutoPlayController takoAutoPlayController, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = takoAutoPlayController;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS141S1100000_27(TakoActiveBotItem takoActiveBotItem, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = takoActiveBotItem;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS141S1100000_27(MessageViewModel messageViewModel, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = messageViewModel;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS141S1100000_27(BaseImage baseImage, String str, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = baseImage;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS141S1100000_27(String str, Context context, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS141S1100000_27(String str, UniversalPopupPanelUI universalPopupPanelUI, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = universalPopupPanelUI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS141S1100000_27(String str, SmartSearchItem smartSearchItem, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = smartSearchItem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS141S1100000_27(String str, AwS77S1000000_27 awS77S1000000_27, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = awS77S1000000_27;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS141S1100000_27(List list, List<BaseImage> list2, String str) {
        super(1);
        this.$t = str;
        this.l1 = list;
        this.s0 = list2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS141S1100000_27(IMAiGroupShotServiceImpl iMAiGroupShotServiceImpl, Context context, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = iMAiGroupShotServiceImpl;
        this.s0 = str;
    }
}
