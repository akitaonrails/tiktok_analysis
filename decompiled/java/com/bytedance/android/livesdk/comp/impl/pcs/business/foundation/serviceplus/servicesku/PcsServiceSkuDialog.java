package com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicesku;

import X.AbstractC1822440xWc;
import X.C019F;
import X.C01D1;
import X.C03H5;
import X.C09JN;
import X.C0ZP4;
import X.C1158610gFv;
import X.C1161920gLG;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1324720kZq;
import X.C1361400lX0;
import X.C13LE;
import X.C1554960qZC;
import X.C1555840qac;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1622206Wu;
import X.C1701940uOG;
import X.C1770850wBP;
import X.C1782130wTb;
import X.C1791050whz;
import X.C1791060wi0;
import X.C1791070wi1;
import X.C1791080wi2;
import X.C1791090wi3;
import X.C1791100wi4;
import X.C1791110wi5;
import X.C1791120wi6;
import X.C1819580xS0;
import X.C1819590xS1;
import X.C1821430xUz;
import X.C1822010xVv;
import X.C1823280xXy;
import X.C1911200zpm;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C20484615Do;
import X.C2217381BqS;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C497740JfY;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C930940aKi;
import X.C987103tV;
import X.EnumC1785280wYg;
import X.EnumC1822480xWg;
import X.InterfaceC0148002o;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724530SbT;
import X.InterfaceC724760Sbq;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.LiveSheetHostFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.livesdk.comp.api.pcs.data.ability.PcsDialogAbility;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.common.assem.infoheader.PcsServiceInfoHeaderVM;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicesku.viewmodel.PcsServiceSkuVM;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class PcsServiceSkuDialog extends LiveSheetFragment implements InterfaceC724530SbT, PcsDialogAbility {
    public static final C1821430xUz LLLII;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIIII;
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZz8wO2suPDw6JiA/OmE1HELIOSJzAiLS4nISoiZzw2OjMlKiojJDA/Zzw2OjMlKiogIzBiGSwgGyA+PyYwLRYnPAs6KSkjLg==";
    public final AssemVMLazy LLJLLL;
    public final AssemVMLazy LLJZ;
    public C1822010xVv LLJZIJLIL;
    public C1324720kZq LLL;
    public Drawable LLLF;
    public Drawable LLLFF;
    public boolean LLLFFI;
    public View LLLFZ;
    public View LLLI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PcsServiceSkuDialog.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/foundation/serviceplus/servicesku/viewmodel/PcsServiceSkuVM;", 0);
        C13LE.LIZ.getClass();
        LLLIIII = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(PcsServiceSkuDialog.class, "headerVM", "getHeaderVM()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/foundation/serviceplus/common/assem/infoheader/PcsServiceInfoHeaderVM;", 0)};
        LLLII = new C1821430xUz();
    }

    @Override // com.bytedance.android.livesdk.comp.api.pcs.data.ability.PcsDialogAbility
    public final void cj0() {
        close(1);
    }

    @Override // com.bytedance.android.livesdk.comp.api.pcs.data.ability.PcsDialogAbility
    public final void dY1() {
    }

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        C1558520qew.LJIIJJI(C1558360qeg.LJFF(this, null), PcsDialogAbility.class, null);
        super.onDestroy();
    }

    public PcsServiceSkuDialog() {
        AssemVMLazy assemVMLazy;
        boolean z;
        boolean z2;
        AssemVMLazy assemVMLazy2;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PcsServiceSkuVM.class);
        C1791050whz c1791050whz = new C1791050whz(c19719912DlLIZ);
        C1819580xS0 c1819580xS0 = new C1819580xS0();
        C01D1 c01d1 = C01D1.LIZ;
        if (Intrinsics.LJFF(interfaceC724760Sbq, c01d1)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), c1791050whz, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new C1791080wi2(this), c1819580xS0, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
            z2 = true;
            z = false;
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c1791050whz, new C1791090wi3(this), c1819580xS0, null, null, null);
            z = false;
            z2 = true;
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            z = false;
            z2 = true;
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), c1791050whz, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new C1791100wi4(this), c1819580xS0, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJLLL = assemVMLazy;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(PcsServiceInfoHeaderVM.class);
        C1791060wi0 c1791060wi0 = new C1791060wi0(c19719912DlLIZ2);
        C1819590xS1 c1819590xS1 = new C1819590xS1();
        if (Intrinsics.LJFF(interfaceC724760Sbq, c01d1)) {
            assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c1791060wi0, new C452070Ho5(), new C1622206Wu(this, z2), new C338490DOt(this, z2), new C1791110wi5(this), c1819590xS1, new C451460Hn6(this, z2), new C451620HnM(this, z2), new C987103tV(this, z2));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy2 = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c1791060wi0, new C1791120wi6(this), c1819590xS1, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c1791060wi0, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new C1791070wi1(this), c1819590xS1, new C451460Hn6(this, z), new C451620HnM(this, z), new C987103tV(this, z));
        }
        this.LLJZ = assemVMLazy2;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final void sl() {
        Fragment fragmentLJJJJZ = getChildFragmentManager().LJJJJZ(R.id.vga);
        if (fragmentLJJJJZ != null && !fragmentLJJJJZ.isRemoving() && !fragmentLJJJJZ.isDetached() && fragmentLJJJJZ.getView() != null && fragmentLJJJJZ.getFragmentManager() != null) {
            if (1 != 0) {
                C1822010xVv c1822010xVv = this.LLJZIJLIL;
                if ((c1822010xVv != null ? c1822010xVv.LIZ : null) == EnumC1785280wYg.DM && fragmentLJJJJZ != null && ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).onBackPressByHomeBackPressListener(fragmentLJJJJZ).booleanValue()) {
                    return;
                }
            }
        }
        C1911200zpm.LIZIZ(this);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final void LJJJI(float f) {
        boolean z;
        Drawable drawable;
        if (f > 0.5f) {
            z = true;
        } else {
            z = false;
        }
        if (z != this.LLLFFI) {
            this.LLLFFI = z;
            C1324720kZq c1324720kZq = this.LLL;
            if (c1324720kZq != null) {
                if (z) {
                    drawable = this.LLLFF;
                } else {
                    drawable = this.LLLF;
                }
                c1324720kZq.setImageDrawable(drawable);
            }
        }
    }

    @Override // com.bytedance.android.livesdk.comp.api.pcs.data.ability.PcsDialogAbility
    public final void MW0(boolean z) {
        rS(z);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        C1822010xVv c1822010xVv = this.LLJZIJLIL;
        int i = 1;
        if (c1822010xVv != null) {
            int i2 = C1782130wTb.LIZ[c1822010xVv.LIZ.ordinal()];
            if (i2 == 1 || i2 == 2) {
                i = 7;
            }
        }
        sheetOptions.LIZ(i, null);
        sheetOptions.cornerRadius = (int) C497740JfY.LIZIZ(28.0f);
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String secUid;
        User owner;
        String string;
        C1822010xVv c1822010xVv;
        Long l;
        String string2;
        C1822010xVv c1822010xVv2;
        super.onCreate(bundle);
        C1822010xVv c1822010xVv3 = this.LLJZIJLIL;
        if (c1822010xVv3 != null) {
            C1555840qac c1555840qac = new C1555840qac(c1822010xVv3);
            C1554960qZC.LIZ(C1558360qeg.LJFF(this, null), c1555840qac, C1555840qac.class, "source_default_key");
            AssemVMLazy assemVMLazy = this.LLJLLL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLIIII;
            final PcsServiceSkuVM pcsServiceSkuVM = (PcsServiceSkuVM) assemVMLazy.getValue();
            pcsServiceSkuVM.LL = c1555840qac;
            if (!pcsServiceSkuVM.wQ2()) {
                pcsServiceSkuVM.setState(new C1158610gFv());
            } else {
                Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
                C1555840qac c1555840qac2 = pcsServiceSkuVM.LL;
                String str = "";
                if ((c1555840qac2 == null || (c1822010xVv2 = c1555840qac2.LL) == null || (secUid = c1822010xVv2.LJII) == null) && (room == null || (owner = room.getOwner()) == null || (secUid = owner.getSecUid()) == null)) {
                    secUid = "";
                }
                C1555840qac c1555840qac3 = pcsServiceSkuVM.LL;
                if (c1555840qac3 != null && (c1822010xVv = c1555840qac3.LL) != null && (l = c1822010xVv.LJIIIIZZ) != null && (string2 = l.toString()) != null) {
                    str = string2;
                } else if (room != null && (string = Long.valueOf(room.getId()).toString()) != null) {
                    str = string;
                }
                pcsServiceSkuVM.LLILLJJLI.LIZJ(new C1823280xXy(secUid, str, false, EnumC1822480xWg.FETCH_REMOTE_ONLY_WHEN_NO_CACHE)).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.0gFz
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        C1C7U.LIZ("PcsServiceSkuVM@29a6.getSmbPreviewData$1");
                        AbstractC509020Jxk abstractC509020Jxk = (AbstractC509020Jxk) obj;
                        if (abstractC509020Jxk instanceof C509040Jxm) {
                            C1158720gG6 c1158720gG6 = ((C509040Jxm) abstractC509020Jxk).LIZ;
                            if (c1158720gG6 == null) {
                                pcsServiceSkuVM.setState(new C1158580gFs());
                            } else {
                                pcsServiceSkuVM.setState(new C1158590gFt(c1158720gG6));
                            }
                        } else if (abstractC509020Jxk instanceof C509030Jxl) {
                            if (!(pcsServiceSkuVM.getState().LL instanceof C1156480gCU)) {
                                pcsServiceSkuVM.setState(new C1158630gFx(abstractC509020Jxk));
                            }
                        } else if (abstractC509020Jxk instanceof C490400JLa) {
                            pcsServiceSkuVM.setState(new C1158620gFw(abstractC509020Jxk));
                        } else {
                            throw new C1954807lC();
                        }
                        C1C7U.LIZIZ("PcsServiceSkuVM@29a6.getSmbPreviewData$1");
                    }
                }, new C09JN() { // from class: X.0gG0
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        C1C7U.LIZ("PcsServiceSkuVM@29a6.getSmbPreviewData$2");
                        pcsServiceSkuVM.setState(new C1158600gFu((Throwable) obj));
                        C1C7U.LIZIZ("PcsServiceSkuVM@29a6.getSmbPreviewData$2");
                    }
                });
            }
        }
        C1558520qew.LJII(C1558360qeg.LJFF(this, null), this, PcsDialogAbility.class, null, null);
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return super.onGetLayoutInflater(bundle).cloneInContext(new C1361400lX0(requireActivity(), R.style.v0));
    }

    @Override // com.bytedance.android.livesdk.comp.api.pcs.data.ability.PcsDialogAbility
    public final void pt0(AbstractC1822440xWc abstractC1822440xWc) {
        this.LLJLIL = abstractC1822440xWc;
        C20484615Do c20484615Do = this.LLJJIJIL;
        if (c20484615Do != null) {
            if (abstractC1822440xWc != null) {
                int iLIZ = abstractC1822440xWc.LIZ();
                LiveSheetHostFragment liveSheetHostFragment = c20484615Do.LIZLLL;
                if (liveSheetHostFragment != null && liveSheetHostFragment.LLIZ != iLIZ) {
                    liveSheetHostFragment.LLIZ = iLIZ;
                    Dialog dialog = liveSheetHostFragment.getDialog();
                    if (dialog != null && dialog.getWindow() != null) {
                        dialog.getWindow().setSoftInputMode(iLIZ);
                    }
                }
            } else {
                LiveSheetHostFragment liveSheetHostFragment2 = c20484615Do.LIZLLL;
                if (liveSheetHostFragment2 != null && liveSheetHostFragment2.LLIZ != 16) {
                    liveSheetHostFragment2.LLIZ = 16;
                    Dialog dialog2 = liveSheetHostFragment2.getDialog();
                    if (dialog2 != null && dialog2.getWindow() != null) {
                        dialog2.getWindow().setSoftInputMode(16);
                    }
                }
            }
        }
        SR();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r12, android.os.Bundle r13) {
        /*
            r11 = this;
            r5 = r11
            super.onViewCreated(r12, r13)
            r0 = 2131370464(0x7f0a21e0, float:1.8360935E38)
            android.view.View r0 = r12.findViewById(r0)
            X.0kZq r0 = (X.C1324720kZq) r0
            r5.LLL = r0
            X.0xVv r0 = r5.LLJZIJLIL
            r4 = 7
            r3 = 1
            if (r0 == 0) goto L24
            X.0wYg r0 = r0.LIZ
            int[] r1 = X.C1782130wTb.LIZ
            int r0 = r0.ordinal()
            r1 = r1[r0]
            if (r1 == r3) goto Lac
            r0 = 2
            if (r1 == r0) goto Lac
        L24:
            r0 = 1
        L25:
            r2 = 0
            if (r0 != r4) goto La2
            X.0HTI r1 = new X.0HTI
            r1.<init>()
            r0 = 2130976229(0x7f041de5, float:1.7561332E38)
            r1.LIZ = r0
            android.content.Context r0 = r12.getContext()
            android.graphics.drawable.Drawable r0 = r1.LIZ(r0)
            r5.LLLF = r0
            X.0HTI r1 = new X.0HTI
            r1.<init>()
            r0 = 2130976228(0x7f041de4, float:1.756133E38)
            r1.LIZ = r0
            android.content.Context r0 = r12.getContext()
            android.graphics.drawable.Drawable r0 = r1.LIZ(r0)
            r5.LLLFF = r0
            X.0kZq r1 = r5.LLL
            if (r1 == 0) goto L59
            android.graphics.drawable.Drawable r0 = r5.LLLF
            r1.setImageDrawable(r0)
        L59:
            X.04eV r1 = new X.04eV
            r1.<init>(r5)
            r0 = 3
            r4 = 0
            X.C723850SaN.LIZ(r5, r2, r4, r1, r0)
            X.0Q7z r1 = X.C1558360qeg.LJFF(r5, r4)
            java.lang.Class<com.bytedance.android.livesdk.comp.api.pcs.ui.loading.IPcsLoadingAbility> r0 = com.bytedance.android.livesdk.comp.api.pcs.ui.loading.IPcsLoadingAbility.class
            X.01wD r1 = X.C1558520qew.LIZ(r1, r0, r4)
            com.bytedance.android.livesdk.comp.api.pcs.ui.loading.IPcsLoadingAbility r1 = (com.bytedance.android.livesdk.comp.api.pcs.ui.loading.IPcsLoadingAbility) r1
            if (r1 == 0) goto L77
            X.0JHy r0 = X.C489600JHy.LIZ
            com.bytedance.android.livesdk.comp.api.pcs.ui.loading.PcsGenericLoadingVM r4 = r1.dj1(r0, r3)
        L77:
            com.bytedance.assem.arch.viewModel.AssemVMLazy r1 = r5.LLJLLL
            X.1Bqa<java.lang.Object>[] r0 = com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicesku.PcsServiceSkuDialog.LLLIIII
            com.bytedance.assem.arch.viewModel.AssemViewModel r6 = r1.getValue()
            X.0gMO r7 = new X.C2217381BqS() { // from class: X.0gMO
                static {
                    /*
                        X.0gMO r0 = new X.0gMO
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.0gMO) X.0gMO.LL X.0gMO
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1162620gMO.<clinit>():void");
                }

                {
                    /*
                        r4 = this;
                        java.lang.Class<X.0gFp> r3 = X.C1158550gFp.class
                        java.lang.String r2 = "getPageState()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/foundation/serviceplus/servicesku/viewmodel/PcsServiceSkuVMState$PageState;"
                        r1 = 0
                        java.lang.String r0 = "pageState"
                        r4.<init>(r3, r0, r2, r1)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1162620gMO.<init>():void");
                }

                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final java.lang.Object get(java.lang.Object r2) {
                    /*
                        r1 = this;
                        X.0gFp r2 = (X.C1158550gFp) r2
                        X.0gFn r0 = r2.LL
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1162620gMO.get(java.lang.Object):java.lang.Object");
                }
            }
            r8 = 0
            X.0xVo r9 = new X.0xVo
            r9.<init>(r5, r4)
            r10 = 6
            X.C736680Sv4.LJIIIIZZ(r5, r6, r7, r8, r9, r10)
            X.0xVv r0 = r5.LLJZIJLIL
            if (r0 == 0) goto La1
            boolean r0 = r0.LIZ()
            if (r0 != r3) goto La1
            r0 = 2131364820(0x7f0a0bd4, float:1.8349488E38)
            android.view.View r0 = r12.findViewById(r0)
            if (r0 == 0) goto La1
            X.C786410Ut5.LJLLLLLL(r2, r0)
        La1:
            return
        La2:
            X.0kZq r1 = r5.LLL
            if (r1 == 0) goto L59
            r0 = 8
            X.C786410Ut5.LLJJIII(r1, r0)
            goto L59
        Lac:
            r0 = 7
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicesku.PcsServiceSkuDialog.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.hg_, viewGroup, false);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
