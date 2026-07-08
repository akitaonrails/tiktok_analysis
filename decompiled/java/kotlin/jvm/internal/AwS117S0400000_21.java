package kotlin.jvm.internal;

import X.AbstractC21673619ry;
import X.C013C;
import X.C09AY;
import X.C0PEM;
import X.C1104190eq9;
import X.C123100dR;
import X.C1246630iXt;
import X.C1322480kWE;
import X.C1340400kz8;
import X.C1341800l1O;
import X.C1343990l4v;
import X.C1344030l4z;
import X.C1346950l9h;
import X.C1355460lNQ;
import X.C1371590lnR;
import X.C1371740lng;
import X.C1373610lqh;
import X.C1374500ls8;
import X.C1374530lsB;
import X.C1374570lsF;
import X.C1377070lwH;
import X.C1387170mCZ;
import X.C1387980mDs;
import X.C1387990mDt;
import X.C1392540mLE;
import X.C1393570mMt;
import X.C1393580mMu;
import X.C1393590mMv;
import X.C1394670mOf;
import X.C1394730mOl;
import X.C1397480mTC;
import X.C1397620mTQ;
import X.C1397660mTU;
import X.C1399360mWE;
import X.C1400640mYI;
import X.C15438062q;
import X.C1697810uHb;
import X.C19871212ow;
import X.C19EG;
import X.C1DFH;
import X.C20684815ws;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C2344009Gk;
import X.C259800zU;
import X.C291001Au;
import X.C712520RxC;
import X.C735370Ssx;
import X.C786410Ut5;
import X.EnumC1346360l8k;
import X.EnumC2196901AyW;
import X.InterfaceC1366490lfD;
import X.InterfaceC1369790lkX;
import X.InterfaceC1393560mMs;
import X.InterfaceC1631620sYq;
import X.InterfaceC2217461Bqa;
import X.InterfaceC705550Rlx;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.gift.model.GiftStruct;
import com.ss.android.ugc.aweme.comment.gift.model.GiftViewModel;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.CommentGiftSelectAssem;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.KeyboardVMV2;
import com.ss.android.ugc.aweme.comment.model.AudioCommentModel;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.comment.model.CommentImageModel;
import com.ss.android.ugc.aweme.comment.model.CommentInputContent;
import com.ss.android.ugc.aweme.comment.model.CommentKeyboardModel;
import com.ss.android.ugc.aweme.comment.model.CommentStickerStruct;
import com.ss.android.ugc.aweme.feed.model.AnchorCustomData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.internalshare.impl.viewmodel.DownloadAndShareViewModel;
import com.ss.android.ugc.aweme.minis.page.main.fragment.MiniGameFragment;
import com.ss.android.ugc.aweme.minis.page.main.fragment.MinisFragment;
import com.ss.android.ugc.aweme.model.PriceInfo;
import com.ss.android.ugc.aweme.model.PurchaseOption;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.music.v2.assem.MusicShootAssem;
import com.ss.android.ugc.aweme.share.improve.channel.CopyLinkChannel;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public class AwS117S0400000_21 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS117S0400000_21 awS117S0400000_21, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LIZJ(1, "Cancel", new AwS230S0300000_21((C013C) awS117S0400000_21.l0, (C1387170mCZ) awS117S0400000_21.l1, (Number) awS117S0400000_21.l2, 0));
        C013C c013c = (C013C) awS117S0400000_21.l0;
        c1397620mTQ.LIZJ(0, "Confirm", new AwS117S0400000_21((C1387170mCZ) awS117S0400000_21.l1, (MiniGameFragment) awS117S0400000_21.l3, (Number) awS117S0400000_21.l2, c013c, 1));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS117S0400000_21 awS117S0400000_21, Object obj) throws JSONException {
        C013C c013c = (C013C) awS117S0400000_21.l0;
        if (!c013c.element) {
            c013c.element = true;
            MiniGameFragment miniGameFragment = (MiniGameFragment) awS117S0400000_21.l1;
            EnumC2196901AyW enumC2196901AyW = EnumC2196901AyW.BACKPRESS;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = MinisFragment.LLLLLLJ;
            miniGameFragment.SR(enumC2196901AyW, false);
            ((C1387170mCZ) awS117S0400000_21.l2).LJFF((Number) awS117S0400000_21.l3, new JSONObject());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS117S0400000_21 awS117S0400000_21, Object obj) {
        InterfaceC1393560mMs interfaceC1393560mMs = (InterfaceC1393560mMs) awS117S0400000_21.l0;
        C712520RxC c712520RxC = (C712520RxC) awS117S0400000_21.l1;
        C2344009Gk c2344009GkLIZ = C1392540mLE.LIZ(interfaceC1393560mMs, c712520RxC, "click_anchor", ((C1393570mMt) awS117S0400000_21.l2).LJI(c712520RxC));
        c2344009GkLIZ.LJ(C1104190eq9.LIZ(((InterfaceC705550Rlx) awS117S0400000_21.l3).rootView(), "c20736.d0"), "btm_param_map_key");
        interfaceC1393560mMs.LJFF(c2344009GkLIZ);
        InterfaceC1393560mMs interfaceC1393560mMs2 = (InterfaceC1393560mMs) awS117S0400000_21.l0;
        C712520RxC c712520RxC2 = (C712520RxC) awS117S0400000_21.l1;
        interfaceC1393560mMs2.LJJJLL((View) obj, C1392540mLE.LIZJ(interfaceC1393560mMs2, c712520RxC2, "click_anchor", ((C1393570mMt) awS117S0400000_21.l2).LJI(c712520RxC2)));
        ((C1393570mMt) awS117S0400000_21.l2).LJIIIIZZ((InterfaceC1393560mMs) awS117S0400000_21.l0, AFwS259S0000000_21.get$arr$(347));
        ((C1393570mMt) awS117S0400000_21.l2).LJII((InterfaceC1393560mMs) awS117S0400000_21.l0, AFwS259S0000000_21.get$arr$(348));
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS117S0400000_21 awS117S0400000_21, Object obj) {
        String strLIZIZ;
        String str;
        InterfaceC1393560mMs interfaceC1393560mMs = (InterfaceC1393560mMs) obj;
        AnchorCustomData anchorCustomData = AwemeBizExtKt.getAnchorCustomData(((C712520RxC) awS117S0400000_21.l0).LIZIZ.LIZ);
        boolean zLIZ = false;
        if (anchorCustomData != null && anchorCustomData.openPdp) {
            C712520RxC c712520RxC = (C712520RxC) awS117S0400000_21.l0;
            interfaceC1393560mMs.LJIIJJI(C1392540mLE.LIZJ(interfaceC1393560mMs, c712520RxC, "click_anchor", ((C1393580mMu) awS117S0400000_21.l1).LJI(c712520RxC)));
        } else {
            HashMap<String, String> mobParams = ((C712520RxC) awS117S0400000_21.l0).LIZIZ.LIZ.getMobParams();
            if (mobParams != null && (str = mobParams.get("click_timestamp")) != null) {
                zLIZ = C123100dR.LIZ(str);
            }
            InterfaceC1631620sYq interfaceC1631620sYq = (InterfaceC1631620sYq) ((C259800zU) awS117S0400000_21.l2).element;
            Boolean bool = Boolean.FALSE;
            Boolean boolValueOf = Boolean.valueOf(zLIZ);
            View viewLJIIL = ((InterfaceC705550Rlx) awS117S0400000_21.l3).LJIIL();
            if (viewLJIIL != null) {
                strLIZIZ = C1104190eq9.LIZIZ(viewLJIIL, "c9855.d4418");
            } else {
                strLIZIZ = null;
            }
            interfaceC1631620sYq.invoke(bool, boolValueOf, strLIZIZ);
            C712520RxC c712520RxC2 = (C712520RxC) awS117S0400000_21.l0;
            interfaceC1393560mMs.LJIIJJI(C1392540mLE.LIZJ(interfaceC1393560mMs, c712520RxC2, "click_list", ((C1393580mMu) awS117S0400000_21.l1).LJI(c712520RxC2)));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS117S0400000_21 awS117S0400000_21, Object obj) {
        String strLIZIZ;
        String str;
        InterfaceC1393560mMs interfaceC1393560mMs = (InterfaceC1393560mMs) obj;
        AnchorCustomData anchorCustomData = AwemeBizExtKt.getAnchorCustomData(((C712520RxC) awS117S0400000_21.l0).LIZIZ.LIZ);
        boolean zLIZ = false;
        if (anchorCustomData != null && anchorCustomData.openPdp) {
            C712520RxC c712520RxC = (C712520RxC) awS117S0400000_21.l0;
            interfaceC1393560mMs.LJIIJJI(C1392540mLE.LIZIZ(c712520RxC, interfaceC1393560mMs, ((C1393590mMv) awS117S0400000_21.l1).LJI(c712520RxC)));
        } else {
            HashMap<String, String> mobParams = ((C712520RxC) awS117S0400000_21.l0).LIZIZ.LIZ.getMobParams();
            if (mobParams != null && (str = mobParams.get("click_timestamp")) != null) {
                zLIZ = C123100dR.LIZ(str);
            }
            C712520RxC c712520RxC2 = (C712520RxC) awS117S0400000_21.l0;
            interfaceC1393560mMs.LJIIJJI(C1392540mLE.LIZIZ(c712520RxC2, interfaceC1393560mMs, ((C1393590mMv) awS117S0400000_21.l1).LJI(c712520RxC2)));
            InterfaceC1631620sYq interfaceC1631620sYq = (InterfaceC1631620sYq) awS117S0400000_21.l2;
            Boolean bool = Boolean.FALSE;
            Boolean boolValueOf = Boolean.valueOf(zLIZ);
            View viewLJIIL = ((InterfaceC705550Rlx) awS117S0400000_21.l3).LJIIL();
            if (viewLJIIL != null) {
                strLIZIZ = C1104190eq9.LIZIZ(viewLJIIL, "c5134.d0");
            } else {
                strLIZIZ = null;
            }
            interfaceC1631620sYq.invoke(bool, boolValueOf, strLIZIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS117S0400000_21 awS117S0400000_21, Object obj) {
        ((Boolean) obj).booleanValue();
        ((C1371740lng) awS117S0400000_21.l0).LJIILLIIL((InterfaceC1369790lkX) awS117S0400000_21.l1, true, (AwemeSharePackage) awS117S0400000_21.l2, (Context) awS117S0400000_21.l3);
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS117S0400000_21 awS117S0400000_21, Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                String str = (String) it2.next();
                if (!TextUtils.equals(str, "chat_merge")) {
                    if (u.LJIJI("copy", str, true)) {
                        ((Function1) awS117S0400000_21.l0).invoke(new CopyLinkChannel(false));
                        break;
                    }
                    C1374530lsB c1374530lsB = C1374530lsB.LIZ;
                    Aweme aweme = (Aweme) awS117S0400000_21.l1;
                    C1377070lwH c1377070lwH = (C1377070lwH) awS117S0400000_21.l2;
                    c1374530lsB.getClass();
                    C1373610lqh c1373610lqhLJFF = C1374530lsB.LJFF(aweme, str, c1377070lwH, null);
                    if (c1373610lqhLJFF != null && c1373610lqhLJFF.LJIIZILJ((Activity) awS117S0400000_21.l3) && !c1373610lqhLJFF.LIZJ()) {
                        ((Function1) awS117S0400000_21.l0).invoke(c1373610lqhLJFF);
                        break;
                    }
                }
            }
        } else {
            ((Function1) awS117S0400000_21.l0).invoke(new CopyLinkChannel(false));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$15(AwS117S0400000_21 awS117S0400000_21, Object obj) {
        C1387980mDs c1387980mDs;
        String str;
        String strLIZIZ;
        String str2;
        RecyclerView recyclerView = (RecyclerView) obj;
        AbstractC21673619ry adapter = recyclerView.getAdapter();
        if (!(adapter instanceof C1387980mDs) || (c1387980mDs = (C1387980mDs) adapter) == null) {
            c1387980mDs = new C1387980mDs(R.drawable.bf2, new AwS635S0100000_21((Function1) awS117S0400000_21.l1, (Function1<? super Boolean, Unit>) 181));
            recyclerView.setAdapter(c1387980mDs);
        }
        C1322480kWE c1322480kWE = (C1322480kWE) awS117S0400000_21.l0;
        PurchaseOption purchaseOption = (PurchaseOption) awS117S0400000_21.l2;
        C19871212ow c19871212ow = (C19871212ow) awS117S0400000_21.l3;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(c1322480kWE, 10));
        int i = 0;
        for (Object obj2 : c1322480kWE) {
            int i2 = i + 1;
            if (i >= 0) {
                PurchaseOption purchaseOption2 = (PurchaseOption) obj2;
                boolean zLJFF = Intrinsics.LJFF(purchaseOption2, purchaseOption);
                PriceInfo priceInfo = purchaseOption2.discountedPrice;
                if (priceInfo != null) {
                    strLIZIZ = (String) c19871212ow.get(priceInfo.iapId);
                    if (strLIZIZ == null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append('$');
                        PriceInfo priceInfo2 = purchaseOption2.discountedPrice;
                        if (priceInfo2 != null) {
                            str2 = priceInfo2.priceInUsd;
                        } else {
                            str2 = null;
                        }
                        sbLIZ.append(str2);
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    }
                } else {
                    PriceInfo priceInfo3 = purchaseOption2.price;
                    if (priceInfo3 == null || (strLIZIZ = (String) c19871212ow.get(priceInfo3.iapId)) == null) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append('$');
                        PriceInfo priceInfo4 = purchaseOption2.price;
                        if (priceInfo4 != null) {
                            str = priceInfo4.priceInUsd;
                        } else {
                            str = null;
                        }
                        sbLIZ2.append(str);
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                    }
                }
                arrayList.add(new C1387990mDt(purchaseOption2, zLJFF, strLIZIZ));
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        ((ArrayList) c1387980mDs.LLILZIL).clear();
        ((ArrayList) c1387980mDs.LLILZIL).addAll(arrayList);
        c1387980mDs.notifyDataSetChanged();
        return Unit.LIZ;
    }

    public static final Object invoke$16(AwS117S0400000_21 awS117S0400000_21, Object obj) {
        CommentInputContent commentInputContent;
        C1346950l9h c1346950l9h = (C1346950l9h) obj;
        C291001Au<CommentInputContent> c291001Au = c1346950l9h.LLJI;
        if (c291001Au == null || (commentInputContent = c291001Au.LIZ) == null) {
            commentInputContent = new CommentInputContent("", null, null, null, null);
        }
        List<AudioCommentModel> list = (List) awS117S0400000_21.l3;
        commentInputContent.audioList = list;
        commentInputContent.imageList = null;
        commentInputContent.stickerStruct = null;
        Aweme aweme = (Aweme) awS117S0400000_21.l0;
        if (aweme != null) {
            CommentInputContent commentInputContentYQ2 = ((KeyboardVMV2) awS117S0400000_21.l1).yQ2(aweme, (EnumC1346360l8k) awS117S0400000_21.l2);
            commentInputContentYQ2.audioList = list;
            commentInputContentYQ2.imageList = null;
            commentInputContentYQ2.stickerStruct = null;
        }
        KeyboardVMV2 keyboardVMV2 = (KeyboardVMV2) awS117S0400000_21.l1;
        EnumC1346360l8k enumC1346360l8k = (EnumC1346360l8k) awS117S0400000_21.l2;
        keyboardVMV2.getClass();
        keyboardVMV2.withState(new AwS387S0200000_21(keyboardVMV2, enumC1346360l8k, 105));
        ((KeyboardVMV2) awS117S0400000_21.l1).aR2(c1346950l9h, c1346950l9h.LL);
        return Unit.LIZ;
    }

    public static final Object invoke$17(AwS117S0400000_21 awS117S0400000_21, Object obj) {
        Aweme aweme;
        String strEnterFrom;
        GiftStruct value;
        String giftSendEnterMethod;
        CommentKeyboardModel keyboardModel;
        MutableLiveData<GiftStruct> mutableLiveDataWQ2;
        ((C1397660mTU) obj).LIZJ = true;
        C1355460lNQ.LIZ((C19EG) awS117S0400000_21.l0, ((GiftStruct) awS117S0400000_21.l1).diamondCount, (GiftViewModel) awS117S0400000_21.l2, ((C19EG) awS117S0400000_21.l0).getSupportFragmentManager());
        CommentGiftSelectAssem commentGiftSelectAssem = (CommentGiftSelectAssem) awS117S0400000_21.l3;
        CommentContextSource commentContextSourceIp = commentGiftSelectAssem.ip();
        Long lValueOf = null;
        if (commentContextSourceIp != null) {
            aweme = CommentContextSourceKt.aweme(commentContextSourceIp);
        } else {
            aweme = null;
        }
        CommentContextSource commentContextSourceIp2 = commentGiftSelectAssem.ip();
        if (commentContextSourceIp2 != null) {
            strEnterFrom = CommentContextSourceKt.enterFrom(commentContextSourceIp2);
        } else {
            strEnterFrom = null;
        }
        GiftViewModel giftViewModelHp = commentGiftSelectAssem.hp();
        if (giftViewModelHp != null && (mutableLiveDataWQ2 = giftViewModelHp.wQ2()) != null) {
            value = mutableLiveDataWQ2.getValue();
        } else {
            value = null;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", strEnterFrom);
        CommentContextSource commentContextSourceIp3 = commentGiftSelectAssem.ip();
        if (commentContextSourceIp3 != null && (keyboardModel = commentContextSourceIp3.getKeyboardModel()) != null) {
            giftSendEnterMethod = keyboardModel.getGiftSendEnterMethod();
        } else {
            giftSendEnterMethod = null;
        }
        c2344009Gk.LJIIIIZZ("enter_method", giftSendEnterMethod);
        c2344009Gk.LJIIIIZZ("group_id", C735370Ssx.LIZJ(aweme));
        if (value != null) {
            lValueOf = Long.valueOf(value.id);
        }
        c2344009Gk.LJ(lValueOf, "gift_id");
        c2344009Gk.LJIIIIZZ("author_id", C735370Ssx.LIZLLL(aweme));
        C20684815ws.LJIILLIIL("click_comment_recharge_popup", c2344009Gk.LIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$18(AwS117S0400000_21 awS117S0400000_21, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C1371590lnR c1371590lnR = (C1371590lnR) awS117S0400000_21.l0;
        InterfaceC1366490lfD interfaceC1366490lfD = c1371590lnR.LJJIFFI;
        if (interfaceC1366490lfD != null) {
            interfaceC1366490lfD.LIZ((InterfaceC1369790lkX) awS117S0400000_21.l1, zBooleanValue, c1371590lnR.LJIJJ, (Context) awS117S0400000_21.l2);
        }
        if (!((InterfaceC1369790lkX) awS117S0400000_21.l1).LIZJ()) {
            ((DownloadAndShareViewModel) awS117S0400000_21.l3).LLILLJJLI.setValue(Boolean.TRUE);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$19(kotlin.jvm.internal.AwS117S0400000_21 r7, java.lang.Object r8) {
        /*
            com.ss.android.ugc.aweme.composer.model.MusicShareStoryInputData r8 = (com.ss.android.ugc.aweme.composer.model.MusicShareStoryInputData) r8
            java.lang.Object r0 = r7.l0
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = (com.ss.android.ugc.aweme.base.model.UrlModel) r0
            r8.setCoverUrl(r0)
            java.lang.Object r0 = r7.l1
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r0 = (com.ss.android.ugc.aweme.shortvideo.model.MusicModel) r0
            r8.setMusic(r0)
            java.lang.Object r0 = r7.l2
            X.0mYI r0 = (X.C1400640mYI) r0
            com.ss.android.ugc.aweme.music.model.Music r5 = r0.LLILLJJLI
            java.lang.Object r3 = r7.l3
            android.app.Activity r3 = (android.app.Activity) r3
            java.lang.String r0 = r5.getOwnerId()
            r6 = 0
            r4 = 1
            if (r0 == 0) goto L87
            int r0 = r0.length()
            if (r0 == 0) goto L87
            r0 = 0
        L29:
            r1 = r0 ^ 1
            boolean r0 = r5.isOriginMusic()
            java.lang.String r2 = r5.getMusicName()
            if (r2 != 0) goto L37
            java.lang.String r2 = ""
        L37:
            if (r0 != 0) goto L5c
            if (r1 == 0) goto L4d
            boolean r0 = r5.isMatchMetadata()
            if (r0 != 0) goto L5e
            java.lang.String r0 = "@"
            boolean r0 = kotlin.text.u.LJJIIJZLJL(r2, r0, r6)
            if (r0 != r4) goto L5e
            java.lang.String r2 = r2.substring(r4)
        L4d:
            r8.setSongName(r2)
            java.lang.Object r0 = r7.l2
            X.0mYI r0 = (X.C1400640mYI) r0
            java.lang.Integer r0 = r0.LLIZ
            r8.setLandingBack(r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L5c:
            if (r1 == 0) goto L4d
        L5e:
            java.lang.String r0 = r5.getExtra()
            boolean r0 = X.C123100dR.LIZ(r0)
            if (r0 == 0) goto L4d
            org.json.JSONObject r1 = new org.json.JSONObject
            java.lang.String r0 = r5.getExtra()
            r1.<init>(r0)
            java.lang.String r0 = "has_edited"
            int r0 = r1.optInt(r0)
            if (r0 == r4) goto L4d
            boolean r0 = r5.isMemeSong()
            if (r0 != 0) goto L4d
            r0 = 2131839044(0x7f114844, float:1.9311328E38)
            java.lang.String r2 = r3.getString(r0)
            goto L4d
        L87:
            r0 = 1
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS117S0400000_21.invoke$19(kotlin.jvm.internal.AwS117S0400000_21, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$2(AwS117S0400000_21 awS117S0400000_21, Object obj) {
        CommentInputContent commentInputContent;
        C1346950l9h c1346950l9h = (C1346950l9h) obj;
        C291001Au<CommentInputContent> c291001Au = c1346950l9h.LLJI;
        if (c291001Au == null || (commentInputContent = c291001Au.LIZ) == null) {
            commentInputContent = new CommentInputContent("", null, null, null, null);
        }
        List<CommentImageModel> list = (List) awS117S0400000_21.l3;
        commentInputContent.imageList = list;
        commentInputContent.stickerStruct = null;
        commentInputContent.audioList = null;
        Aweme aweme = (Aweme) awS117S0400000_21.l0;
        if (aweme != null) {
            CommentInputContent commentInputContentYQ2 = ((KeyboardVMV2) awS117S0400000_21.l1).yQ2(aweme, (EnumC1346360l8k) awS117S0400000_21.l2);
            commentInputContentYQ2.imageList = list;
            commentInputContentYQ2.stickerStruct = null;
            commentInputContentYQ2.audioList = null;
        }
        KeyboardVMV2 keyboardVMV2 = (KeyboardVMV2) awS117S0400000_21.l1;
        EnumC1346360l8k enumC1346360l8k = (EnumC1346360l8k) awS117S0400000_21.l2;
        keyboardVMV2.getClass();
        keyboardVMV2.withState(new AwS387S0200000_21(keyboardVMV2, enumC1346360l8k, 105));
        ((KeyboardVMV2) awS117S0400000_21.l1).aR2(c1346950l9h, c1346950l9h.LL);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS117S0400000_21 awS117S0400000_21, Object obj) {
        CommentInputContent commentInputContent;
        C1346950l9h c1346950l9h = (C1346950l9h) obj;
        C291001Au<CommentInputContent> c291001Au = c1346950l9h.LLJI;
        if (c291001Au == null || (commentInputContent = c291001Au.LIZ) == null) {
            commentInputContent = new CommentInputContent("", null, null, null, null);
        }
        CommentStickerStruct commentStickerStruct = (CommentStickerStruct) awS117S0400000_21.l3;
        commentInputContent.imageList = null;
        commentInputContent.audioList = null;
        commentInputContent.stickerStruct = commentStickerStruct;
        Aweme aweme = (Aweme) awS117S0400000_21.l0;
        if (aweme != null) {
            CommentInputContent commentInputContentYQ2 = ((KeyboardVMV2) awS117S0400000_21.l1).yQ2(aweme, (EnumC1346360l8k) awS117S0400000_21.l2);
            commentInputContentYQ2.imageList = null;
            commentInputContentYQ2.audioList = null;
            commentInputContentYQ2.stickerStruct = commentStickerStruct;
        }
        KeyboardVMV2 keyboardVMV2 = (KeyboardVMV2) awS117S0400000_21.l1;
        EnumC1346360l8k enumC1346360l8k = (EnumC1346360l8k) awS117S0400000_21.l2;
        keyboardVMV2.getClass();
        keyboardVMV2.withState(new AwS387S0200000_21(keyboardVMV2, enumC1346360l8k, 105));
        ((KeyboardVMV2) awS117S0400000_21.l1).aR2(c1346950l9h, c1346950l9h.LL);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS117S0400000_21 awS117S0400000_21, Object obj) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateCommentInputContentText withState ");
        C1341800l1O c1341800l1O = KeyboardVMV2.LLJJIJIL;
        Aweme aweme = (Aweme) awS117S0400000_21.l0;
        EnumC1346360l8k enumC1346360l8k = (EnumC1346360l8k) awS117S0400000_21.l1;
        c1341800l1O.getClass();
        sbLIZ.append(C1341800l1O.LIZIZ(aweme, enumC1346360l8k));
        sbLIZ.append(' ');
        sbLIZ.append(awS117S0400000_21.l2);
        C2188811AlT.LIZIZ(sbLIZ);
        CommentInputContent commentInputContent = ((C1346950l9h) obj).LLJI.LIZ;
        if (commentInputContent == null) {
            commentInputContent = new CommentInputContent("", null, null, null, null);
        }
        Editable editable = (Editable) awS117S0400000_21.l2;
        commentInputContent.text = editable;
        Aweme aweme2 = (Aweme) awS117S0400000_21.l0;
        if (aweme2 != null) {
            KeyboardVMV2 keyboardVMV2 = (KeyboardVMV2) awS117S0400000_21.l3;
            EnumC1346360l8k enumC1346360l8k2 = (EnumC1346360l8k) awS117S0400000_21.l1;
            CommentInputContent commentInputContentYQ2 = keyboardVMV2.yQ2(aweme2, enumC1346360l8k2);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("inputContentHistory==>putCommentInputContent ");
            sbLIZ2.append(C1341800l1O.LIZIZ(aweme2, enumC1346360l8k2));
            C1344030l4z.LIZJ("KeyboardVM", C2188811AlT.LIZIZ(sbLIZ2));
            commentInputContentYQ2.text = editable;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$5(kotlin.jvm.internal.AwS117S0400000_21 r3, java.lang.Object r4) {
        /*
            com.ss.android.ugc.aweme.composer.model.MusicShareStoryInputData r4 = (com.ss.android.ugc.aweme.composer.model.MusicShareStoryInputData) r4
            java.lang.Object r0 = r3.l0
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = (com.ss.android.ugc.aweme.base.model.UrlModel) r0
            r4.setCoverUrl(r0)
            java.lang.Object r0 = r3.l1
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r0 = (com.ss.android.ugc.aweme.shortvideo.model.MusicModel) r0
            r4.setMusic(r0)
            java.lang.Object r0 = r3.l2
            com.ss.android.ugc.aweme.music.model.MusicDetail r0 = (com.ss.android.ugc.aweme.music.model.MusicDetail) r0
            com.ss.android.ugc.aweme.music.model.Music r0 = r0.music
            if (r0 == 0) goto L51
            boolean r1 = X.C630310Ont.LIZ(r0)
            r0 = 1
            if (r1 != r0) goto L51
            java.lang.Object r0 = r3.l3
            com.ss.android.ugc.aweme.music.v2.assem.MusicShootAssem r0 = (com.ss.android.ugc.aweme.music.v2.assem.MusicShootAssem) r0
            com.ss.android.ugc.aweme.music.model.Music r0 = r0.LLJZIJLIL
            if (r0 == 0) goto L6d
            java.lang.String r0 = r0.getMusicName()
        L2b:
            r4.setSongName(r0)
            java.lang.Object r0 = r3.l3
            com.ss.android.ugc.aweme.music.v2.assem.MusicShootAssem r0 = (com.ss.android.ugc.aweme.music.v2.assem.MusicShootAssem) r0
            com.ss.android.ugc.aweme.music.v2.viewmodel.MusicDetailViewModel r0 = r0.Vp()
            int r0 = r0.LLJJIII
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.setMusicPop(r0)
            java.lang.Object r0 = r3.l3
            com.ss.android.ugc.aweme.music.v2.assem.MusicShootAssem r0 = (com.ss.android.ugc.aweme.music.v2.assem.MusicShootAssem) r0
            X.01GW r0 = r0.LLLLZI
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.music.model.LyricStickerStruct r0 = (com.ss.android.ugc.aweme.music.model.LyricStickerStruct) r0
            r4.setLyricStickerStruct(r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L51:
            java.lang.Object r0 = r3.l2
            com.ss.android.ugc.aweme.music.model.MusicDetail r0 = (com.ss.android.ugc.aweme.music.model.MusicDetail) r0
            com.ss.android.ugc.aweme.music.model.Music r2 = r0.music
            if (r2 == 0) goto L6d
            java.lang.Object r0 = r3.l3
            com.ss.android.ugc.aweme.music.v2.assem.MusicShootAssem r0 = (com.ss.android.ugc.aweme.music.v2.assem.MusicShootAssem) r0
            X.0Ong r1 = com.ss.android.ugc.aweme.music.v2.assem.MusicDescAssem.LLL
            android.content.Context r0 = r0.getContext()
            if (r0 == 0) goto L6f
            r1.getClass()
            java.lang.String r0 = X.C630180Ong.LIZ(r0, r2)
            goto L2b
        L6d:
            r0 = 0
            goto L2b
        L6f:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Required value was null."
            r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS117S0400000_21.invoke$5(kotlin.jvm.internal.AwS117S0400000_21, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$6(AwS117S0400000_21 awS117S0400000_21, Object obj) {
        String str = (String) obj;
        if (str != null && str.length() > 0) {
            Context context = (Context) awS117S0400000_21.l1;
            AwemeSharePackage awemeSharePackage = (AwemeSharePackage) awS117S0400000_21.l2;
            C1374500ls8 c1374500ls8 = (C1374500ls8) awS117S0400000_21.l3;
            C1246630iXt.LIZ(context, awemeSharePackage, c1374500ls8.LIZ, str, awemeSharePackage.LJJIFFI(), new C1374570lsF(c1374500ls8, str, context));
        }
        ((Function1) awS117S0400000_21.l0).invoke(Boolean.TRUE);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS117S0400000_21 awS117S0400000_21, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1343990l4v((Fragment) awS117S0400000_21.l0, zBooleanValue, (Aweme) awS117S0400000_21.l1, (CommentContextSource) awS117S0400000_21.l2, (C1340400kz8) awS117S0400000_21.l3, null), 3);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$8(AwS117S0400000_21 awS117S0400000_21, Object obj) {
        C786410Ut5.LIZIZ((Dialog) awS117S0400000_21.l0);
        ((C1399360mWE) awS117S0400000_21.l1).LJJJLL((C1397480mTC) awS117S0400000_21.l2, (C2344009Gk) awS117S0400000_21.l3);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$9(AwS117S0400000_21 awS117S0400000_21, Object obj) {
        C786410Ut5.LIZIZ((Dialog) awS117S0400000_21.l0);
        ((C1394670mOf) awS117S0400000_21.l1).LJJJLL((C1394730mOl) awS117S0400000_21.l2, (C2344009Gk) awS117S0400000_21.l3);
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS117S0400000_21(X.C1387170mCZ r3, com.ss.android.ugc.aweme.minis.page.main.fragment.MiniGameFragment r4, java.lang.Number r5, X.C013C r6, int r7) {
        /*
            r2 = this;
            r2.$t = r7
            if (r7 == 0) goto L12
            r1 = r2
            r1.l0 = r6
            r1.l1 = r4
            r1.l2 = r3
            r1.l3 = r5
            r0 = 1
        Le:
            r1.<init>(r0)
            return
        L12:
            r1 = r2
            r1.l0 = r6
            r1.l1 = r3
            r1.l2 = r5
            r1.l3 = r4
            r0 = 1
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS117S0400000_21.<init>(X.0mCZ, com.ss.android.ugc.aweme.minis.page.main.fragment.MiniGameFragment, java.lang.Number, X.013C, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS117S0400000_21(C712520RxC c712520RxC, C712520RxC c712520RxC2, C1393580mMu c1393580mMu, C259800zU<InterfaceC1631620sYq<Boolean, Boolean, String, Unit>> c259800zU, InterfaceC705550Rlx interfaceC705550Rlx) {
        super(1);
        this.$t = interfaceC705550Rlx;
        this.l0 = c712520RxC;
        this.l1 = c712520RxC2;
        this.l2 = c1393580mMu;
        this.l3 = c259800zU;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS117S0400000_21(C712520RxC c712520RxC, C1393590mMv c1393590mMv, AwS318S0300000_21 awS318S0300000_21, InterfaceC705550Rlx interfaceC705550Rlx, int i) {
        super(1);
        this.$t = i;
        this.l0 = c712520RxC;
        this.l1 = c1393590mMv;
        this.l2 = awS318S0300000_21;
        this.l3 = interfaceC705550Rlx;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS117S0400000_21(C1322480kWE c1322480kWE, C1322480kWE<PurchaseOption> c1322480kWE2, Function1<? super PurchaseOption, Unit> function1, PurchaseOption purchaseOption, C19871212ow<String, String> c19871212ow) {
        super(1);
        this.$t = c19871212ow;
        this.l0 = c1322480kWE;
        this.l1 = c1322480kWE2;
        this.l2 = function1;
        this.l3 = purchaseOption;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS117S0400000_21(C1371740lng c1371740lng, InterfaceC1369790lkX interfaceC1369790lkX, AwemeSharePackage awemeSharePackage, Context context, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1371740lng;
        this.l1 = interfaceC1369790lkX;
        this.l2 = awemeSharePackage;
        this.l3 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS117S0400000_21(InterfaceC1393560mMs interfaceC1393560mMs, C712520RxC c712520RxC, C1393570mMt c1393570mMt, InterfaceC705550Rlx interfaceC705550Rlx, int i) {
        super(1);
        this.$t = i;
        this.l0 = interfaceC1393560mMs;
        this.l1 = c712520RxC;
        this.l2 = c1393570mMt;
        this.l3 = interfaceC705550Rlx;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS117S0400000_21(C19EG c19eg, GiftStruct giftStruct, GiftViewModel giftViewModel, CommentGiftSelectAssem commentGiftSelectAssem, int i) {
        super(1);
        this.$t = i;
        this.l0 = c19eg;
        this.l1 = giftStruct;
        this.l2 = giftViewModel;
        this.l3 = commentGiftSelectAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS117S0400000_21(Dialog dialog, C1394670mOf c1394670mOf, C1394730mOl c1394730mOl, C2344009Gk c2344009Gk, int i) {
        super(1);
        this.$t = i;
        this.l0 = dialog;
        this.l1 = c1394670mOf;
        this.l2 = c1394730mOl;
        this.l3 = c2344009Gk;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS117S0400000_21(Dialog dialog, C1399360mWE c1399360mWE, C1397480mTC c1397480mTC, C2344009Gk c2344009Gk, int i) {
        super(1);
        this.$t = i;
        this.l0 = dialog;
        this.l1 = c1399360mWE;
        this.l2 = c1397480mTC;
        this.l3 = c2344009Gk;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS117S0400000_21(Context context, DownloadAndShareViewModel downloadAndShareViewModel, InterfaceC1369790lkX interfaceC1369790lkX, C1371590lnR c1371590lnR, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1371590lnR;
        this.l1 = interfaceC1369790lkX;
        this.l2 = context;
        this.l3 = downloadAndShareViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS117S0400000_21(Fragment fragment, Aweme aweme, CommentContextSource commentContextSource, C1340400kz8 c1340400kz8, int i) {
        super(1);
        this.$t = i;
        this.l0 = fragment;
        this.l1 = aweme;
        this.l2 = commentContextSource;
        this.l3 = c1340400kz8;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS117S0400000_21(UrlModel urlModel, MusicModel musicModel, C1400640mYI c1400640mYI, Activity activity, int i) {
        super(1);
        this.$t = i;
        this.l0 = urlModel;
        this.l1 = musicModel;
        this.l2 = c1400640mYI;
        this.l3 = activity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS117S0400000_21(UrlModel urlModel, MusicModel musicModel, MusicDetail musicDetail, MusicShootAssem musicShootAssem, int i) {
        super(1);
        this.$t = i;
        this.l0 = urlModel;
        this.l1 = musicModel;
        this.l2 = musicDetail;
        this.l3 = musicShootAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS117S0400000_21(Aweme aweme, EnumC1346360l8k enumC1346360l8k, Editable editable, KeyboardVMV2 keyboardVMV2, int i) {
        super(1);
        this.$t = i;
        this.l0 = aweme;
        this.l1 = enumC1346360l8k;
        this.l2 = editable;
        this.l3 = keyboardVMV2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS117S0400000_21(Aweme aweme, KeyboardVMV2 keyboardVMV2, EnumC1346360l8k enumC1346360l8k, CommentStickerStruct commentStickerStruct, int i) {
        super(1);
        this.$t = i;
        this.l0 = aweme;
        this.l1 = keyboardVMV2;
        this.l2 = enumC1346360l8k;
        this.l3 = commentStickerStruct;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS117S0400000_21(Aweme aweme, Aweme aweme2, KeyboardVMV2 keyboardVMV2, EnumC1346360l8k enumC1346360l8k, List<CommentImageModel> list) {
        super(1);
        this.$t = list;
        this.l0 = aweme;
        this.l1 = aweme2;
        this.l2 = keyboardVMV2;
        this.l3 = enumC1346360l8k;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS117S0400000_21(Function1 function1, Function1<? super Boolean, Unit> function12, Context context, AwemeSharePackage awemeSharePackage, C1374500ls8 c1374500ls8) {
        super(1);
        this.$t = c1374500ls8;
        this.l0 = function1;
        this.l1 = function12;
        this.l2 = context;
        this.l3 = awemeSharePackage;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS117S0400000_21(Function1 function1, Aweme aweme, C1377070lwH c1377070lwH, C19EG c19eg, int i) {
        super(1);
        this.$t = i;
        this.l0 = function1;
        this.l1 = aweme;
        this.l2 = c1377070lwH;
        this.l3 = c19eg;
    }
}
