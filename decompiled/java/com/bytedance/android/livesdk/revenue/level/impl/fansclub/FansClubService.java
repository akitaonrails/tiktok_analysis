package com.bytedance.android.livesdk.revenue.level.impl.fansclub;

import X.C0IJT;
import X.C1092520eXK;
import X.C1094590eaf;
import X.C1094950ebF;
import X.C1095110ebV;
import X.C1095140ebY;
import X.C1097290ef1;
import X.C1105280eru;
import X.C1117530fBf;
import X.C1161920gLG;
import X.C419430GcX;
import X.C419440GcY;
import X.C474500IjA;
import X.C495520Jby;
import X.C500260Jjc;
import X.C518180KTw;
import X.InterfaceC1095350ebt;
import X.InterfaceC1096360edW;
import X.InterfaceC1112400f3O;
import X.InterfaceC1847290yAh;
import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.SubscribeInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdk.livesetting.level.FansClubAnchorEntranceSettings;
import com.bytedance.android.livesdk.livesetting.level.FansClubAudienceEntranceSettings;
import com.bytedance.android.livesdk.livesetting.level.FansClubCustomizedBenefitCapsuleConfig;
import com.bytedance.android.livesdk.livesetting.level.FansEntranceResConfig;
import com.bytedance.android.livesdk.livesetting.level.LiveFansClubStickerRegisterWithRankSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveCapsuleStyleItemConfig;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.RoomSticker;
import com.bytedance.android.livesdk.model.message.CapsuleMessage;
import com.bytedance.android.livesdk.rank.api.IRankService;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget;
import com.bytedance.mt.protector.impl.UriProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.AwS135S0110000_17;
import org.json.JSONObject;
import webcast.data.FansLevelInfo;
import webcast.data.SubSplitStatus;

