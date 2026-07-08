package kotlin.jvm.internal;

import X.AbstractC738140SxQ;
import X.C09AY;
import X.C0HA4;
import X.C1389880mGw;
import X.C1397605dW;
import X.C1558520qew;
import X.C1578630rBN;
import X.C21415918rV;
import X.C2188811AlT;
import X.C2341109Fh;
import X.C675430QeT;
import X.C678130Qip;
import X.C678240Qj0;
import X.C687030QxB;
import X.C724240Sb0;
import X.C786410Ut5;
import X.EnumC687210QxT;
import X.InterfaceC1565950qqv;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import Y.ALAdapterS7S0100000_10;
import android.animation.ObjectAnimator;
import android.graphics.Rect;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.ecommerce.search.page.mix.IMixVSearchAbility;
import com.ss.android.ugc.aweme.ecommerce.search.page.mix.MixFloatingLayerAssem;
import com.ss.android.ugc.aweme.ecommerce.search.page.mix.MixShopContainerVerticalAssem;
import com.ss.android.ugc.aweme.ecommerce.search.pendant.coin.model.EcSearchCoinData;
import com.ss.android.ugc.aweme.ecommerce.search.pendant.coin.ui.EcSearchCoinAssem;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.horizontallist.ui.SearchOverScrollTrailAssem;
import com.ss.android.ugc.aweme.search.ecommerce.viewmodel.SearchContainerHeaderVM;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class AwS128S0110000_10 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public boolean z1;

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
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS128S0110000_10 awS128S0110000_10) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MixFloatingLayer: banner getGlobalVisibleRect=");
        sbLIZ.append(awS128S0110000_10.z1);
        sbLIZ.append(", rect=");
        sbLIZ.append((Rect) awS128S0110000_10.l0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS128S0110000_10 awS128S0110000_10) {
        String str;
        int paddingTop;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("result=");
        String str2 = "ProtectedByOuterPadding";
        if (!awS128S0110000_10.z1) {
            str = "ProtectedByOuterPadding";
        } else {
            str = "InnerSparkPaddingForOverlay";
        }
        sbLIZ.append(str);
        sbLIZ.append(" sparkPaddingTop=");
        C675430QeT c675430QeT = ((MixShopContainerVerticalAssem) awS128S0110000_10.l0).LLLLIIL;
        int iVQ2 = 0;
        if (c675430QeT != null && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = c675430QeT.LJIILIIL) != null) {
            paddingTop = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getPaddingTop();
        } else {
            paddingTop = 0;
        }
        sbLIZ.append(paddingTop);
        sbLIZ.append(" headerHeight=");
        SearchContainerHeaderVM searchContainerHeaderVM = ((MixShopContainerVerticalAssem) awS128S0110000_10.l0).LLLIIL;
        if (searchContainerHeaderVM != null) {
            iVQ2 = searchContainerHeaderVM.vQ2();
        }
        sbLIZ.append(iVQ2);
        sbLIZ.append(" source=MixShopContainer scene=SparkPadding canCollapse=");
        sbLIZ.append(awS128S0110000_10.z1);
        sbLIZ.append(" layoutMode=");
        if (awS128S0110000_10.z1) {
            str2 = "InnerPaddingForOverlay";
        }
        sbLIZ.append(str2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$2(AwS128S0110000_10 awS128S0110000_10) {
        boolean z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[LynxBind] check=cell_bound_schema_and_raw_data_ready item=");
        sbLIZ.append(C1397605dW.LIZLLL((C678240Qj0) awS128S0110000_10.l0));
        sbLIZ.append(" intent2update=");
        sbLIZ.append(awS128S0110000_10.z1);
        sbLIZ.append(" schemaEmpty=");
        if (((C678240Qj0) awS128S0110000_10.l0).LJII.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        sbLIZ.append(" rawDataLength=");
        sbLIZ.append(((C678240Qj0) awS128S0110000_10.l0).LJIIIIZZ.length());
        sbLIZ.append(" estimatedHeight=");
        sbLIZ.append(((C678240Qj0) awS128S0110000_10.l0).LJIIIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$3(AwS128S0110000_10 awS128S0110000_10) {
        C21415918rV c21415918rV = ((SearchOverScrollTrailAssem) awS128S0110000_10.l0).LLJJJJLIIL;
        if (c21415918rV != null) {
            c21415918rV.setEnable(awS128S0110000_10.z1);
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$4(AwS128S0110000_10 awS128S0110000_10) {
        if (awS128S0110000_10.z1 && C1578630rBN.LJIIIZ((AbstractC738140SxQ) ((InterfaceC1565950qqv) awS128S0110000_10.l0))) {
            return null;
        }
        return C1558520qew.LIZ(C1558520qew.LJIIL((AbstractC738140SxQ) ((InterfaceC1565950qqv) awS128S0110000_10.l0)), IFeedPanelPlatformAbility.class, null);
    }

    public static /* bridge */ /* synthetic */ Object invoke$5(AwS128S0110000_10 awS128S0110000_10) {
        if (awS128S0110000_10.z1 && C1578630rBN.LJIIIZ((AbstractC738140SxQ) ((InterfaceC1565950qqv) awS128S0110000_10.l0))) {
            return null;
        }
        return C1558520qew.LIZ(C1558520qew.LJIIL((AbstractC738140SxQ) ((InterfaceC1565950qqv) awS128S0110000_10.l0)), IFeedPanelPlatformAbility.class, null);
    }

    public static final Object invoke$6(AwS128S0110000_10 awS128S0110000_10) {
        String str;
        int paddingTop;
        Boolean boolValueOf;
        C0HA4 c0ha4;
        C0HA4 c0ha42;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("result=");
        String str2 = "InnerPaddingForOverlay";
        if (awS128S0110000_10.z1) {
            str = "InnerPaddingForOverlay";
        } else {
            str = "ProtectedByOuterPadding";
        }
        sbLIZ.append(str);
        sbLIZ.append(" listPaddingTop=");
        C678130Qip c678130Qip = ((MixShopContainerVerticalAssem) awS128S0110000_10.l0).LLLFF;
        int iVQ2 = 0;
        if (c678130Qip != null && (c0ha42 = c678130Qip.LJI) != null) {
            paddingTop = c0ha42.getPaddingTop();
        } else {
            paddingTop = 0;
        }
        sbLIZ.append(paddingTop);
        sbLIZ.append(" headerHeight=");
        SearchContainerHeaderVM searchContainerHeaderVM = ((MixShopContainerVerticalAssem) awS128S0110000_10.l0).LLLIIL;
        if (searchContainerHeaderVM != null) {
            iVQ2 = searchContainerHeaderVM.vQ2();
        }
        sbLIZ.append(iVQ2);
        sbLIZ.append(" source=MixShopContainer scene=ResetListPadding canCollapse=");
        sbLIZ.append(awS128S0110000_10.z1);
        sbLIZ.append(" clipToPadding=");
        C678130Qip c678130Qip2 = ((MixShopContainerVerticalAssem) awS128S0110000_10.l0).LLLFF;
        if (c678130Qip2 != null && (c0ha4 = c678130Qip2.LJI) != null) {
            boolValueOf = Boolean.valueOf(c0ha4.getClipToPadding());
        } else {
            boolValueOf = null;
        }
        sbLIZ.append(boolValueOf);
        sbLIZ.append(" layoutMode=");
        if (!awS128S0110000_10.z1) {
            str2 = "ProtectedByOuterPadding";
        }
        sbLIZ.append(str2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$7(AwS128S0110000_10 awS128S0110000_10) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MixFloatingLayer: Data change check: oldHasVoucherBannerData=");
        sbLIZ.append(awS128S0110000_10.z1);
        sbLIZ.append(", hasVoucherBannerData=");
        sbLIZ.append(((MixFloatingLayerAssem) awS128S0110000_10.l0).LLJJIJIIJIL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$8(AwS128S0110000_10 awS128S0110000_10) {
        String str;
        int paddingTop;
        Boolean boolValueOf;
        C0HA4 c0ha4;
        C0HA4 c0ha42;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("result=");
        String str2 = "InnerPaddingForOverlay";
        if (awS128S0110000_10.z1) {
            str = "InnerPaddingForOverlay";
        } else {
            str = "ProtectedByOuterPadding";
        }
        sbLIZ.append(str);
        sbLIZ.append(" listPaddingTop=");
        C678130Qip c678130Qip = ((MixShopContainerVerticalAssem) awS128S0110000_10.l0).LLLFF;
        int iVQ2 = 0;
        if (c678130Qip != null && (c0ha42 = c678130Qip.LJI) != null) {
            paddingTop = c0ha42.getPaddingTop();
        } else {
            paddingTop = 0;
        }
        sbLIZ.append(paddingTop);
        sbLIZ.append(" headerHeight=");
        SearchContainerHeaderVM searchContainerHeaderVM = ((MixShopContainerVerticalAssem) awS128S0110000_10.l0).LLLIIL;
        if (searchContainerHeaderVM != null) {
            iVQ2 = searchContainerHeaderVM.vQ2();
        }
        sbLIZ.append(iVQ2);
        sbLIZ.append(" source=MixShopContainer scene=ListPadding canCollapse=");
        sbLIZ.append(awS128S0110000_10.z1);
        sbLIZ.append(" clipToPadding=");
        C678130Qip c678130Qip2 = ((MixShopContainerVerticalAssem) awS128S0110000_10.l0).LLLFF;
        if (c678130Qip2 != null && (c0ha4 = c678130Qip2.LJI) != null) {
            boolValueOf = Boolean.valueOf(c0ha4.getClipToPadding());
        } else {
            boolValueOf = null;
        }
        sbLIZ.append(boolValueOf);
        sbLIZ.append(" layoutMode=");
        if (!awS128S0110000_10.z1) {
            str2 = "ProtectedByOuterPadding";
        }
        sbLIZ.append(str2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$9(AwS128S0110000_10 awS128S0110000_10) throws JSONException {
        String str;
        C2341109Fh.LIZ.getClass();
        C2341109Fh.LIZ("coin task complete in main thread");
        C687030QxB c687030QxB = ((EcSearchCoinAssem) awS128S0110000_10.l0).LLJJIJI;
        if (c687030QxB != null) {
            if (c687030QxB.LLILZIL == null) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c687030QxB, "translationX", 0.0f, c687030QxB.getWidth());
                objectAnimatorOfFloat.setDuration(300L);
                objectAnimatorOfFloat.addListener(new ALAdapterS7S0100000_10(c687030QxB, 9));
                c687030QxB.LLILZIL = objectAnimatorOfFloat;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("dismissWithAnim currentThread: ");
            sbLIZ.append(C786410Ut5.u3());
            C2341109Fh.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            ObjectAnimator objectAnimator = c687030QxB.LLILZIL;
            if (objectAnimator != null) {
                C786410Ut5.Pd(objectAnimator);
            }
        }
        EcSearchCoinAssem ecSearchCoinAssem = (EcSearchCoinAssem) awS128S0110000_10.l0;
        boolean z = awS128S0110000_10.z1;
        ecSearchCoinAssem.getClass();
        if (z) {
            Fragment fragmentLJI = C724240Sb0.LJI(ecSearchCoinAssem);
            if (fragmentLJI != null) {
                C1389880mGw c1389880mGw = new C1389880mGw(fragmentLJI);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                EcSearchCoinData ecSearchCoinData = ecSearchCoinAssem.LLJJJ;
                if (ecSearchCoinData != null) {
                    str = ecSearchCoinData.coinsCount;
                } else {
                    str = null;
                }
                sbLIZ2.append(str);
                sbLIZ2.append(" points reward");
                c1389880mGw.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ2));
                c1389880mGw.LJ(R.raw.icon_color_coin);
                c1389880mGw.LIZ(true);
                c1389880mGw.LJIIJ();
            }
        } else {
            Fragment fragmentLJI2 = C724240Sb0.LJI(ecSearchCoinAssem);
            if (fragmentLJI2 != null) {
                C1389880mGw c1389880mGw2 = new C1389880mGw(fragmentLJI2);
                c1389880mGw2.LJIIIZ("Mission failed, please check your connection.");
                c1389880mGw2.LJIIJ();
            }
        }
        IEventCenter iEventCenter = (IEventCenter) ServiceManager.get().getService(IEventCenter.class);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("is_success", z);
        iEventCenter.LIZ("ec_search_coin_task_finish_toast_show", C786410Ut5.J3(jSONObject));
        IMixVSearchAbility iMixVSearchAbility = (IMixVSearchAbility) C1558520qew.LIZ(C1558520qew.LJIIL((EcSearchCoinAssem) awS128S0110000_10.l0), IMixVSearchAbility.class, null);
        if (iMixVSearchAbility != null) {
            iMixVSearchAbility.jP2(EnumC687210QxT.COMPLETE.getValue());
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS128S0110000_10(C678240Qj0 c678240Qj0, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = c678240Qj0;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS128S0110000_10(Rect rect, boolean z, int i) {
        super(0);
        this.$t = i;
        this.z1 = z;
        this.l0 = rect;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS128S0110000_10(EcSearchCoinAssem ecSearchCoinAssem, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = ecSearchCoinAssem;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS128S0110000_10(SearchOverScrollTrailAssem searchOverScrollTrailAssem, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = searchOverScrollTrailAssem;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS128S0110000_10(boolean z, InterfaceC1565950qqv interfaceC1565950qqv, int i) {
        super(0);
        this.$t = i;
        this.z1 = z;
        this.l0 = interfaceC1565950qqv;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS128S0110000_10(boolean z, MixFloatingLayerAssem mixFloatingLayerAssem, int i) {
        super(0);
        this.$t = i;
        this.z1 = z;
        this.l0 = mixFloatingLayerAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS128S0110000_10(boolean z, MixShopContainerVerticalAssem mixShopContainerVerticalAssem, int i) {
        super(0);
        this.$t = i;
        this.z1 = z;
        this.l0 = mixShopContainerVerticalAssem;
    }
}
