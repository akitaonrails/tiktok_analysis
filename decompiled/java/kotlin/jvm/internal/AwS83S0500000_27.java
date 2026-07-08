package kotlin.jvm.internal;

import X.AbstractC1377610lx9;
import X.AbstractC1789150wev;
import X.C013C;
import X.C098200Yq;
import X.C09AY;
import X.C0FNV;
import X.C0N57;
import X.C118300cf;
import X.C1361405Um;
import X.C1361505Un;
import X.C1388410mEZ;
import X.C1388430mEb;
import X.C13LP;
import X.C14FD;
import X.C1558520qew;
import X.C1578630rBN;
import X.C1697810uHb;
import X.C1789260wf6;
import X.C1845270y7R;
import X.C1855920yOc;
import X.C1856900yQC;
import X.C1862330yYx;
import X.C1862660yZU;
import X.C1863240yaQ;
import X.C1863850ybP;
import X.C189200o6;
import X.C19404410vq;
import X.C19EG;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C238400w2;
import X.C259800zU;
import X.C298810BnT;
import X.C621180OYa;
import X.C786410Ut5;
import X.InterfaceC1361305Ul;
import X.InterfaceC1786800wb8;
import X.InterfaceC1787390wc5;
import X.InterfaceC1787890wct;
import X.InterfaceC1788510wdt;
import X.InterfaceC1788520wdu;
import X.InterfaceC665370Q7z;
import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.skydoves.balloon.Balloon;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.share.base.model.ShareModel;
import com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem;
import com.ss.android.ugc.aweme.tako.botpage.components.share.TakoSharePreviewAbility;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.ITakoScreenTypeAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseVideo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.ccl.model.conversation.ConversationInfo;
import com.ss.android.ugc.aweme.tako.detail.operator.BatchDetailList;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import com.ss.android.ugc.aweme.tako.otherpage.image.detail.assem.TakoContentPreviewItem;
import com.ss.android.ugc.aweme.tako.share.panel.TakoShareConfiguration;
import com.ss.android.ugc.aweme.tako.share.panel.TakoVideoShareModel;
import com.ss.android.ugc.aweme.tako.share.panel.TakoVideoSharePackage;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.ss.android.ugc.aweme.tako.startup.processor.tako.TakoDisclaimerDialogProcessor;
import com.ss.android.ugc.aweme.tako.ui.ITakoChatPageAbility;
import defpackage.u2;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS269S0000000_27;
import org.json.JSONException;