/* JADX INFO: loaded from: classes18.dex */
public class FansClubService implements IFansClubService {
    public IFansClubService LL;
    public C1092520eXK LLILLJJLI;

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final boolean Ag1() {
        IFansClubService iFansClubService = this.LL;
        if (iFansClubService != null) {
            return iFansClubService.Ag1();
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final void C11() {
        IFansClubService iFansClubService = this.LL;
        if (iFansClubService != null) {
            iFansClubService.C11();
        }
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final void Gy1() {
        IFansClubService iFansClubService = this.LL;
        if (iFansClubService != null) {
            iFansClubService.Gy1();
        }
        this.LL = null;
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final long Ib1() {
        IFansClubService iFansClubService = this.LL;
        if (iFansClubService != null) {
            return iFansClubService.Ib1();
        }
        return 0L;
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final void Iy2() {
        IFansClubService iFansClubService = this.LL;
        if (iFansClubService != null) {
            iFansClubService.Iy2();
        }
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final void LA2() {
        IFansClubService iFansClubService = this.LL;
        if (iFansClubService != null) {
            iFansClubService.LA2();
        }
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final boolean TL0() {
        return FansClubAudienceEntranceSettings.INSTANCE.getValue();
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final void Wt2() {
        IFansClubService iFansClubService = this.LL;
        if (iFansClubService != null) {
            iFansClubService.Wt2();
        }
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final boolean c70() {
        IFansClubService iFansClubService = this.LL;
        if (iFansClubService != null) {
            return iFansClubService.c70();
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final ArrayList<Double> i42() {
        IFansClubService iFansClubService = this.LL;
        if (iFansClubService != null) {
            return iFansClubService.i42();
        }
        return null;
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final boolean il0() {
        IFansClubService iFansClubService = this.LL;
        if (iFansClubService != null) {
            return iFansClubService.il0();
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final void lI2() {
        C1097290ef1.LIZ(new InterfaceC1847290yAh() { // from class: X.0yAd
            public final int LIZ = 13;

            @Override // X.InterfaceC1847290yAh
            public final int getType() {
                return this.LIZ;
            }

            @Override // X.InterfaceC1847290yAh
            public final AbstractC1847300yAi LIZ(RoomSticker roomSticker, Context context, DataChannel dataChannel) {
                return new C1847240yAc(roomSticker, context, dataChannel);
            }
        });
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final void nk1() {
        IFansClubService iFansClubService = this.LL;
        if (iFansClubService != null) {
            iFansClubService.nk1();
        }
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final boolean oS0() {
        return FansClubAnchorEntranceSettings.INSTANCE.getValue();
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final RoomRecycleWidget pa2() {
        return new FansClubWidget();
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final C1095140ebY uw0() {
        IFansClubService iFansClubService = this.LL;
        if (iFansClubService != null) {
            return iFansClubService.uw0();
        }
        return null;
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final boolean wd2() {
        IFansClubService iFansClubService = this.LL;
        if (iFansClubService != null) {
            return iFansClubService.wd2();
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final void we2() {
        IFansClubService iFansClubService = this.LL;
        if (iFansClubService != null) {
            iFansClubService.we2();
        }
    }

    public final void onInit() {
        C1105280eru.LIZIZ(null, Collections.singleton(Integer.valueOf(R.layout.gg6)));
        if (!LiveFansClubStickerRegisterWithRankSetting.INSTANCE.getValue()) {
            lI2();
        }
        ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).bQ1(73, new InterfaceC1112400f3O() { // from class: X.0125
            @Override // X.InterfaceC1112400f3O
            public final boolean LIZ() {
                return true;
            }

            @Override // X.InterfaceC1112400f3O
            public final void LIZIZ(CapsuleMessage capsuleMessage, Map<String, String> map) {
            }

            @Override // X.InterfaceC1112400f3O
            public final void LJII(C1112330f3H c1112330f3H, Map<String, String> map) {
            }

            @Override // X.InterfaceC1112400f3O
            public final boolean LJIIIZ(C1112330f3H c1112330f3H) {
                return false;
            }

            @Override // X.InterfaceC1112400f3O
            public final boolean LJIIJJI(C1112330f3H c1112330f3H) {
                return false;
            }

            @Override // X.InterfaceC1112400f3O
            public final void LJIILLIIL() {
            }

            @Override // X.InterfaceC1112400f3O
            public final int LJIIZILJ() {
                return 0;
            }

            @Override // X.InterfaceC1112400f3O
            public final void LJIJ(C1112330f3H c1112330f3H, Map<String, String> map) {
            }

            @Override // X.InterfaceC1112400f3O
            public final void LJIL(C1112330f3H c1112330f3H) {
            }

            @Override // X.InterfaceC1112400f3O
            public final void LJJIFFI(C1112330f3H c1112330f3H, Map<String, String> map) {
            }

            @Override // X.InterfaceC1112400f3O
            public final void LJJIIJ(C1112330f3H c1112330f3H) {
            }

            @Override // X.InterfaceC1112400f3O
            public final int LJJIIZI(CapsuleMessage capsuleMessage) {
                return -1;
            }

            @Override // X.InterfaceC1112400f3O
            public final void LJJIJIIJI() {
            }

            @Override // X.InterfaceC1112400f3O
            public final int LJJIJL(CapsuleMessage capsuleMessage) {
                return -1;
            }

            @Override // X.InterfaceC1112400f3O
            public final LiveCapsuleStyleItemConfig LJI() {
                return C952230at3.LIZ();
            }

            @Override // X.InterfaceC1112400f3O
            public final boolean LJIIIIZZ(C1112330f3H c1112330f3H) {
                return C952230at3.LIZJ();
            }

            @Override // X.InterfaceC1112400f3O
            public final boolean LJJIIZ(C1112330f3H c1112330f3H) {
                return C952230at3.LIZIZ(c1112330f3H);
            }

            @Override // X.InterfaceC1112400f3O
            public final boolean LJJIJIL(C1109770ez9 c1109770ez9, CapsuleMessage capsuleMessage) {
                int iIntValue;
                C0JT6<Integer> c0jt6 = InterfaceC1106030et7.ba;
                Integer numLIZ = c0jt6.LIZ();
                if (numLIZ != null) {
                    iIntValue = numLIZ.intValue();
                } else {
                    iIntValue = 0;
                }
                if (iIntValue >= FansClubCustomizedBenefitCapsuleConfig.INSTANCE.getValue()) {
                    return true;
                }
                c0jt6.LIZJ(Integer.valueOf(iIntValue + 1));
                return false;
            }
        });
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final Class<? extends LiveRecyclableWidget> PH() {
        return FansClubWidget.class;
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final int AR(List<BadgeStruct> list) {
        IFansClubService iFansClubService = this.LL;
        if (iFansClubService != null) {
            return iFansClubService.AR(list);
        }
        return -1;
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final void Fr0(String str) {
        IFansClubService iFansClubService = this.LL;
        if (iFansClubService != null) {
            iFansClubService.Fr0(str);
        }
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final boolean HZ1(long j) {
        IFansClubService iFansClubService = this.LL;
        if (iFansClubService != null) {
            return iFansClubService.HZ1(j);
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final boolean Kw0(DataChannel dataChannel) {
        SubSplitStatus subSplitStatus;
        Room roomLJJLIIIIJ;
        User owner;
        SubscribeInfo subscribeInfo;
        if (dataChannel != null && (roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannel)) != null && (owner = roomLJJLIIIIJ.getOwner()) != null && (subscribeInfo = owner.getSubscribeInfo()) != null) {
            subSplitStatus = subscribeInfo.subSplitStatus;
        } else {
            subSplitStatus = null;
        }
        return pY1(subSplitStatus);
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final Fragment Qn0(String str) {
        IFansClubService iFansClubService = this.LL;
        if (iFansClubService != null) {
            return iFansClubService.Qn0(str);
        }
        return null;
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final void RL1(String str) {
        IFansClubService iFansClubService = this.LL;
        if (iFansClubService != null) {
            iFansClubService.RL1(str);
        }
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final void RV0(String str) {
        if (this.LLILLJJLI == null) {
            this.LLILLJJLI = new C1092520eXK();
        }
        if (this.LLILLJJLI != null) {
            C1092520eXK.LJ(null, str, true);
        }
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final C419440GcY SR1(Context context) {
        if (context == null) {
            return null;
        }
        return new C419440GcY(context);
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final boolean VV0(String str) {
        IFansClubService iFansClubService = this.LL;
        if (iFansClubService != null) {
            return iFansClubService.VV0(str);
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final C419430GcX WL2(Context context) {
        if (context == null) {
            return null;
        }
        return new C419430GcX(context);
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final int Wy2(int i) {
        IFansClubService iFansClubService = this.LL;
        if (iFansClubService != null) {
            return iFansClubService.Wy2(i);
        }
        return 0;
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final FansEntranceResConfig gY(int i) {
        IFansClubService iFansClubService = this.LL;
        if (iFansClubService != null) {
            return iFansClubService.gY(i);
        }
        return null;
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final boolean iA2(boolean z) {
        IFansClubService iFansClubService = this.LL;
        if (iFansClubService != null) {
            return iFansClubService.iA2(z);
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final boolean kI1(DataChannel dataChannel) {
        SubSplitStatus subSplitStatus;
        Room roomLJJLIIIIJ;
        User owner;
        SubscribeInfo subscribeInfo;
        if (dataChannel != null && (roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannel)) != null && (owner = roomLJJLIIIIJ.getOwner()) != null && (subscribeInfo = owner.getSubscribeInfo()) != null) {
            subSplitStatus = subscribeInfo.subSplitStatus;
        } else {
            subSplitStatus = null;
        }
        if (subSplitStatus == null || ((subSplitStatus.curPeriod != 2 && subSplitStatus.curPeriod != 3) || (subSplitStatus.curPeriod == 2 && subSplitStatus.isOldSubCreator))) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final boolean pY1(SubSplitStatus subSplitStatus) {
        Integer numValueOf;
        if (subSplitStatus != null && (numValueOf = Integer.valueOf(subSplitStatus.curPeriod)) != null) {
            if (numValueOf.intValue() == 2 || numValueOf.intValue() == 3) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final void qH(double d) {
        IFansClubService iFansClubService = this.LL;
        if (iFansClubService != null) {
            iFansClubService.qH(d);
        }
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final ImageModel qf1(long j) {
        IFansClubService iFansClubService = this.LL;
        if (iFansClubService != null) {
            return iFansClubService.qf1(j);
        }
        return null;
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final void sp1(Context context) {
        C495520Jby c495520Jby = new C495520Jby("aweme://roma_redirect/?");
        c495520Jby.LIZJ("roma_group_key", "spark_page_user-super-fan-privilege");
        c495520Jby.LIZJ("spark_page", "user-super-fan-privilege");
        c495520Jby.LIZJ("roma_page_key", "p");
        c495520Jby.LIZJ("source_page", "superfan_goal");
        ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(context, UriProtector.parse(c495520Jby.LIZLLL()));
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final C1095140ebY tL1(User user) {
        IFansClubService iFansClubService = this.LL;
        if (iFansClubService != null) {
            return iFansClubService.tL1(user);
        }
        return null;
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final void wQ(double d) {
        IFansClubService iFansClubService = this.LL;
        if (iFansClubService != null) {
            iFansClubService.wQ(d);
        }
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final C1094950ebF y51(long j) {
        IFansClubService iFansClubService = this.LL;
        if (iFansClubService != null) {
            return iFansClubService.y51(j);
        }
        return null;
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final boolean C71(int i, int i2) {
        IFansClubService iFansClubService = this.LL;
        if (iFansClubService != null) {
            return iFansClubService.C71(i, i2);
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final void OF0(SparkContext sparkContext, String str) {
        IFansClubService iFansClubService = this.LL;
        if (iFansClubService != null) {
            iFansClubService.OF0(sparkContext, str);
        }
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final void S30(Gift gift, Long l) {
        IFansClubService iFansClubService = this.LL;
        if (iFansClubService != null) {
            iFansClubService.S30(gift, l);
        }
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final void St1(Context context, C1094590eaf c1094590eaf) {
        IFansClubService iFansClubService = this.LL;
        if (iFansClubService != null) {
            iFansClubService.St1(context, c1094590eaf);
        }
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final void VN2(Context context, C1094590eaf c1094590eaf) {
        IFansClubService iFansClubService = this.LL;
        if (iFansClubService != null) {
            iFansClubService.VN2(context, c1094590eaf);
        }
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final void c30(DataChannel dataChannel, Context context) {
        C495520Jby c495520Jby = new C495520Jby("aweme://roma_redirect/?");
        c495520Jby.LIZJ("roma_group_key", "spark_page_fans_anchor_manage_offline");
        c495520Jby.LIZJ("spark_page", "fans_anchor_manage_offline");
        c495520Jby.LIZJ("roma_page_key", "p");
        c495520Jby.LIZJ("source_page", "live_take_page");
        ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(context, UriProtector.parse(c495520Jby.LIZLLL()));
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final void cT1(BadgeStruct badgeStruct, BadgeStruct badgeStruct2) {
        IFansClubService iFansClubService = this.LL;
        if (iFansClubService != null) {
            iFansClubService.cT1(badgeStruct, badgeStruct2);
        }
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final void de1(Long l, Long l2) {
        IFansClubService iFansClubService = this.LL;
        if (iFansClubService != null) {
            iFansClubService.de1(l, l2);
        }
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final void i31(String str, boolean z) {
        IFansClubService iFansClubService = this.LL;
        if (iFansClubService != null) {
            iFansClubService.i31(str, z);
        }
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final void n52(String str, String str2) {
        IFansClubService iFansClubService = this.LL;
        if (iFansClubService != null) {
            iFansClubService.n52(str, str2);
        }
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final void rQ0(Context context, DataChannel dataChannel) {
        String string;
        User owner;
        String string2;
        Room roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannel);
        C495520Jby c495520Jby = new C495520Jby("aweme://roma_redirect/?");
        c495520Jby.LIZJ("roma_group_key", "spark_page_super_fan_intro_popup_anchor");
        c495520Jby.LIZJ("spark_page", "super_fan_intro_popup_anchor");
        c495520Jby.LIZJ("roma_page_key", "p");
        c495520Jby.LIZJ("source_page", "live_take_page");
        String str = "";
        if (roomLJJLIIIIJ == null || (string = Long.valueOf(roomLJJLIIIIJ.getId()).toString()) == null) {
            string = "";
        }
        c495520Jby.LIZJ("room_id", string);
        if (roomLJJLIIIIJ != null && (owner = roomLJJLIIIIJ.getOwner()) != null && (string2 = Long.valueOf(owner.getId()).toString()) != null) {
            str = string2;
        }
        c495520Jby.LIZJ("anchor_id", str);
        c495520Jby.LIZJ("is_sub_entry", "1");
        ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(context, UriProtector.parse(c495520Jby.LIZLLL()));
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final boolean Bo1(String str, String str2, String str3) {
        IFansClubService iFansClubService = this.LL;
        if (iFansClubService != null) {
            return iFansClubService.Bo1(str, str2, str3);
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final boolean HO(String str, String str2, String str3) {
        IFansClubService iFansClubService = this.LL;
        if (iFansClubService != null) {
            return iFansClubService.HO(str, str2, str3);
        }
        return true;
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final Map JA(Room room, DataChannel dataChannel, boolean z) {
        return C518180KTw.LIZLLL(room, dataChannel, z);
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final void Mq2(int i, long j, long j2) {
        IFansClubService iFansClubService = this.LL;
        if (iFansClubService != null) {
            iFansClubService.Mq2(i, j, j2);
        }
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final void Pf0(long j, AwS135S0110000_17 awS135S0110000_17, AFwS205S0000000_17 aFwS205S0000000_17) {
        IFansClubService iFansClubService = this.LL;
        if (iFansClubService != null) {
            iFansClubService.Pf0(j, awS135S0110000_17, aFwS205S0000000_17);
        }
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final void eG(long j, long j2, C1095110ebV c1095110ebV) {
        IFansClubService iFansClubService = this.LL;
        if (iFansClubService != null) {
            iFansClubService.eG(j, j2, c1095110ebV);
        }
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final void wq1(long j, C1117530fBf c1117530fBf, AFwS205S0000000_17 aFwS205S0000000_17) {
        IFansClubService iFansClubService = this.LL;
        if (iFansClubService != null) {
            iFansClubService.wq1(j, c1117530fBf, aFwS205S0000000_17);
        }
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final void eS1(DataChannel dataChannel, String str, Map map, boolean z) {
        String str2;
        String str3;
        if (z) {
            if (dataChannel != null && C500260Jjc.LJIIZILJ(dataChannel)) {
                str3 = "livesdk_fans_club_anchor_header_entrance_click";
            } else {
                str3 = "livesdk_fans_club_header_entrance_click";
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ(str3);
            c474500IjALIZ.LJIJJLI(dataChannel);
            C518180KTw.LIZJ(c474500IjALIZ, dataChannel);
            c474500IjALIZ.LJJII(str, "click_position");
            if (map != null) {
                c474500IjALIZ.LJJIIZI(map);
            }
            if (dataChannel != null && C500260Jjc.LJIIZILJ(dataChannel)) {
                c474500IjALIZ.LJJII(String.valueOf(((IRankService) C1161920gLG.LIZJ(IRankService.class)).yy2()), "online_cnt");
            }
            c474500IjALIZ.LIZ();
            return;
        }
        if (dataChannel != null && C500260Jjc.LJIIZILJ(dataChannel)) {
            str2 = "livesdk_fans_club_anchor_header_entrance_show";
        } else {
            str2 = "livesdk_fans_club_header_entrance_show";
        }
        C474500IjA c474500IjALIZ2 = C0IJT.LIZ(str2);
        c474500IjALIZ2.LJIJJLI(dataChannel);
        C518180KTw.LIZJ(c474500IjALIZ2, dataChannel);
        if (map != null) {
            c474500IjALIZ2.LJJIIZI(map);
        }
        c474500IjALIZ2.LJJII(String.valueOf(((IRankService) C1161920gLG.LIZJ(IRankService.class)).yy2()), "online_cnt");
        c474500IjALIZ2.LIZ();
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final InterfaceC1096360edW qj0(boolean z, ViewGroup viewGroup, InterfaceC1095350ebt interfaceC1095350ebt, LifecycleOwner lifecycleOwner, DataChannel dataChannel) {
        IFansClubService iFansClubService = this.LL;
        if (iFansClubService != null) {
            return iFansClubService.qj0(z, viewGroup, interfaceC1095350ebt, lifecycleOwner, dataChannel);
        }
        return null;
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final void wo0(FansLevelInfo fansLevelInfo, long j, long j2, long j3, String str) {
        IFansClubService iFansClubService = this.LL;
        if (iFansClubService != null) {
            iFansClubService.wo0(fansLevelInfo, j, j2, j3, str);
        }
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final boolean z90(ImageModel imageModel, String str, String str2, String str3, String str4) {
        IFansClubService iFansClubService = this.LL;
        if (iFansClubService != null) {
            return iFansClubService.z90(imageModel, str, str2, str3, str4);
        }
        return true;
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final void Ux2(DataChannel dataChannel, String str, long j, long j2, String str2, JSONObject jSONObject) {
        IFansClubService iFansClubService = this.LL;
        if (iFansClubService != null) {
            iFansClubService.Ux2(dataChannel, str, j, j2, str2, jSONObject);
        }
    }
}
