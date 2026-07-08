package com.bytedance.android.livesdk.comp.impl.game.partnership;

import X.AnonymousClass0956;
import X.C001A;
import X.C01GU;
import X.C01GW;
import X.C01SL;
import X.C098200Yq;
import X.C09JN;
import X.C0IJT;
import X.C0KYL;
import X.C0UO0;
import X.C0UZN;
import X.C1050980dSK;
import X.C1084710eKj;
import X.C1105940esy;
import X.C1148480fza;
import X.C1148490fzb;
import X.C1148500fzc;
import X.C1152710g6P;
import X.C1161920gLG;
import X.C11S5;
import X.C1388190mED;
import X.C13BV;
import X.C1548820qPI;
import X.C168I;
import X.C1701940uOG;
import X.C1838230xw5;
import X.C1867510yhJ;
import X.C1868450yip;
import X.C1869750ykv;
import X.C1869770ykx;
import X.C1869790ykz;
import X.C1870090ylT;
import X.C1870100ylU;
import X.C1870230ylh;
import X.C1878450yyx;
import X.C1878480yz0;
import X.C1878490yz1;
import X.C1878500yz2;
import X.C1878510yz3;
import X.C1878520yz4;
import X.C1878890yzf;
import X.C1879760z14;
import X.C1881050z39;
import X.C1881370z3f;
import X.C1881470z3p;
import X.C1882550z5Z;
import X.C1882810z5z;
import X.C1884390z8X;
import X.C1886020zBA;
import X.C189200o6;
import X.C197400pQ;
import X.C19748512Ol;
import X.C19EG;
import X.C20441214yg;
import X.C2095008Iq;
import X.C2188811AlT;
import X.C256100yt;
import X.C452501pT;
import X.C474500IjA;
import X.C480460Ism;
import X.C497740JfY;
import X.C500260Jjc;
import X.C513270KAz;
import X.C760370TsB;
import X.C781450Ul5;
import X.C782110Um9;
import X.C786410Ut5;
import X.C817403Hg;
import X.C843920X8s;
import X.EnumC1102740eno;
import X.EnumC760350Ts9;
import X.InterfaceC1487280oo2;
import X.InterfaceC1878550yz7;
import X.InterfaceC420801kM;
import X.InterfaceC743640TFa;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService;
import com.bytedance.android.livesdk.comp.impl.game.partnership.GamePartnershipService;
import com.bytedance.android.livesdk.comp.impl.game.partnership.ui.GamePartnershipWebviewDialog;
import com.bytedance.android.livesdk.comp.impl.game.partnership.ui.GameShortVideoAdDetailPageDialogFragment;
import com.bytedance.android.livesdk.game.api.GameLivePartnershipRetrofitApi;
import com.bytedance.android.livesdk.game.model.BriefGameTask;
import com.bytedance.android.livesdk.game.model.PartnershipTask;
import com.bytedance.android.livesdk.game.model.UserInfo;
import com.bytedance.android.livesdk.game.partnership.widget.GamePartnershipGamePinCardWidget;
import com.bytedance.android.livesdk.model.message.PartnershipGameOfflineMessage;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.AwS607S0100000_28;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import webcast.api.partnership.AnchorRoomInfoResponse;
import webcast.api.partnership.AudienceRoomInfoResponse;
import webcast.api.partnership.UserInfoResponse;

