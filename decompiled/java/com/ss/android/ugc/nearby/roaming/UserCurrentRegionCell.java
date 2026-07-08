package com.ss.android.ugc.nearby.roaming;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C1189060h32;
import X.C1201790hNZ;
import X.C1201930hNn;
import X.C1203730hQh;
import X.C1204840hSU;
import X.C1207340hWW;
import X.C1207450hWh;
import X.C1207520hWo;
import X.C1388190mED;
import X.C13LE;
import X.C19719912Dl;
import X.C19EG;
import X.C20642515q3;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C300190Bph;
import X.C384050F3z;
import X.C418440Gaw;
import X.C452080Ho6;
import X.C452501pT;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1205470hTV;
import X.InterfaceC1207030hW1;
import X.InterfaceC1207490hWl;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.ViewTreeObserverOnGlobalLayoutListenerC1151700g4m;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.i18n.location.api.LocationData;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.vcloud.strategy.StrategyCenter;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.tiktok.location_api.service.ILocationService;
import com.ss.android.ugc.tiktok.location_api.service.LocationRegion;
import com.ss.android.ugc.tiktok.location_api.service.api.ILocationServiceForLS;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS105S0110000_18;
import kotlin.jvm.internal.AwS419S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class UserCurrentRegionCell extends PowerCell<C1201790hNZ> implements View.OnClickListener {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZ;
    public TuxTextView LL;
    public LinearLayout LLILLJJLI;
    public final AssemVMLazy LLILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(UserCurrentRegionCell.class, "vm", "getVm()Lcom/ss/android/ugc/nearby/roaming/RegionSearchViewModel;", 0);
        C13LE.LIZ.getClass();
        LLILZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public UserCurrentRegionCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(RegionSearchViewModel.class);
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(c19719912DlLIZ, 2385);
        AFwS256S0000000_18 aFwS256S0000000_18 = AFwS256S0000000_18.get$arr$(StrategyCenter.ENABLE_SMART_SERVICE);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 2370), awS562S0100000_18, AFwS206S0000000_18.get$arr$(635), new AwS562S0100000_18((C03K6) this, 2371), new AwS562S0100000_18((C03K6) this, 2373), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 2375), aFwS256S0000000_18, new AwS562S0100000_18((C03K6) this, 2377), null, new AwS562S0100000_18((C03K6) this, 2378));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS562S0100000_18 awS562S0100000_182 = new AwS562S0100000_18((C03K6) this, 2372);
            AwS562S0100000_18 awS562S0100000_183 = new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 2374);
            AwS562S0100000_18 awS562S0100000_184 = new AwS562S0100000_18(c19719912DlLIZ, 2376);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS419S0200000_18((InterfaceC451590HnJ) obj, awS562S0100000_182, 110));
            AwS562S0100000_18 awS562S0100000_185 = new AwS562S0100000_18(c01gwLIZIZ, 2379);
            AwS562S0100000_18 awS562S0100000_186 = new AwS562S0100000_18(c01gwLIZIZ, 2380);
            AwS562S0100000_18 awS562S0100000_187 = new AwS562S0100000_18(c01gwLIZIZ, 2381);
            AwS562S0100000_18 awS562S0100000_188 = new AwS562S0100000_18(c01gwLIZIZ, 2382);
            AwS562S0100000_18 awS562S0100000_189 = new AwS562S0100000_18(c01gwLIZIZ, 2383);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS562S0100000_184, awS562S0100000_18, new C452080Ho6(), awS562S0100000_185, awS562S0100000_186, awS562S0100000_183, aFwS256S0000000_18, awS562S0100000_187, awS562S0100000_188, awS562S0100000_189);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 2384), awS562S0100000_18, AFwS206S0000000_18.get$arr$(636), new AwS562S0100000_18((C03K6) this, 2386), new AwS562S0100000_18((C03K6) this, 2387), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 2388), aFwS256S0000000_18, new AwS562S0100000_18((C03K6) this, 2389), null, new AwS562S0100000_18((C03K6) this, 2390));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 2391), awS562S0100000_18, AFwS206S0000000_18.get$arr$(637), new AwS562S0100000_18((C03K6) this, 2392), new AwS562S0100000_18((C03K6) this, 2393), new AwS562S0100000_18((C03K6) this, 2394), aFwS256S0000000_18, null, null, new AwS562S0100000_18((C03K6) this, 2395));
        }
        this.LLILLL = assemVMLazy;
    }

    public final boolean I5() {
        if (!C300190Bph.LIZ()) {
            C1207340hWW.LIZ.getClass();
            return C1207340hWW.LJI("poi", "nearby_change_region");
        }
        ILocationServiceForLS iLocationServiceForLS = (ILocationServiceForLS) PluggableExtentionKt.pluggableSpi$default(ILocationServiceForLS.class, false, false, false, 14, null);
        EnumC1205470hTV enumC1205470hTVLIZ = null;
        if (iLocationServiceForLS != null) {
            Context context = this.itemView.getContext();
            C1204840hSU.LIZ.getClass();
            enumC1205470hTVLIZ = iLocationServiceForLS.LIZ(context, C1204840hSU.LIZIZ(), null);
        }
        return enumC1205470hTVLIZ == EnumC1205470hTV.SUCCESS;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.itemView.findViewById(R.id.lt6);
        this.LL = (TuxTextView) this.itemView.findViewById(R.id.zyl);
        LinearLayout linearLayout = (LinearLayout) this.itemView.findViewById(R.id.ncc);
        this.LLILLJJLI = linearLayout;
        if (linearLayout == null) {
            linearLayout = null;
        }
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)));
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
        linearLayout.setBackground(c384050F3z.LIZ(this.itemView.getContext()));
        LinearLayout linearLayout2 = this.LLILLJJLI;
        if (linearLayout2 == null) {
            linearLayout2 = null;
        }
        C786410Ut5.R7(linearLayout2, this);
        if (this.itemView.getMeasuredWidth() <= 0) {
            C786410Ut5.x3(this.itemView.getViewTreeObserver(), new ViewTreeObserverOnGlobalLayoutListenerC1151700g4m(this, 8));
        } else {
            LinearLayout linearLayout3 = this.LLILLJJLI;
            (linearLayout3 != null ? linearLayout3 : null).setMinimumWidth((this.itemView.getMeasuredWidth() - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))) / 2);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1201790hNZ c1201790hNZ = (C1201790hNZ) interfaceC1891350zJl;
        super.onBindItemView(c1201790hNZ);
        TuxTextView tuxTextView = null;
        if (!((InterfaceC1207490hWl) ServiceManager.get().getService(ILocationService.class)).LJII(0, this.itemView.getContext()) && I5()) {
            TuxTextView tuxTextView2 = this.LL;
            if (tuxTextView2 != null) {
                tuxTextView = tuxTextView2;
            }
            tuxTextView.setText(C20642515q3.LJI(2131837916));
            return;
        }
        LocationRegion locationRegion = c1201790hNZ.LL;
        if (locationRegion == null) {
            return;
        }
        TuxTextView tuxTextView3 = this.LL;
        if (tuxTextView3 != null) {
            tuxTextView = tuxTextView3;
        }
        String name = locationRegion.getName();
        if (name == null && (name = locationRegion.getParentName()) == null) {
            name = "";
        }
        tuxTextView.setText(name);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        LocationRegion locationRegion;
        String str;
        if (!((InterfaceC1207490hWl) ServiceManager.get().getService(ILocationService.class)).LJII(0, this.itemView.getContext()) && I5()) {
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(this.itemView.getContext());
            if (c19egLIZIZ == null) {
                return;
            }
            C1207450hWh c1207450hWh = C1207450hWh.LIZ;
            C1204840hSU.LIZ.getClass();
            TokenCert tokenCertLIZIZ = C1204840hSU.LIZIZ();
            Fragment fragmentLJIIJ = C1189060h32.LJIIJ(this);
            C1207520hWo c1207520hWo = new C1207520hWo("change_region", null, null, null, false, false, null, null, null, 510);
            InterfaceC1207030hW1 interfaceC1207030hW1 = new InterfaceC1207030hW1() { // from class: X.0hNo
                @Override // X.InterfaceC1207030hW1
                public final void LIZIZ(int i, String str2) {
                }

                @Override // X.InterfaceC1207030hW1
                public final void LIZJ(int i) {
                }

                @Override // X.InterfaceC1207030hW1
                public final void LIZ() {
                    CertProviderManagerKt.findCert("bpea-nearby_roaming_current_region_try_location", 1476395008, "svfi");
                    try {
                        LIZLLL();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }

                public final void LIZLLL() {
                    LocationRegion locationRegion2;
                    String parentName;
                    C1201790hNZ item = this.LIZ.getItem();
                    if (item != null) {
                        TuxTextView tuxTextView = this.LIZ.LL;
                        if (tuxTextView == null) {
                            tuxTextView = null;
                        }
                        LocationRegion locationRegion3 = item.LL;
                        if ((locationRegion3 == null || (parentName = locationRegion3.getName()) == null) && ((locationRegion2 = item.LL) == null || (parentName = locationRegion2.getParentName()) == null)) {
                            parentName = "";
                        }
                        tuxTextView.setText(parentName);
                    }
                    C1207450hWh c1207450hWh2 = C1207450hWh.LIZ;
                    TokenCert tokenCertWith = TokenCert.Companion.with("bpea-nearby_roaming_current_region_try_location");
                    tokenCertWith.auth("svfi");
                    c1207450hWh2.LJIIL("poi", "nearby_change_region", tokenCertWith, null, new InterfaceC687820QyS() { // from class: X.0hNp
                        @Override // X.InterfaceC687820QyS
                        public final void LIZ(LocationData locationData) {
                        }

                        @Override // X.InterfaceC687820QyS
                        public final void onError(int i, String str2) {
                        }
                    }, -1L);
                }
            };
            c1207450hWh.getClass();
            C1207450hWh.LJJIFFI("poi", "nearby_change_region", tokenCertLIZIZ, c19egLIZIZ, fragmentLJIIJ, c1207520hWo, interfaceC1207030hW1);
            return;
        }
        C1201790hNZ item = getItem();
        if (item != null && (locationRegion = item.LL) != null) {
            if (C1388190mED.LIZIZ(this.itemView.getContext()) != null) {
                C1203730hQh.LIZ.getClass();
                RoamingLocationInfo roamingLocationInfoLIZ = C1203730hQh.LIZ();
                C1201930hNn c1201930hNn = C1201930hNn.LIZ;
                String name = locationRegion.getName();
                if (name == null && (name = locationRegion.getParentName()) == null) {
                    name = "";
                }
                if (roamingLocationInfoLIZ != null) {
                    str = roamingLocationInfoLIZ.manualRegionName;
                } else {
                    str = null;
                }
                c1201930hNn.getClass();
                C1201930hNn.LIZ("current_region", name, str);
            }
            AssemVMLazy assemVMLazy = this.LLILLL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZ;
            assemVMLazy.getValue().setState(new AwS105S0110000_18(locationRegion, true, 0));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.dsh, viewGroup, false);
    }
}
