package kotlin.jvm.internal;

import X.C09AY;
import X.C13LP;
import X.C1DEV;
import X.C20612915lH;
import X.C2215941Bo8;
import X.C2215961BoA;
import X.EnumC2246361Cw6;
import X.InterfaceC1356670lPN;
import X.InterfaceC1631620sYq;
import com.bytedance.assem.arch.core.UIAssem;
import com.ss.android.ugc.aweme.commercialize.preview.manager.AdsPreviewStateManager;
import com.ss.android.ugc.profile.business.ur.ui.ProfileEditBioAssem;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes35.dex */
public class AwS683S0100000_34 extends C09AY implements InterfaceC1631620sYq {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            case 2:
                return invoke$2(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS683S0100000_34(C1DEV c1dev, int i) {
        super(3);
        this.$t = i;
        this.l0 = c1dev;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS683S0100000_34(AdsPreviewStateManager adsPreviewStateManager, int i) {
        super(3);
        this.$t = i;
        this.l0 = adsPreviewStateManager;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS683S0100000_34(ProfileEditBioAssem profileEditBioAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = profileEditBioAssem;
    }

    public static final Object invoke$0(AwS683S0100000_34 awS683S0100000_34, Object obj, Object obj2, Object obj3) {
        String str = (String) obj;
        Integer num = (Integer) obj2;
        List<String> list = (List) obj3;
        if (num != null && num.intValue() == 0) {
            ((AdsPreviewStateManager) awS683S0100000_34.l0).LIZLLL(C2215961BoA.LIZ);
            if (list != null && (!list.isEmpty())) {
                AdsPreviewStateManager adsPreviewStateManager = (AdsPreviewStateManager) awS683S0100000_34.l0;
                adsPreviewStateManager.getClass();
                AdsPreviewStateManager.LLJILJIL = list;
                adsPreviewStateManager.LLIZLLLIL.storeLong("ads_on_demand_preview_timestamp", System.currentTimeMillis());
                adsPreviewStateManager.LLIZLLLIL.storeString("ads_on_demand_preview_cid_v2", C13LP.LJJLIIIJ(list, "|", null, null, 0, null, null, 62));
            }
        } else {
            AdsPreviewStateManager adsPreviewStateManager2 = (AdsPreviewStateManager) awS683S0100000_34.l0;
            adsPreviewStateManager2.LLJ = str;
            adsPreviewStateManager2.LIZLLL(C2215941Bo8.LIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS683S0100000_34 awS683S0100000_34, Object obj, Object obj2, Object obj3) {
        ProfileEditBioAssem profileEditBioAssem;
        InterfaceC1356670lPN interfaceC1356670lPN;
        ProfileEditBioAssem profileEditBioAssem2;
        InterfaceC1356670lPN interfaceC1356670lPN2;
        String str = (String) obj3;
        if (!C20612915lH.LIZIZ.LJIIIIZZ().LJFF(new AwS581S0100000_2((UIAssem) obj, 359))) {
            if (str != null) {
                InterfaceC1356670lPN interfaceC1356670lPN3 = ((ProfileEditBioAssem) awS683S0100000_34.l0).LLJJIJIL;
                if (interfaceC1356670lPN3 != null && interfaceC1356670lPN3.Be() && (interfaceC1356670lPN2 = (profileEditBioAssem2 = (ProfileEditBioAssem) awS683S0100000_34.l0).LLJJIJIL) != null) {
                    interfaceC1356670lPN2.Ml(str, null, profileEditBioAssem2.LLJJJJ);
                }
            } else if (obj2 == EnumC2246361Cw6.NORMAL && (interfaceC1356670lPN = (profileEditBioAssem = (ProfileEditBioAssem) awS683S0100000_34.l0).LLJJIJIL) != null) {
                interfaceC1356670lPN.Ml("", null, profileEditBioAssem.LLJJJJ);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS683S0100000_34 awS683S0100000_34, Object obj, Object obj2, Object obj3) {
        return new AwS400S0200000_34((C1DEV) awS683S0100000_34.l0, obj2, 48);
    }
}