/* JADX INFO: loaded from: classes29.dex */
public class GamePartnershipService implements IGamePartnershipService {
    public Pair<Long, ? extends InterfaceC420801kM> LLJI;
    public C256100yt LLJILJIL;
    public final C01GW LL = C452501pT.LIZIZ(new C1869770ykx());
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new C1870100ylU());
    public final C01GW LLILLL = C452501pT.LIZIZ(new C1148490fzb());
    public final C01GW LLILZ = C452501pT.LIZIZ(new C1878490yz1());
    public final C01GW LLILZIL = C452501pT.LIZIZ(new C1878480yz0());
    public final C01GW LLILZLL = C452501pT.LIZIZ(new C1148500fzc());
    public final C01GW LLIZ = C452501pT.LIZIZ(new C1878510yz3());
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new C1878500yz2());
    public final C01GW LLJ = C452501pT.LIZIZ(new C1878520yz4(this));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new C1148480fza());
    public final WeakHashMap<C19EG, Long> LLJILJILJ = new WeakHashMap<>();

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService
    public final C1882810z5z HU0() {
        return (C1882810z5z) this.LLIZLLLIL.getValue();
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService
    public final C843920X8s Je0() {
        return (C843920X8s) this.LLILZIL.getValue();
    }

    public final C1869750ykv LIZ() {
        return (C1869750ykv) this.LL.getValue();
    }

    public final C1105940esy LIZIZ() {
        return (C1105940esy) this.LLILLL.getValue();
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService
    public final C1878890yzf S32() {
        return (C1878890yzf) this.LLIZ.getValue();
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService
    public final C1084710eKj UK1() {
        return (C1084710eKj) this.LLILZLL.getValue();
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService
    public final C1884390z8X V01() {
        return (C1884390z8X) this.LLJ.getValue();
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService
    public final C197400pQ fy0() {
        return (C197400pQ) this.LLILZ.getValue();
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService
    public final C1105940esy EU0() {
        return LIZIZ();
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService
    public final BriefGameTask Vg0() {
        List list;
        Object next;
        AudienceRoomInfoResponse.PartnershipInfo partnershipInfo = LIZ().LJ;
        if (partnershipInfo == null || (list = partnershipInfo.gameTasks) == null) {
            list = C13BV.INSTANCE;
        }
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (((BriefGameTask) next).showStatus == 0) {
                break;
            }
        }
        return (BriefGameTask) next;
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService
    public final Class<? extends LiveRecyclableWidget> bV0() {
        return GamePartnershipGamePinCardWidget.class;
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService
    public final C01GU oK0() {
        return C01GU.LIZ;
    }

    public static boolean LIZJ(C1869750ykv c1869750ykv) {
        List<BriefGameTask> list;
        AudienceRoomInfoResponse.PartnershipInfo partnershipInfo = c1869750ykv.LJ;
        if (partnershipInfo == null || (list = partnershipInfo.gameTasks) == null) {
            return true;
        }
        boolean z = false;
        if (!list.isEmpty()) {
            Iterator<BriefGameTask> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (it2.next().showStatus == 0) {
                    z = true;
                    break;
                }
            }
        }
        return !z;
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService
    public final C1881370z3f Ce0(Context context) {
        return new C1881370z3f(context);
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService
    public final boolean Mn(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        String strLIZIZ = C513270KAz.LIZ(str).LIZIZ("interaction_type");
        if (strLIZIZ == null || strLIZIZ.length() == 0) {
            strLIZIZ = "immersive_full_screen";
        }
        return C1152710g6P.LIZ(-1, strLIZIZ);
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService
    public final Boolean Vd1(long j) {
        if (LIZ().LIZ != j) {
            return null;
        }
        return Boolean.valueOf(LIZJ(LIZ()));
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService
    public final C1882550z5Z iz0(Context context) {
        return new C1882550z5Z(context);
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService
    public final void kA2(Room room) {
        if (room != null && C01SL.LIZ(room)) {
            String str = room.partnershipInfo.promotingGameId;
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_game_partnership_enter_room");
            c474500IjALIZ.LJJII("user", "user_type");
            c474500IjALIZ.LJJII(room.partnershipInfo.partnershipRoom, "partnership_room");
            c474500IjALIZ.LJJII(room.partnershipInfo.partnershipRoom, "promoting_room");
            c474500IjALIZ.LJJII(Long.valueOf(room.getId()), "room_id");
            c474500IjALIZ.LJJII(str, "game_id");
            c474500IjALIZ.LIZ();
        }
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService
    public final void s40(Room room) {
        long id;
        Long first;
        InterfaceC420801kM second;
        Pair<Long, ? extends InterfaceC420801kM> pair;
        InterfaceC420801kM second2;
        C256100yt c256100yt = this.LLJILJIL;
        if (c256100yt != null) {
            IMessageManager iMessageManager = c256100yt.LLILLL;
            if (iMessageManager != null) {
                iMessageManager.removeMessageListener(C001A.PARTNERSHIP_ANCHOR_MESSAGE.getIntType(), c256100yt);
            }
            c256100yt.LLILLL = null;
            c256100yt.LLILLJJLI = null;
        }
        this.LLJILJIL = null;
        if (room != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        if (LIZ().LIZ == id) {
            C1869750ykv c1869750ykvLIZ = LIZ();
            c1869750ykvLIZ.LIZ = 0L;
            c1869750ykvLIZ.LIZLLL = new LinkedHashMap();
            c1869750ykvLIZ.LJ = null;
            c1869750ykvLIZ.LIZIZ = null;
            c1869750ykvLIZ.LJFF = null;
        }
        Pair<Long, ? extends InterfaceC420801kM> pair2 = this.LLJI;
        if (pair2 != null && (first = pair2.getFirst()) != null && first.longValue() == id) {
            Pair<Long, ? extends InterfaceC420801kM> pair3 = this.LLJI;
            if (pair3 != null && (second = pair3.getSecond()) != null && !second.isDisposed() && (pair = this.LLJI) != null && (second2 = pair.getSecond()) != null) {
                second2.dispose();
            }
            this.LLJI = null;
        }
        C1105940esy c1105940esyLIZIZ = LIZIZ();
        c1105940esyLIZIZ.LJI = null;
        c1105940esyLIZIZ.LIZJ = "";
        c1105940esyLIZIZ.LIZLLL = false;
        c1105940esyLIZIZ.LJ = null;
        C1548820qPI.LJIIIIZZ("gameAudienceRewardDrops", c1105940esyLIZIZ.LJIIIIZZ);
        c1105940esyLIZIZ.LJFF = "";
        AnonymousClass0956 anonymousClass0956 = c1105940esyLIZIZ.LIZ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        c1105940esyLIZIZ.LIZ = null;
        c1105940esyLIZIZ.LJI();
        c1105940esyLIZIZ.LIZIZ = null;
        this.LLIZ.getValue().getClass();
        if (room != null) {
            long id2 = room.getId();
            this.LLIZ.getValue();
            C1878890yzf.LIZ("live", String.valueOf(id2));
        }
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService
    public final void At(String str, String str2) {
        C480460Ism.LIZ().getClass();
        ((GameLivePartnershipRetrofitApi) C480460Ism.LIZLLL(GameLivePartnershipRetrofitApi.class)).postGameFrame(str, str2).LJL(C11S5.LIZ()).LJJJLZIJ(C11S5.LIZ()).LJJLL(new C09JN() { // from class: X.0TAw
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("GamePartnershipService@b4f8.postGameShortVideoFrameInfo$1");
                C20441214yg.LIZIZ("GamePartnershipService", "success");
                C1C7U.LIZIZ("GamePartnershipService@b4f8.postGameShortVideoFrameInfo$1");
            }
        }, new C09JN() { // from class: X.0TAx
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("GamePartnershipService@b4f8.postGameShortVideoFrameInfo$2");
                Throwable th = (Throwable) obj;
                if (th instanceof C1494690ozz) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("error ");
                    sbLIZ.append(((C1494690ozz) th).getStatusCode());
                    C20441214yg.LJ("GamePartnershipService", C2188811AlT.LIZIZ(sbLIZ));
                }
                C20441214yg.LJI("GamePartnershipService", th);
                C1C7U.LIZIZ("GamePartnershipService@b4f8.postGameShortVideoFrameInfo$2");
            }
        });
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService
    public final void GB1(DataChannel dataChannel, boolean z) {
        C1878450yyx c1878450yyx = new C1878450yyx(z);
        if (z) {
            EnumC1102740eno.AUDIENCE_PARTNERSHIP.load(dataChannel, c1878450yyx, false);
        } else {
            EnumC1102740eno.AUDIENCE_LANDSCAPE_PARTNERSHIP.load(dataChannel, c1878450yyx, false);
        }
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService
    public final void Wo2(final long j, final Function1<? super AnchorRoomInfoResponse.ResponseData, Unit> function1) {
        AnchorRoomInfoResponse.ResponseData responseData = ((C1870090ylT) this.LLILLJJLI.getValue()).LIZIZ;
        if (j == ((C1870090ylT) this.LLILLJJLI.getValue()).LIZ && responseData != null) {
            function1.invoke(responseData);
        } else {
            C480460Ism.LIZ().getClass();
            ((GameLivePartnershipRetrofitApi) C480460Ism.LIZLLL(GameLivePartnershipRetrofitApi.class)).requestAnchorRoomInfo(String.valueOf(j)).LJIILIIL(new C0UO0()).LJJLL(new C09JN() { // from class: X.0ylS
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("GamePartnershipService@b4f8.getAnchorRoomInfo$1");
                    ((C1870090ylT) this.LL.LLILLJJLI.getValue()).LIZ = j;
                    C1870090ylT c1870090ylT = (C1870090ylT) this.LL.LLILLJJLI.getValue();
                    T t = ((BaseResponse) obj).data;
                    c1870090ylT.LIZIZ = (AnchorRoomInfoResponse.ResponseData) t;
                    function1.invoke(t);
                    C1C7U.LIZIZ("GamePartnershipService@b4f8.getAnchorRoomInfo$1");
                }
            }, new C09JN() { // from class: X.0TAv
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("GamePartnershipService@b4f8.getAnchorRoomInfo$2");
                    C20441214yg.LJI("ToolbarPartnershipDropsBehavior", (Throwable) obj);
                    C1C7U.LIZIZ("GamePartnershipService@b4f8.getAnchorRoomInfo$2");
                }
            });
        }
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService
    public final C1881470z3p jn2(long j, Context context) {
        return new C1881470z3p(j, context);
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService
    public final void kr1(long j, DataChannel dataChannel) {
        Wo2(j, new C1867510yhJ(dataChannel));
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService
    public final boolean pW0(long j, List<PartnershipGameOfflineMessage.OfflineGameInfo> list) {
        List arrayList;
        if (LIZ().LIZ == j) {
            AudienceRoomInfoResponse.PartnershipInfo partnershipInfo = LIZ().LJ;
            if (partnershipInfo == null || (arrayList = partnershipInfo.gameTasks) == null) {
                arrayList = new ArrayList();
            }
            Iterator<PartnershipGameOfflineMessage.OfflineGameInfo> it2 = list.iterator();
            while (it2.hasNext()) {
                C500260Jjc.LJJJLIIL(arrayList, new C1868450yip(it2.next()));
            }
            return arrayList.isEmpty();
        }
        return true;
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService
    public final void tm0(DataChannel dataChannel, Long l) {
        if (dataChannel != null && l != null) {
            l.longValue();
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
            if (!Intrinsics.LJFF(dataChannelGlobal.gg0(C168I.class), Boolean.TRUE)) {
                return;
            }
            this.LLJILJIL = new C256100yt(l.longValue(), dataChannel);
            dataChannelGlobal.IQ2(C168I.class);
        }
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService
    public final void bO(Context context, String str, String str2) {
        C781450Ul5.LIZ.getClass();
        if (!C781450Ul5.LIZLLL) {
            C781450Ul5.LIZLLL = true;
            C782110Um9 c782110Um9 = new C782110Um9(context);
            c782110Um9.LJII(2131841829);
            c782110Um9.LJIILIIL(2131841830, new InterfaceC743640TFa() { // from class: X.0yz8
                @Override // X.InterfaceC743640TFa
                public final void LIZ(LiveDialog liveDialog) {
                    liveDialog.dismiss();
                }
            });
            c782110Um9.LJIJ = new DialogInterface.OnDismissListener() { // from class: X.0UlJ
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    C781450Ul5.LIZLLL = false;
                }
            };
            C786410Ut5.E4(c782110Um9.LIZ());
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_add_not_meet_popup_show");
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LJJII(str, "user_type");
            c474500IjALIZ.LJJII(str2, "request_page");
            c474500IjALIZ.LIZ();
        }
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService
    public final void oU0(Context context, String str, Map<String, String> map) {
        C781450Ul5.LIZ.getClass();
        if (str.length() != 0) {
            C760370TsB c760370TsBLIZ = C0KYL.LIZ(str);
            Uri uri = UriProtector.parse(str);
            C817403Hg c817403Hg = new C817403Hg();
            float f = 1.0f;
            c817403Hg.element = 1.0f;
            if (UriProtector.getQueryParameterNames(uri).contains("game_drag_handle")) {
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "game_drag_handle");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
                    try {
                        f = CastFloatProtector.parseFloat(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                    }
                }
                c817403Hg.element = f;
                C189200o6.m2constructorimpl(Unit.LIZ);
            }
            c760370TsBLIZ.LJIJJLI("bottom");
            c760370TsBLIZ.LJJ((int) C497740JfY.LJJI(C497740JfY.LJIIZILJ()), EnumC760350Ts9.DP);
            c760370TsBLIZ.LJJII(map);
            ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).YC1(context, c760370TsBLIZ.LIZ().toString(), new C1886020zBA(c817403Hg));
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [X.015d] */
    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService
    public final void BP0(final Activity activity, final String str, final String str2, Function2<? super JSONObject, ? super UserInfo, Unit> function2) {
        int i;
        C781450Ul5 c781450Ul5 = C781450Ul5.LIZ;
        final C1870230ylh c1870230ylh = new C1870230ylh(function2, this);
        c781450Ul5.getClass();
        final ?? r4 = new C0UZN() { // from class: X.015d
            @Override // X.C0UZN
            public final Unit LJJIFFI() {
                C20441214yg.LIZIZ("PartnershipDialogUtils", "canceled dialog for edit dob");
                return Unit.LIZ;
            }

            @Override // X.C0UZN
            public final Unit onFailed(String str3) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("edit dob failed and msg:");
                sbLIZ.append(str3);
                C20441214yg.LJ("PartnershipDialogUtils", C2188811AlT.LIZIZ(sbLIZ));
                return Unit.LIZ;
            }

            @Override // X.C0UZN
            public final Unit LJJI(String str3, String str4) throws JSONException {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(" enter edit dob succeed and dob:");
                sbLIZ.append(str3);
                sbLIZ.append(", appealUrl:");
                sbLIZ.append(str4);
                C20441214yg.LIZIZ("PartnershipDialogUtils", C2188811AlT.LIZIZ(sbLIZ));
                C2764015e.LIZ = true;
                C2764015e.LIZIZ = true;
                final JSONObject jSONObject = new JSONObject();
                jSONObject.put("taskId", "");
                jSONObject.put("userId", String.valueOf(UserService.getInstance().user().getCurrentUserId()));
                jSONObject.put("isFromApp", 1);
                C480460Ism.LIZ().getClass();
                C11NZ<R> c11nzLJIILIIL = ((GameLivePartnershipRetrofitApi) C480460Ism.LIZLLL(GameLivePartnershipRetrofitApi.class)).requestUserInfo().LJIILIIL(new C0UO0());
                final Function2<JSONObject, UserInfo, Unit> function22 = c1870230ylh;
                c11nzLJIILIIL.LJJLL(new C09JN() { // from class: X.015a
                    @Override // X.C09JN
                    public final void accept(Object obj) throws JSONException {
                        Integer numValueOf;
                        UserInfo userInfo;
                        C1C7U.LIZ("PartnershipDialogUtils@1934.showBirthdayEditDialog$1$onSuccess$1");
                        BaseResponse baseResponse = (BaseResponse) obj;
                        JSONObject jSONObject2 = jSONObject;
                        UserInfoResponse.ResponseData responseData = (UserInfoResponse.ResponseData) baseResponse.data;
                        UserInfo userInfo2 = null;
                        if (responseData != null && (userInfo = responseData.info) != null) {
                            numValueOf = Integer.valueOf(userInfo.minAge);
                        } else {
                            numValueOf = null;
                        }
                        jSONObject2.put("age", numValueOf);
                        Function2<JSONObject, UserInfo, Unit> function23 = function22;
                        JSONObject jSONObject3 = jSONObject;
                        UserInfoResponse.ResponseData responseData2 = (UserInfoResponse.ResponseData) baseResponse.data;
                        if (responseData2 != null) {
                            userInfo2 = responseData2.info;
                        }
                        function23.invoke(jSONObject3, userInfo2);
                        C1C7U.LIZIZ("PartnershipDialogUtils@1934.showBirthdayEditDialog$1$onSuccess$1");
                    }
                }, new C09JN() { // from class: X.015Z
                    @Override // X.C09JN
                    public final void accept(Object obj) throws JSONException {
                        C1C7U.LIZ("PartnershipDialogUtils@1934.showBirthdayEditDialog$1$onSuccess$2");
                        jSONObject.put("age", 0);
                        function22.invoke(jSONObject, null);
                        C1C7U.LIZIZ("PartnershipDialogUtils@1934.showBirthdayEditDialog$1$onSuccess$2");
                    }
                });
                return Unit.LIZ;
            }
        };
        if (!C781450Ul5.LIZIZ) {
            if (Intrinsics.LJFF("user", str)) {
                i = 2131841833;
            } else {
                i = 2131841832;
            }
            C782110Um9 c782110Um9 = new C782110Um9(activity);
            c782110Um9.LJIILLIIL = false;
            c782110Um9.LJIILL = false;
            c782110Um9.LJIIZILJ(2131841834);
            c782110Um9.LJII(i);
            c782110Um9.LJIILIIL(2131841831, new InterfaceC743640TFa() { // from class: X.0Ul3
                @Override // X.InterfaceC743640TFa
                public final void LIZ(LiveDialog liveDialog) {
                    liveDialog.dismiss();
                    C781450Ul5 c781450Ul52 = C781450Ul5.LIZ;
                    String str3 = str;
                    String str4 = str2;
                    c781450Ul52.getClass();
                    C781450Ul5.LIZ(str3, str4, "add");
                    IHostAction iHostAction = (IHostAction) C1161920gLG.LIZJ(IHostAction.class);
                    Activity activity2 = activity;
                    final String str5 = str2;
                    final C0UZN c0uzn = r4;
                    final String str6 = str;
                    iHostAction.goEditDoBAgeGatePage(activity2, str5, new C10JU() { // from class: X.0UZE
                        @Override // X.C10JU
                        public final void onFailed() {
                            c0uzn.onFailed("");
                        }

                        @Override // X.C10JU
                        public final void onSuccess(String str7) {
                            c0uzn.LJJI(str7, "");
                            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_age_edit_confirm_click");
                            c474500IjALIZ.LJIL();
                            c474500IjALIZ.LJJII(str6, "user_type");
                            c474500IjALIZ.LJJII(str5, "request_page");
                            c474500IjALIZ.LIZ();
                        }
                    });
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_age_edit_page_show");
                    c474500IjALIZ.LJIL();
                    c474500IjALIZ.LJJII(str, "user_type");
                    c474500IjALIZ.LJJII(str2, "request_page");
                    c474500IjALIZ.LJJII(1, "user_age_status");
                    c474500IjALIZ.LIZ();
                }
            });
            c782110Um9.LJIIJ(2131840927, new InterfaceC743640TFa() { // from class: X.0Ul4
                @Override // X.InterfaceC743640TFa
                public final void LIZ(LiveDialog liveDialog) {
                    liveDialog.dismiss();
                    C781450Ul5 c781450Ul52 = C781450Ul5.LIZ;
                    String str3 = str;
                    String str4 = str2;
                    c781450Ul52.getClass();
                    C781450Ul5.LIZ(str3, str4, "cancel");
                    r4.LJJIFFI();
                }
            });
            c782110Um9.LJIJ = new DialogInterface.OnDismissListener() { // from class: X.0yz5
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    C781450Ul5.LIZIZ = false;
                }
            };
            c782110Um9.LJIIZILJ = new DialogInterface.OnShowListener() { // from class: X.0yz6
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    C781450Ul5.LIZIZ = true;
                }
            };
            C786410Ut5.E4(c782110Um9.LIZ());
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_add_birth_popup_show");
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LJJII(str2, "request_page");
            c474500IjALIZ.LJJII(str, "user_type");
            c474500IjALIZ.LIZ();
        }
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService
    public final void Nq0(final Context context, final Room room, final DataChannel dataChannel, final Function1<? super C1869750ykv, Unit> function1) {
        long id = room.getId();
        if (id <= 0) {
            function1.invoke(C1869750ykv.LJI);
            return;
        }
        if (LIZ().LIZ == id) {
            function1.invoke(LIZ());
            return;
        }
        C480460Ism.LIZ().getClass();
        GameLivePartnershipRetrofitApi gameLivePartnershipRetrofitApi = (GameLivePartnershipRetrofitApi) C480460Ism.LIZLLL(GameLivePartnershipRetrofitApi.class);
        final long jCurrentTimeMillis = System.currentTimeMillis();
        String idStr = room.getIdStr();
        String idStr2 = room.getOwner().getIdStr();
        this.LLILZIL.getValue();
        this.LLJI = new Pair<>(Long.valueOf(room.getId()), gameLivePartnershipRetrofitApi.requestAudienceRoomInfo(idStr, idStr2, C843920X8s.LIZIZ(context), "").LJL(C11S5.LIZ()).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.00UV
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                BaseResponse baseResponse = (BaseResponse) obj;
                return new Pair(GsonProtectorUtils.fromJson(C293501Bt.LIZ(), (k) baseResponse.data, AudienceRoomInfoResponse.ResponseData.class), baseResponse);
            }
        }).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.0ylW
            /* JADX WARN: Removed duplicated region for block: B:44:0x0191  */
            /* JADX WARN: Removed duplicated region for block: B:47:0x019b  */
            /* JADX WARN: Removed duplicated region for block: B:50:0x01a5  */
            /* JADX WARN: Removed duplicated region for block: B:58:0x01db  */
            /* JADX WARN: Removed duplicated region for block: B:59:0x01dd  */
            /* JADX WARN: Removed duplicated region for block: B:60:0x01df  */
            @Override // X.C09JN
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void accept(java.lang.Object r29) {
                /*
                    Method dump skipped, instruction units count: 481
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1870120ylW.accept(java.lang.Object):void");
            }
        }, new C09JN() { // from class: X.0ylV
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("GamePartnershipService@b4f8.requestAudienceRoomInfo$disposable$3");
                Throwable th = (Throwable) obj;
                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                GamePartnershipService gamePartnershipService = this;
                gamePartnershipService.getClass();
                if (th instanceof C1811850xFX) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(" code = ");
                    sbLIZ.append(((C1811850xFX) th).statusCode);
                    C20441214yg.LJ("GamePartnershipService", C2188811AlT.LIZIZ(sbLIZ));
                }
                C20441214yg.LJI("GamePartnershipService", th);
                C1869750ykv c1869750ykvLIZ = gamePartnershipService.LIZ();
                c1869750ykvLIZ.LIZ = 0L;
                c1869750ykvLIZ.LIZLLL = new LinkedHashMap();
                c1869750ykvLIZ.LJ = null;
                c1869750ykvLIZ.LIZIZ = null;
                c1869750ykvLIZ.LJFF = null;
                function1.invoke(C1869750ykv.LJI);
                C1878360yyo.LJ(false, null, dataChannel, jCurrentTimeMillis2, th, 2);
                C1C7U.LIZIZ("GamePartnershipService@b4f8.requestAudienceRoomInfo$disposable$3");
            }
        }));
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService
    public final void Yb2(Context context, Room room, DataChannel dataChannel, Boolean bool) {
        if (bool != null) {
            bool.booleanValue();
            if (dataChannel == null) {
                return;
            }
            Nq0(context, room, dataChannel, new C1869790ykz(dataChannel, room, this, bool));
        }
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService
    public final void hn1(Activity activity, String str, Map<String, String> map, boolean z) throws Throwable {
        FragmentManager supportFragmentManager;
        if (str == null) {
            return;
        }
        if (z) {
            ((C1884390z8X) this.LLJ.getValue()).LIZJ(activity, str, map, null);
            return;
        }
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(activity);
        if (c19egLIZIZ == null || (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) == null) {
            return;
        }
        UUID.randomUUID().toString();
        GameShortVideoAdDetailPageDialogFragment gameShortVideoAdDetailPageDialogFragment = new GameShortVideoAdDetailPageDialogFragment();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("lynx_schema", str, bundle);
        String json = GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, map);
        if (json == null) {
            json = "{}";
        }
        C786410Ut5.LJJJI("initial_data", json, bundle);
        gameShortVideoAdDetailPageDialogFragment.setArguments(bundle);
        gameShortVideoAdDetailPageDialogFragment.show(supportFragmentManager, "");
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService
    public final boolean m71(int i, long j, String str, boolean z) {
        boolean z2;
        List<BriefGameTask> list;
        String string;
        boolean zLJFF;
        Long l;
        if (LIZ().LIZ != j) {
            return true;
        }
        if (i != 3 && i != 4) {
            z2 = false;
        } else {
            z2 = true;
        }
        AudienceRoomInfoResponse.PartnershipInfo partnershipInfo = LIZ().LJ;
        BriefGameTask briefGameTask = null;
        Object obj = null;
        briefGameTask = null;
        if (partnershipInfo != null) {
            list = partnershipInfo.gameTasks;
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (BriefGameTask briefGameTask2 : list) {
                    if (briefGameTask2.taskType == i) {
                        arrayList.add(briefGameTask2);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    BriefGameTask briefGameTask3 = (BriefGameTask) next;
                    if (z2) {
                        zLJFF = Intrinsics.LJFF(briefGameTask3.briefGame.idStr, str);
                    } else {
                        PartnershipTask partnershipTask = briefGameTask3.task;
                        if (partnershipTask != null && (l = partnershipTask.id) != null) {
                            string = l.toString();
                        } else {
                            string = null;
                        }
                        zLJFF = Intrinsics.LJFF(string, str);
                    }
                    if (zLJFF) {
                        obj = next;
                        break;
                    }
                }
                briefGameTask = (BriefGameTask) obj;
                if (briefGameTask != null) {
                    briefGameTask.showStatus = z ? 1 : 0;
                }
            }
        } else {
            list = null;
        }
        if (!z && list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (BriefGameTask briefGameTask4 : list) {
                if (!Intrinsics.LJFF(briefGameTask4, briefGameTask)) {
                    arrayList2.add(briefGameTask4);
                }
            }
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                ((BriefGameTask) it3.next()).showStatus = 1;
            }
        }
        return LIZJ(LIZ());
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService
    public final void pv(Activity activity, String str, Map map, C1050980dSK c1050980dSK) throws Throwable {
        Integer numLJIIJJI;
        String str2;
        Integer numLJIIJJI2;
        if (str == null) {
            return;
        }
        C1884390z8X c1884390z8X = (C1884390z8X) this.LLJ.getValue();
        c1884390z8X.getClass();
        String str3 = (String) map.get("bc_label_text");
        String str4 = (String) map.get("bc_label_show");
        boolean z = true;
        if (str4 == null || (numLJIIJJI = C2095008Iq.LJIIJJI(str4)) == null || numLJIIJJI.intValue() != 1 || (str2 = (String) map.get("bc_toggle_style_type")) == null || (numLJIIJJI2 = C2095008Iq.LJIIJJI(str2)) == null || numLJIIJJI2.intValue() != 1) {
            z = false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("openGameDetailMixPageFromFeed bcLabelText='");
        sbLIZ.append(str3);
        sbLIZ.append('\'');
        C20441214yg.LIZIZ("GamePartnershipSchemaRouter", C2188811AlT.LIZIZ(sbLIZ));
        c1884390z8X.LIZJ(activity, str, map, new C1879760z14(c1050980dSK, str3, z));
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService
    public final void r11(Context context, String str, String str2, String str3) {
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ == null) {
            return;
        }
        FragmentManager supportFragmentManager = c19egLIZIZ.getSupportFragmentManager();
        GamePartnershipWebviewDialog gamePartnershipWebviewDialog = new GamePartnershipWebviewDialog();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("arg_url", str, bundle);
        C786410Ut5.LJJJI("arg_title", str2, bundle);
        C786410Ut5.LJJJI("arg_desc", str3, bundle);
        gamePartnershipWebviewDialog.setArguments(bundle);
        C500260Jjc.LJJLIIIJILLIZJL(new C1838230xw5(c19egLIZIZ, supportFragmentManager, this, gamePartnershipWebviewDialog));
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService
    public final void Gf(int i, String str, String str2, long j, String str3, String str4) {
        ((InterfaceC1878550yz7) this.LLJIJIL.getValue()).Gf(i, str, str2, j, str3, str4);
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService
    public final C1881050z39 cg2(Context context, Room room, DataChannel dataChannel, int i, Map map, String str, AwS603S0100000_24 awS603S0100000_24, AwS607S0100000_28 awS607S0100000_28) {
        return new C1881050z39(context, room, dataChannel, i, map, str, awS603S0100000_24, awS607S0100000_28);
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService
    public final boolean rp(String str, String str2, String str3, long j, String str4, int i, String str5, String str6, String str7, String str8) {
        return ((InterfaceC1878550yz7) this.LLJIJIL.getValue()).rp(str, str2, str3, j, str4, i, str5, str6, str7, str8);
    }
}