/* JADX INFO: loaded from: classes28.dex */
public class AwS83S0500000_27 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS83S0500000_27 awS83S0500000_27) throws JSONException {
        Object c098200Yq;
        double dDoubleValue;
        boolean z;
        Map<String, String> mapLJ;
        String strNZ0;
        Map<String, String> mapLJ2;
        String str;
        int iIntValue;
        int iIntValue2;
        try {
            ITakoChatPageAbility iTakoChatPageAbility = (ITakoChatPageAbility) C1558520qew.LIZ((InterfaceC665370Q7z) awS83S0500000_27.l0, ITakoChatPageAbility.class, null);
            if (iTakoChatPageAbility != null) {
                c098200Yq = iTakoChatPageAbility.Zu2();
            } else {
                c098200Yq = null;
            }
            if (!(c098200Yq instanceof ViewGroup)) {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m7isFailureimpl(c098200Yq);
        C1361405Um c1361405Um = InterfaceC1361305Ul.LJJJJL;
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) awS83S0500000_27.l0;
        c1361405Um.getClass();
        C1361505Un c1361505Un = new C1361505Un(interfaceC665370Q7z);
        BaseVideo baseVideo = (BaseVideo) awS83S0500000_27.l1;
        String str2 = baseVideo.videoModel;
        String str3 = baseVideo.fileHash;
        String str4 = baseVideo.vid;
        List<String> list = baseVideo.urlList;
        Integer num = baseVideo.width;
        Integer num2 = baseVideo.height;
        String str5 = baseVideo.videoUrl;
        Double d = baseVideo.duration;
        if (d != null) {
            dDoubleValue = d.doubleValue();
        } else {
            dDoubleValue = 0.0d;
        }
        C1845270y7R c1845270y7R = new C1845270y7R(str2, str4, str3, list, num, num2, null, null, str5, Long.valueOf((long) (dDoubleValue * ((double) LSPassThroughRecordSizeConfig.DEFAULT))), ((BaseVideo) awS83S0500000_27.l1).expireTime, ((Message) awS83S0500000_27.l2).uuid, C1855920yOc.LIZ((Message) awS83S0500000_27.l2), null, false, 24768, null);
        String str6 = c1845270y7R.vid;
        String str7 = "";
        if (str6 == null) {
            str6 = "";
        }
        TakoContentPreviewItem.Video video = new TakoContentPreviewItem.Video(c1845270y7R, str6);
        Activity activity = (Activity) awS83S0500000_27.l3;
        Message message = (Message) awS83S0500000_27.l2;
        String str8 = message.uuid;
        TakoMixFeed takoMixFeedLJIIIZ = message.LJIIIZ();
        if (takoMixFeedLJIIIZ != null && takoMixFeedLJIIIZ.cardType == 302) {
            z = true;
        } else {
            z = false;
        }
        ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ((InterfaceC665370Q7z) awS83S0500000_27.l0, ITakoContextAbility.class, null);
        if (iTakoContextAbility == null || (mapLJ = iTakoContextAbility.getCommonParams()) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        ITakoScreenTypeAbility iTakoScreenTypeAbility = (ITakoScreenTypeAbility) C1558520qew.LIZ((InterfaceC665370Q7z) awS83S0500000_27.l0, ITakoScreenTypeAbility.class, null);
        if (iTakoScreenTypeAbility == null || (strNZ0 = iTakoScreenTypeAbility.nZ0()) == null) {
            strNZ0 = "full_screen";
        }
        TakoSharePreviewAbility takoSharePreviewAbility = (TakoSharePreviewAbility) awS83S0500000_27.l4;
        if (C298810BnT.LIZ() && takoSharePreviewAbility != null) {
            C1845270y7R c1845270y7R2 = video.video;
            String str9 = c1845270y7R2.videoUrl;
            if (str9 == null) {
                str9 = "";
            }
            List<String> list2 = c1845270y7R2.urlList;
            if (list2 == null || (str = (String) C13LP.LJJJLL(list2)) == null) {
                str = "";
            }
            String str10 = c1845270y7R2.fileHash;
            String string = UUID.randomUUID().toString();
            final TakoVideoShareModel takoVideoShareModel = new TakoVideoShareModel(new C1856900yQC(string, str9, str, str10, str8, "", null, null));
            TakoVideoSharePackage takoVideoSharePackage = new TakoVideoSharePackage(new AbstractC1377610lx9(takoVideoShareModel) { // from class: X.0yQD
                public final TakoVideoShareModel LIZ;

                @Override // X.AbstractC1377630lxB
                public final String LIZJ() {
                    return "tako_local_video";
                }

                @Override // X.AbstractC1377630lxB
                public final String LIZ() {
                    String str11 = this.LIZ.takoVideoShareInfo.shareDescStr;
                    return str11 == null ? "" : str11;
                }

                @Override // X.AbstractC1377630lxB
                public final String LIZIZ() {
                    return this.LIZ.takoVideoShareInfo.shareId;
                }

                @Override // X.AbstractC1377630lxB
                public final Bundle LJFF() {
                    Bundle bundle = new Bundle();
                    C786410Ut5.LJJJI("tako_share_video_url", this.LIZ.takoVideoShareInfo.videoUrl, bundle);
                    C786410Ut5.LJJJI("tako_share_video_thumb", this.LIZ.takoVideoShareInfo.thumbUrl, bundle);
                    C786410Ut5.LJJJI("tako_share_video_filehash", this.LIZ.takoVideoShareInfo.fileHash, bundle);
                    return bundle;
                }

                @Override // X.AbstractC1377630lxB
                public final String LJI() {
                    String str11 = this.LIZ.takoVideoShareInfo.shareTitleStr;
                    return str11 == null ? "" : str11;
                }

                @Override // X.AbstractC1377630lxB
                public final String LJII() {
                    return this.LIZ.takoVideoShareInfo.sharePageUrl;
                }

                @Override // X.AbstractC1377630lxB
                public final ShareModel LJ() {
                    return this.LIZ;
                }

                {
                    this.LIZ = takoVideoShareModel;
                }
            }.LJIIIIZZ());
            C1388410mEZ c1388410mEZ = new C1388410mEZ(new AwS571S0100000_27(takoSharePreviewAbility, 1302));
            c1388410mEZ.LIZLLL = new AwS600S0100000_21(takoSharePreviewAbility, 338);
            C1388430mEb.LIZ.put(takoVideoSharePackage, c1388410mEZ);
            if (str.length() <= 0) {
                str = null;
            }
            List listLJIIL = C1697810uHb.LJIIL(str);
            Integer num3 = c1845270y7R2.width;
            if (num3 != null) {
                iIntValue = num3.intValue();
            } else {
                iIntValue = 0;
            }
            Integer num4 = c1845270y7R2.height;
            if (num4 != null) {
                iIntValue2 = num4.intValue();
            } else {
                iIntValue2 = 0;
            }
            takoSharePreviewAbility.zv0(new TakoContentPreviewItem.Image(iIntValue, iIntValue2, video.itemUUID, listLJIIL), c1361505Un, new AwS565S0100000_21(takoVideoSharePackage, 1445), true);
            Float fValueOf = Float.valueOf(C0N57.LIZ.LIZ());
            if (fValueOf.floatValue() > 0.0f) {
                takoSharePreviewAbility.yx1(fValueOf.floatValue());
            }
            takoVideoSharePackage.isVideoMedia = true;
            C786410Ut5.LJJJI("enter_from", "message_history", takoVideoSharePackage.extras);
            takoVideoSharePackage.commonParams = mapLJ;
            takoVideoSharePackage.mobMessageId = str8;
            takoVideoSharePackage.screenType = strNZ0;
            Bundle bundle = takoVideoSharePackage.extras;
            String str11 = mapLJ.get("enter_from");
            if (str11 == null) {
                str11 = "";
            }
            C786410Ut5.LJJJI("enter_from", str11, bundle);
            Bundle bundle2 = takoVideoSharePackage.extras;
            String str12 = mapLJ.get("enter_method");
            if (str12 == null) {
                str12 = "";
            }
            C786410Ut5.LJJJI("enter_method", str12, bundle2);
            Bundle bundle3 = takoVideoSharePackage.extras;
            String str13 = mapLJ.get("process_id");
            if (str13 == null) {
                str13 = "";
            }
            C786410Ut5.LJJJI("process_id", str13, bundle3);
            Bundle bundle4 = takoVideoSharePackage.extras;
            String str14 = mapLJ.get("tako_session_id");
            if (str14 == null) {
                str14 = "";
            }
            C786410Ut5.LJJJI("tako_session_id", str14, bundle4);
            Bundle bundle5 = takoVideoSharePackage.extras;
            String str15 = mapLJ.get("tako_chat_id");
            if (str15 == null) {
                str15 = "";
            }
            C786410Ut5.LJJJI("tako_chat_id", str15, bundle5);
            Bundle bundle6 = takoVideoSharePackage.extras;
            String str16 = mapLJ.get("process_id");
            if (str16 == null) {
                str16 = "";
            }
            C786410Ut5.LJJJI("tako_process_id", str16, bundle6);
            C786410Ut5.LJJJI("tako_message_id", str8, takoVideoSharePackage.extras);
            takoVideoSharePackage.mediaSourceUrl = str9;
            if (str10 == null) {
                str10 = "";
            }
            takoVideoSharePackage.videoFileHash = str10;
            takoVideoSharePackage.mediaShareId = string;
            takoVideoSharePackage.isAIGCContent = z;
            C621180OYa.LIZ.LJIIZILJ(takoVideoSharePackage, activity, TakoShareConfiguration.LLILLJJLI);
        }
        ITakoContextAbility iTakoContextAbility2 = (ITakoContextAbility) C1558520qew.LIZ((InterfaceC665370Q7z) awS83S0500000_27.l0, ITakoContextAbility.class, null);
        if (iTakoContextAbility2 == null || (mapLJ2 = iTakoContextAbility2.getCommonParams()) == null) {
            mapLJ2 = C2097608Jq.LJ();
        }
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        String str17 = mapLJ2.get("enter_from");
        if (str17 == null) {
            str17 = "";
        }
        String str18 = mapLJ2.get("enter_method");
        if (str18 == null) {
            str18 = "";
        }
        String str19 = mapLJ2.get("process_id");
        if (str19 == null) {
            str19 = "";
        }
        String str20 = mapLJ2.get("tako_session_id");
        if (str20 != null) {
            str7 = str20;
        }
        C1862330yYx.LJJI(c1862330yYx, str17, str18, str19, str7, mapLJ2.get("tako_chat_id"), "share_video", null, null, null, C2097908Jt.LIZJ(new Pair("message_id", ((Message) awS83S0500000_27.l2).uuid)), 960);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS83S0500000_27 awS83S0500000_27) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dispatchPullHistoryTakoMessages ");
        sbLIZ.append((u2) awS83S0500000_27.l0);
        sbLIZ.append(", fromCursor: ");
        sbLIZ.append(((C238400w2) awS83S0500000_27.l1).element);
        sbLIZ.append(", fromIndex: ");
        sbLIZ.append(((C238400w2) awS83S0500000_27.l2).element);
        sbLIZ.append(", fromClientSeq: ");
        sbLIZ.append(((C238400w2) awS83S0500000_27.l3).element);
        sbLIZ.append(", limit: ");
        sbLIZ.append(((C118300cf) awS83S0500000_27.l4).element);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$2(AwS83S0500000_27 awS83S0500000_27) {
        Balloon balloon = (Balloon) ((C259800zU) awS83S0500000_27.l0).element;
        if (balloon != null) {
            balloon.dismiss();
        }
        ((C1863240yaQ) awS83S0500000_27.l1).LJJIFFI("delete");
        ((C1863240yaQ) awS83S0500000_27.l1).LJIILJJIL(((C19404410vq) awS83S0500000_27.l2).getContext(), (ConversationInfo) awS83S0500000_27.l3);
        ((Function0) awS83S0500000_27.l4).invoke();
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$3(AwS83S0500000_27 awS83S0500000_27) {
        Function1 function1;
        Dialog dialog = (Dialog) ((C259800zU) awS83S0500000_27.l0).element;
        if (dialog != null) {
            C0FNV.LIZ(dialog);
        }
        if (!C1578630rBN.LJIIIZ((TakoAnswerBaseAssem) awS83S0500000_27.l1) && !((C013C) awS83S0500000_27.l2).element && (function1 = (Function1) awS83S0500000_27.l3) != null) {
            function1.invoke((BatchDetailList) awS83S0500000_27.l4);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS83S0500000_27 awS83S0500000_27) {
        final InterfaceC1788520wdu interfaceC1788520wdu = (InterfaceC1788520wdu) awS83S0500000_27.l0;
        final InterfaceC1786800wb8 interfaceC1786800wb8 = (InterfaceC1786800wb8) awS83S0500000_27.l1;
        final InterfaceC1788510wdt interfaceC1788510wdt = (InterfaceC1788510wdt) awS83S0500000_27.l2;
        final InterfaceC1787890wct interfaceC1787890wct = (InterfaceC1787890wct) awS83S0500000_27.l3;
        final InterfaceC1787390wc5 interfaceC1787390wc5 = (InterfaceC1787390wc5) awS83S0500000_27.l4;
        return new AbstractC1789150wev<Unit, Unit, Unit>(interfaceC1788520wdu, interfaceC1786800wb8, interfaceC1788510wdt, interfaceC1787890wct, interfaceC1787390wc5) { // from class: X.0wcN
            public final C561000LzO LIZ;
            public final C1788930weZ LIZIZ;
            public final Unit LIZJ;

            @Override // X.AbstractC1789150wev
            public final InterfaceC560980LzM<Unit, Unit> LIZIZ() {
                return this.LIZ;
            }

            @Override // X.AbstractC1789150wev
            public final /* bridge */ /* synthetic */ Unit LIZJ() {
                return this.LIZJ;
            }

            @Override // X.AbstractC1789150wev
            public final InterfaceC560980LzM<Exception, Unit> LIZLLL() {
                return this.LIZIZ;
            }

            {
                C054G c054gLJII = C2296808zG.LJII(C352701Yn.LIZ, C0PEM.LIZ.limitedParallelism(3));
                C1788930weZ c1788930weZ = new C1788930weZ(new C1788900weW(new C1788930weZ(new C1787580wcO(), AFwS269S0000000_27.get$arr$(375)), new C1788930weZ(new C1788670we9(new C1788840weQ(new C1788670we9(new C1788670we9(new C1788930weZ(new C1787580wcO(), AFwS269S0000000_27.get$arr$(376)), new C1788590we1(interfaceC1786800wb8, interfaceC1788520wdu.LJ(), interfaceC1788520wdu.getCache())), new InterfaceC560980LzM<List<? extends C1788060wdA>, List<? extends C1788060wdA>>() { // from class: X.0gEx
                    @Override // X.InterfaceC560980LzM
                    public final String getName() {
                        return "filter_non_restorable_order";
                    }

                    @Override // X.InterfaceC560980LzM
                    public final Object LIZ(List<? extends C1788060wdA> list, InterfaceC1364105Vn<? super List<? extends C1788060wdA>> interfaceC1364105Vn) {
                        ArrayList arrayList = new ArrayList();
                        for (C1788060wdA c1788060wdA : list) {
                            C1788060wdA c1788060wdA2 = c1788060wdA;
                            if (c1788060wdA2.LIZ != EnumC1157990gEv.PENDING && !c1788060wdA2.LJII) {
                                arrayList.add(c1788060wdA);
                            }
                        }
                        return arrayList;
                    }
                })), new C1787520wcI(interfaceC1786800wb8, interfaceC1788520wdu.LJ())), AFwS269S0000000_27.get$arr$(377))), AFwS269S0000000_27.get$arr$(378));
                C1788570wdz c1788570wdz = new C1788570wdz(new InterfaceC560980LzM<Pair<? extends Exception, Object>, Unit>() { // from class: X.0LzQ
                    @Override // X.InterfaceC560980LzM
                    public final String getName() {
                        return "empty-catch-action";
                    }

                    @Override // X.InterfaceC560980LzM
                    public final Object LIZ(Pair<? extends Exception, Object> pair, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                        pair.getFirst();
                        return Unit.LIZ;
                    }
                }, new C1788930weZ(new C1788670we9(new C1788070wdB(interfaceC1786800wb8, interfaceC1788520wdu), new C1788670we9(new C1788570wdz(new C1788670we9(new C1788840weQ(new C1788670we9(new C1788930weZ(new C1787580wcO(), AFwS269S0000000_27.get$arr$(379)), new C1787160wbi(interfaceC1788520wdu.LIZIZ()))), new C1787030wbV(interfaceC1786800wb8, interfaceC1788520wdu)), new C561000LzO(new C1788670we9(new C1788980wee(new C1787850wcp(interfaceC1788510wdt, interfaceC1788520wdu, interfaceC1787890wct), new C1787600wcQ(0.0d, 3)), new C1788980wee(new C1787960wd0(interfaceC1788510wdt, interfaceC1788520wdu), new C1787600wcQ(0.0d, 3))), c054gLJII, new C1786640was(interfaceC1786800wb8, interfaceC1788520wdu))), new C1786970wbP(interfaceC1786800wb8, interfaceC1788520wdu))), AFwS269S0000000_27.get$arr$(333)));
                this.LIZ = new C561000LzO(new C561000LzO(new C561000LzO(new C561000LzO(new C1788930weZ(new C561000LzO(new C1788930weZ(new C1787580wcO(), AFwS269S0000000_27.get$arr$(372)), c054gLJII, new C1788900weW(c1788930weZ, c1788570wdz)), AFwS269S0000000_27.get$arr$(373)), c054gLJII, new C1789990wgH(new InterfaceC560980LzM<Unit, InterfaceC346201Wa<? extends EnumC1787510wcH>>(interfaceC1787890wct) { // from class: X.0wcT
                    public final InterfaceC1787890wct LIZ;

                    @Override // X.InterfaceC560980LzM
                    public final String getName() {
                        return "listen_upload_token_fail";
                    }

                    {
                        this.LIZ = interfaceC1787890wct;
                    }

                    @Override // X.InterfaceC560980LzM
                    public final Object LIZ(Unit unit, InterfaceC1364105Vn<? super InterfaceC346201Wa<? extends EnumC1787510wcH>> interfaceC1364105Vn) {
                        return new C861640Xr8(new C01UC(null), new C1864870yd3(new C1864870yd3(this.LIZ.getEvents(), 15), 16));
                    }
                }, new C1788900weW(c1788930weZ, c1788570wdz))), c054gLJII, new C1789990wgH(new InterfaceC560980LzM<Unit, InterfaceC346201Wa<? extends EnumC1787510wcH>>(interfaceC1787890wct) { // from class: X.0wcU
                    public final InterfaceC1787890wct LIZ;

                    @Override // X.InterfaceC560980LzM
                    public final String getName() {
                        return "listen_cashier_timeout";
                    }

                    {
                        this.LIZ = interfaceC1787890wct;
                    }

                    @Override // X.InterfaceC560980LzM
                    public final Object LIZ(Unit unit, InterfaceC1364105Vn<? super InterfaceC346201Wa<? extends EnumC1787510wcH>> interfaceC1364105Vn) {
                        return new C1864870yd3(new C1864870yd3(new C861640Xr8(new C322901Nb(null), new C1864870yd3(this.LIZ.getEvents(), 8)), 7), 9);
                    }
                }, new C1788900weW(c1788930weZ, c1788570wdz))), c054gLJII, new C1789990wgH(new C1787350wc1(interfaceC1788520wdu.LJ(), interfaceC1786800wb8, interfaceC1787390wc5), new C1788900weW(c1788930weZ, c1788570wdz))), c054gLJII, new C1789990wgH(new C1787470wcD(interfaceC1786800wb8, interfaceC1787390wc5), c1788570wdz));
                this.LIZIZ = new C1788930weZ(new C1787580wcO(), AFwS269S0000000_27.get$arr$(374));
                this.LIZJ = Unit.LIZ;
            }
        };
    }

    public static final Object invoke$5(AwS83S0500000_27 awS83S0500000_27) {
        ((TakoDisclaimerDialogProcessor) awS83S0500000_27.l0).LIZLLL((TakoEnterParams) awS83S0500000_27.l1, (C1862660yZU) awS83S0500000_27.l2, (IMessageAbility) awS83S0500000_27.l3, (C14FD) awS83S0500000_27.l4);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS83S0500000_27(C259800zU c259800zU, TakoAnswerBaseAssem takoAnswerBaseAssem, C013C c013c, Function1 function1, BatchDetailList batchDetailList, int i) {
        super(0);
        this.$t = i;
        this.l0 = c259800zU;
        this.l1 = takoAnswerBaseAssem;
        this.l2 = c013c;
        this.l3 = function1;
        this.l4 = batchDetailList;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS83S0500000_27(InterfaceC665370Q7z interfaceC665370Q7z, BaseVideo baseVideo, Message message, C19EG c19eg, TakoSharePreviewAbility takoSharePreviewAbility, int i) {
        super(0);
        this.$t = i;
        this.l0 = interfaceC665370Q7z;
        this.l1 = baseVideo;
        this.l2 = message;
        this.l3 = c19eg;
        this.l4 = takoSharePreviewAbility;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS83S0500000_27(C1789260wf6 c1789260wf6, InterfaceC1786800wb8 interfaceC1786800wb8, InterfaceC1788510wdt interfaceC1788510wdt, InterfaceC1787890wct interfaceC1787890wct, InterfaceC1787390wc5 interfaceC1787390wc5, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1789260wf6;
        this.l1 = interfaceC1786800wb8;
        this.l2 = interfaceC1788510wdt;
        this.l3 = interfaceC1787890wct;
        this.l4 = interfaceC1787390wc5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS83S0500000_27(C19404410vq c19404410vq, ConversationInfo conversationInfo, C1863240yaQ c1863240yaQ, Function0 function0, C259800zU c259800zU, int i) {
        super(0);
        this.$t = i;
        this.l0 = c259800zU;
        this.l1 = c1863240yaQ;
        this.l2 = c19404410vq;
        this.l3 = conversationInfo;
        this.l4 = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS83S0500000_27(u2 u2Var, C238400w2 c238400w2, C238400w2 c238400w22, C238400w2 c238400w23, C118300cf c118300cf, int i) {
        super(0);
        this.$t = i;
        this.l0 = u2Var;
        this.l1 = c238400w2;
        this.l2 = c238400w22;
        this.l3 = c238400w23;
        this.l4 = c118300cf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS83S0500000_27(TakoDisclaimerDialogProcessor takoDisclaimerDialogProcessor, TakoEnterParams takoEnterParams, C1862660yZU c1862660yZU, IMessageAbility iMessageAbility, C14FD c14fd, C1863850ybP c1863850ybP, int i) {
        super(0);
        this.$t = i;
        this.l0 = takoDisclaimerDialogProcessor;
        this.l1 = takoEnterParams;
        this.l2 = c1862660yZU;
        this.l3 = iMessageAbility;
        this.l4 = c14fd;
    }
}
