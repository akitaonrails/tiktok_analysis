package kotlin.jvm.internal;

import X.C09AY;
import X.C1099390eiP;
import X.C1123380fL6;
import X.C1125360fOI;
import X.C1127390fRZ;
import X.C1127440fRe;
import X.C1128320fT4;
import X.C1161920gLG;
import X.C150400hq;
import X.C19322110iZ;
import X.C2188811AlT;
import X.C464790IKn;
import X.C467770IVz;
import X.C495520Jby;
import X.C520010KaN;
import X.InterfaceC1128440fTG;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.banner.switchcolor.CountryListDialogFragment;
import com.bytedance.android.livesdk.gift.model.GiftColorInfo;
import com.bytedance.android.livesdk.model.BorderInfo;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.RandomGiftPanelBanner;
import com.bytedance.android.livesdk.widgets.giftwidget.viewmodel.GiftLeafRootViewModel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes18.dex */
public class AwS20S0300100_17 extends C09AY implements Function0 {
    public final int $t;
    public long j3;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS20S0300100_17 awS20S0300100_17) {
        ((C1099390eiP) awS20S0300100_17.l0).LJIILIIL.invoke();
        C1099390eiP c1099390eiP = (C1099390eiP) awS20S0300100_17.l0;
        long j = awS20S0300100_17.j3;
        BorderInfo borderInfo = (BorderInfo) awS20S0300100_17.l1;
        BorderInfo borderInfo2 = (BorderInfo) awS20S0300100_17.l2;
        c1099390eiP.getClass();
        C1099390eiP.LIZIZ(j, borderInfo, borderInfo2, true);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS20S0300100_17 awS20S0300100_17) {
        Fragment fragment;
        FragmentManager fragmentManagerLJJI;
        C1128320fT4.LIZIZ(Long.valueOf(awS20S0300100_17.j3), Long.valueOf(((C1127390fRZ) awS20S0300100_17.l0).LLJJIJI));
        final C1127390fRZ c1127390fRZ = (C1127390fRZ) awS20S0300100_17.l0;
        final long j = awS20S0300100_17.j3;
        final List list = (List) awS20S0300100_17.l1;
        final Gift.ColorPickerInfo colorPickerInfo = (Gift.ColorPickerInfo) awS20S0300100_17.l2;
        long j2 = c1127390fRZ.LLJJIJI;
        if (colorPickerInfo != null && (fragment = c1127390fRZ.LLJ) != null && (fragmentManagerLJJI = C520010KaN.LJJI(fragment, false)) != null && !C464790IKn.LIZ.LIZIZ(c1127390fRZ.LLJJIII)) {
            CountryListDialogFragment countryListDialogFragment = new CountryListDialogFragment();
            InterfaceC1128440fTG interfaceC1128440fTG = new InterfaceC1128440fTG() { // from class: X.0fT3
                @Override // X.InterfaceC1128440fTG
                public final void LIZ(GiftColorInfo giftColorInfo) {
                    List<GiftColorInfo> list2 = list;
                    GiftColorInfo giftColorInfoLIZJ = C1128300fT2.LIZJ(giftColorInfo.colorId.longValue(), colorPickerInfo, list2);
                    if (giftColorInfoLIZJ != null) {
                        giftColorInfo = giftColorInfoLIZJ;
                    }
                    c1127390fRZ.LLJJIJI = giftColorInfo.colorId.longValue();
                    c1127390fRZ.LJJJJLI().LIZ = giftColorInfo;
                    GiftColorInfo giftColorInfoLJII = C1128300fT2.LJII(j, colorPickerInfo, list);
                    C1127390fRZ c1127390fRZ2 = c1127390fRZ;
                    C1128340fT6 c1128340fT6 = c1127390fRZ2.LLJJ;
                    if (c1128340fT6 != null) {
                        C1127870fSL c1127870fSLLJJJJLI = c1127390fRZ2.LJJJJLI();
                        List<GiftColorInfo> list3 = list;
                        c1127870fSLLJJJJLI.getClass();
                        c1128340fT6.e0(new C1128330fT5(C1128300fT2.LJ(list3, giftColorInfoLJII, c1127870fSLLJJJJLI.LIZ), giftColorInfo.colorId.longValue(), j));
                    }
                    C784440Upu.LIZ().LIZIZ(new C1127980fSW(giftColorInfo.colorId, true));
                    C1128320fT4.LIZ(Integer.valueOf(C1128300fT2.LJIIL(list, giftColorInfoLJII, giftColorInfo)), C1128300fT2.LJFF(giftColorInfo, giftColorInfoLJII, c1127390fRZ.LJJJJLI().LIZ), Long.valueOf(j), giftColorInfo.colorId);
                }
            };
            countryListDialogFragment.LLJZIJLIL = j;
            countryListDialogFragment.LLL = colorPickerInfo;
            countryListDialogFragment.LLLF = j2;
            countryListDialogFragment.LLJZ = interfaceC1128440fTG;
            c1127390fRZ.LLJJIII = C19322110iZ.LJFF(fragmentManagerLJJI, countryListDialogFragment, "live_gift_color_country_picker_sheet", null, C467770IVz.LIZ((IHostPad) C1161920gLG.LIZJ(IHostPad.class)));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS20S0300100_17 awS20S0300100_17) {
        Long lValueOf;
        DataChannel dataChannel;
        Room room;
        if (!C1125360fOI.LIZIZ(((C1127440fRe) awS20S0300100_17.l0).LJI, true)) {
            if (C1123380fL6.LIZIZ()) {
                C1123380fL6.LIZJ(301, false);
            }
            C150400hq.LIZIZ(((C1127440fRe) awS20S0300100_17.l0).LJI);
            GiftLeafRootViewModel giftLeafRootViewModelLJJJJJL = ((C1127390fRZ) awS20S0300100_17.l1).LJJJJJL();
            Long lValueOf2 = null;
            if (giftLeafRootViewModelLJJJJJL != null && (dataChannel = giftLeafRootViewModelLJJJJJL.LL) != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
                lValueOf = Long.valueOf(room.getOwnerUserId());
                lValueOf2 = Long.valueOf(room.getId());
            } else {
                lValueOf = null;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(((RandomGiftPanelBanner) awS20S0300100_17.l2).schemaUrl);
            sbLIZ.append("&gift_id=");
            sbLIZ.append(awS20S0300100_17.j3);
            sbLIZ.append("&anchor_id=");
            sbLIZ.append(lValueOf);
            sbLIZ.append("&room_id=");
            sbLIZ.append(lValueOf2);
            ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(((C1127390fRZ) awS20S0300100_17.l1).LL, UriProtector.parse(new C495520Jby(C2188811AlT.LIZIZ(sbLIZ)).LIZLLL()));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS20S0300100_17(long j, C1127390fRZ c1127390fRZ, Gift.ColorPickerInfo colorPickerInfo, List list, int i) {
        super(0);
        this.$t = i;
        this.j3 = j;
        this.l0 = c1127390fRZ;
        this.l1 = list;
        this.l2 = colorPickerInfo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS20S0300100_17(C1099390eiP c1099390eiP, long j, BorderInfo borderInfo, BorderInfo borderInfo2, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1099390eiP;
        this.j3 = j;
        this.l1 = borderInfo;
        this.l2 = borderInfo2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS20S0300100_17(C1127440fRe c1127440fRe, C1127390fRZ c1127390fRZ, RandomGiftPanelBanner randomGiftPanelBanner, long j, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1127440fRe;
        this.l1 = c1127390fRZ;
        this.l2 = randomGiftPanelBanner;
        this.j3 = j;
    }
}
