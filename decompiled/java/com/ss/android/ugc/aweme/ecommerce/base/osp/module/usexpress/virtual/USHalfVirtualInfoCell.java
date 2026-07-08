package com.ss.android.ugc.aweme.ecommerce.base.osp.module.usexpress.virtual;

import X.AbstractViewOnClickListenerC1173120gdK;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03C8;
import X.C03IJ;
import X.C03JV;
import X.C03K6;
import X.C03XA;
import X.C0H1U;
import X.C10515049h;
import X.C1120604Zw;
import X.C1121904a9;
import X.C13LE;
import X.C1741890vQh;
import X.C1748720vbi;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2371409Qy;
import X.C418440Gaw;
import X.C452080Ho6;
import X.C452501pT;
import X.C721002rg;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C799103Af;
import X.C814420VxA;
import X.C828603Lo;
import X.C928203k0;
import X.InterfaceC1164530gPT;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.usexpress.virtual.USHalfVirtualInfoCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.UserVirtualInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.VirtualInfoFromEvent;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.VirtualInfoModule;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS420S0200000_19;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class USHalfVirtualInfoCell extends ECPowerCell<C721002rg> implements InterfaceC1164530gPT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public final AssemVMLazy LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public C721002rg LLJILJILJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(USHalfVirtualInfoCell.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/vm/OrderSubmitAssemViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public USHalfVirtualInfoCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OrderSubmitAssemViewModel.class);
        AwS545S0100000_1 awS545S0100000_1 = new AwS545S0100000_1(c19719912DlLIZ, 827);
        AFwS228S0000000_1 aFwS228S0000000_1 = AFwS228S0000000_1.get$arr$(126);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ, 815), awS545S0100000_1, AFwS207S0000000_19.get$arr$(189), new AwS545S0100000_1((C03K6) this, 816), new AwS545S0100000_1((C03K6) this, 818), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 820), aFwS228S0000000_1, new AwS563S0100000_19((C03K6) this, 1271), null, new AwS545S0100000_1((C03K6) this, 822));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS545S0100000_1 awS545S0100000_12 = new AwS545S0100000_1((C03K6) this, 817);
            AwS545S0100000_1 awS545S0100000_13 = new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 819);
            AwS545S0100000_1 awS545S0100000_14 = new AwS545S0100000_1(c19719912DlLIZ, 821);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS420S0200000_19((InterfaceC451590HnJ) obj, awS545S0100000_12, 72));
            AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c01gwLIZIZ, 1272);
            AwS563S0100000_19 awS563S0100000_192 = new AwS563S0100000_19(c01gwLIZIZ, 1273);
            AwS563S0100000_19 awS563S0100000_193 = new AwS563S0100000_19(c01gwLIZIZ, 1274);
            AwS563S0100000_19 awS563S0100000_194 = new AwS563S0100000_19(c01gwLIZIZ, 1275);
            AwS563S0100000_19 awS563S0100000_195 = new AwS563S0100000_19(c01gwLIZIZ, 1276);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS545S0100000_14, awS545S0100000_1, new C452080Ho6(), awS563S0100000_19, awS563S0100000_192, awS545S0100000_13, aFwS228S0000000_1, awS563S0100000_193, awS563S0100000_194, awS563S0100000_195);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ, 826), awS545S0100000_1, AFwS207S0000000_19.get$arr$(190), new AwS545S0100000_1((C03K6) this, 828), new AwS545S0100000_1((C03K6) this, 829), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 830), aFwS228S0000000_1, new AwS563S0100000_19((C03K6) this, 1277), null, new AwS545S0100000_1((C03K6) this, 831));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ, 832), awS545S0100000_1, AFwS207S0000000_19.get$arr$(191), new AwS545S0100000_1((C03K6) this, 833), new AwS545S0100000_1((C03K6) this, 834), new AwS545S0100000_1((C03K6) this, 813), aFwS228S0000000_1, null, null, new AwS545S0100000_1((C03K6) this, 814));
        }
        this.LLJ = assemVMLazy;
        this.LLJI = C452501pT.LIZIZ(new AwS545S0100000_1(this, 824));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 825));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 823));
    }

    public final OrderSubmitAssemViewModel N5() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILLL;
        return (OrderSubmitAssemViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onDestroy() {
        super.onDestroy();
        IEventCenter iEventCenter = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter != null) {
            iEventCenter.LIZJ("ec_virtual_info_open", this);
        }
        IEventCenter iEventCenter2 = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter2 != null) {
            iEventCenter2.LIZJ("ec_virtual_info_saved", this);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        IEventCenter iEventCenter = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter != null) {
            iEventCenter.LIZLLL("ec_virtual_info_open", this);
        }
        IEventCenter iEventCenter2 = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter2 != null) {
            iEventCenter2.LIZLLL("ec_virtual_info_saved", this);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        UserVirtualInfo userVirtualInfo;
        C721002rg c721002rg = (C721002rg) interfaceC1891350zJl;
        super.onBindItemView(c721002rg);
        this.LLJILJILJ = c721002rg;
        C928203k0 c928203k0 = C928203k0.LIZ;
        String str = N5().n;
        c928203k0.getClass();
        if (C928203k0.LJIILL(str)) {
            C0H1U.LJIIIIZZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), (View) this.LLJI.getValue());
            C0H1U.LJIIIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), (View) this.LLJI.getValue());
        }
        VirtualInfoModule virtualInfoModule = c721002rg.LLILZLL;
        if (virtualInfoModule != null) {
            userVirtualInfo = virtualInfoModule.userVirtualInfo;
        } else {
            userVirtualInfo = null;
        }
        L5(userVirtualInfo, virtualInfoModule);
    }

    public final void L5(final UserVirtualInfo userVirtualInfo, final VirtualInfoModule virtualInfoModule) {
        if (virtualInfoModule != null) {
            ECRichText eCRichText = virtualInfoModule.header;
            if (eCRichText != null) {
                C03C8.LIZJ((TextView) this.LLJIJIL.getValue(), eCRichText, "order_submit_express_virtual_product", null);
            }
            ECRichText eCRichText2 = virtualInfoModule.content;
            if (eCRichText2 != null) {
                C03C8.LIZJ((TextView) this.LLJILJIL.getValue(), eCRichText2, "order_submit_express_virtual_product", null);
            }
            if (!this.LLILLJJLI) {
                C1748720vbi.LIZLLL(this.itemView, new C10515049h(), new AwS580S0100000_1(virtualInfoModule, 111));
            }
            C786410Ut5.Y7((ConstraintLayout) this.LLJI.getValue(), null);
            C786410Ut5.I7(new AbstractViewOnClickListenerC1173120gdK() { // from class: X.03wL
                @Override // X.AbstractViewOnClickListenerC1173120gdK
                public final void LIZ(View view) {
                    String str;
                    VirtualInfoModule virtualInfoModule2;
                    OrderSubmitAssemViewModel orderSubmitAssemViewModelN5 = this.LLILZ.N5();
                    C828603Lo c828603Lo = orderSubmitAssemViewModelN5.h;
                    USHalfVirtualInfoCell uSHalfVirtualInfoCell = this.LLILZ;
                    C721002rg c721002rg = uSHalfVirtualInfoCell.LLJILJILJ;
                    if (c721002rg != null && (virtualInfoModule2 = c721002rg.LLILZLL) != null) {
                        str = virtualInfoModule2.schema;
                    } else {
                        str = null;
                    }
                    UserVirtualInfo userVirtualInfo2 = userVirtualInfo;
                    Context context = ((View) uSHalfVirtualInfoCell.LLJI.getValue()).getContext();
                    c828603Lo.getClass();
                    C828603Lo.LJFF(str, userVirtualInfo2, context, orderSubmitAssemViewModelN5);
                    C1748720vbi.LIZLLL(this.LLILZ.itemView, new C10516049i(), new AwS580S0100000_1(virtualInfoModule, 112));
                }
            }, (View) this.LLJI.getValue());
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup, int i) {
        C03XA c03xa = C03XA.LIZ;
        Context context = viewGroup.getContext();
        c03xa.getClass();
        return C03XA.LIZJ(context, R.layout.b13, viewGroup, false);
    }

    @Override // X.InterfaceC1164530gPT
    public final void onEvent(String str, String str2) {
        C799103Af c799103Af;
        String str3;
        String str4;
        C721002rg c721002rg;
        VirtualInfoModule virtualInfoModule;
        String str5;
        VirtualInfoModule virtualInfoModule2;
        Type type;
        VirtualInfoFromEvent virtualInfoFromEvent;
        String str6;
        String str7;
        String str8;
        VirtualInfoModule virtualInfoModule3;
        List<InterfaceC1891350zJl> list;
        InterfaceC1891350zJl next;
        C721002rg c721002rg2;
        VirtualInfoModule virtualInfoModule4;
        String str9;
        VirtualInfoModule virtualInfoModule5;
        String str10;
        Type type2;
        UserVirtualInfo userVirtualInfo = null;
        VirtualInfoModule virtualInfoModule6 = null;
        userVirtualInfo = null;
        if (Intrinsics.LJFF(str, "ec_virtual_info_open")) {
            try {
                Gson gsonLJFF = C1741890vQh.LJFF();
                C1120604Zw.LIZ.getClass();
                C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                    type = C2371409Qy.LIZJ(C13LE.LJII(C799103Af.class));
                } else {
                    type = new TypeToken<C799103Af>() { // from class: X.03wM
                    }.getType();
                }
                Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, str2, type);
                if (!(objFromJson instanceof C799103Af)) {
                    objFromJson = null;
                }
                c799103Af = (C799103Af) objFromJson;
            } catch (s e) {
                TryCatchGuardChecker.doCheck(e);
                c799103Af = null;
            }
            C721002rg c721002rg3 = this.LLJILJILJ;
            if (c721002rg3 != null) {
                str3 = c721002rg3.LLIZ;
            } else {
                str3 = null;
            }
            if (c799103Af != null) {
                str4 = c799103Af.LIZ;
            } else {
                str4 = null;
            }
            if (Intrinsics.LJFF(str3, str4) && (c721002rg = this.LLJILJILJ) != null && (virtualInfoModule = c721002rg.LLILZLL) != null && (str5 = virtualInfoModule.schema) != null) {
                C828603Lo c828603Lo = N5().h;
                C721002rg c721002rg4 = this.LLJILJILJ;
                if (c721002rg4 != null && (virtualInfoModule2 = c721002rg4.LLILZLL) != null) {
                    userVirtualInfo = virtualInfoModule2.userVirtualInfo;
                }
                Context context = this.itemView.getContext();
                OrderSubmitAssemViewModel orderSubmitAssemViewModelN5 = N5();
                c828603Lo.getClass();
                C828603Lo.LJFF(str5, userVirtualInfo, context, orderSubmitAssemViewModelN5);
                return;
            }
            return;
        }
        if (Intrinsics.LJFF(str, "ec_virtual_info_saved")) {
            try {
                Gson gsonLJFF2 = C1741890vQh.LJFF();
                C1120604Zw.LIZ.getClass();
                C1121904a9 c1121904a9LIZIZ2 = C1120604Zw.LIZIZ();
                if (c1121904a9LIZIZ2 != null && c1121904a9LIZIZ2.LJII) {
                    type2 = C2371409Qy.LIZJ(C13LE.LJII(VirtualInfoFromEvent.class));
                } else {
                    type2 = new TypeToken<VirtualInfoFromEvent>() { // from class: X.03wN
                    }.getType();
                }
                Object objFromJson2 = GsonProtectorUtils.fromJson(gsonLJFF2, str2, type2);
                if (!(objFromJson2 instanceof VirtualInfoFromEvent)) {
                    objFromJson2 = null;
                }
                virtualInfoFromEvent = (VirtualInfoFromEvent) objFromJson2;
            } catch (s e2) {
                TryCatchGuardChecker.doCheck(e2);
                virtualInfoFromEvent = null;
            }
            C721002rg c721002rg5 = this.LLJILJILJ;
            if (c721002rg5 != null) {
                str6 = c721002rg5.LLIZ;
            } else {
                str6 = null;
            }
            if (virtualInfoFromEvent != null) {
                str7 = virtualInfoFromEvent.skuId;
            } else {
                str7 = null;
            }
            if (Intrinsics.LJFF(str6, str7) && virtualInfoFromEvent != null) {
                C721002rg c721002rg6 = this.LLJILJILJ;
                if (c721002rg6 != null) {
                    VirtualInfoModule virtualInfoModule7 = virtualInfoFromEvent.virtualInfoModule;
                    if (virtualInfoModule7 != null) {
                        VirtualInfoModule virtualInfoModule8 = c721002rg6.LLILZLL;
                        if (virtualInfoModule8 != null) {
                            str10 = virtualInfoModule8.schema;
                        } else {
                            str10 = null;
                        }
                        virtualInfoModule5 = new VirtualInfoModule(virtualInfoModule7.header, virtualInfoModule7.content, str10, virtualInfoFromEvent.virtualInfo);
                    } else {
                        virtualInfoModule5 = null;
                    }
                    c721002rg6.LLILZLL = virtualInfoModule5;
                }
                C03JV state = N5().getState();
                if (state != null && (list = state.LLILLJJLI) != null) {
                    Iterator<InterfaceC1891350zJl> it2 = list.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (next instanceof C721002rg) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    InterfaceC1891350zJl interfaceC1891350zJl = next;
                    if (interfaceC1891350zJl != null && (interfaceC1891350zJl instanceof C721002rg) && (c721002rg2 = (C721002rg) interfaceC1891350zJl) != null) {
                        VirtualInfoModule virtualInfoModule9 = virtualInfoFromEvent.virtualInfoModule;
                        if (virtualInfoModule9 != null) {
                            VirtualInfoModule virtualInfoModule10 = ((C721002rg) interfaceC1891350zJl).LLILZLL;
                            if (virtualInfoModule10 != null) {
                                str9 = virtualInfoModule10.schema;
                            } else {
                                str9 = null;
                            }
                            virtualInfoModule4 = new VirtualInfoModule(virtualInfoModule9.header, virtualInfoModule9.content, str9, virtualInfoFromEvent.virtualInfo);
                        } else {
                            virtualInfoModule4 = null;
                        }
                        c721002rg2.LLILZLL = virtualInfoModule4;
                    }
                }
                C828603Lo c828603Lo2 = N5().h;
                if (c828603Lo2 != null) {
                    String str11 = virtualInfoFromEvent.skuId;
                    UserVirtualInfo userVirtualInfo2 = virtualInfoFromEvent.virtualInfo;
                    if (str11 != null && userVirtualInfo2 != null) {
                        c828603Lo2.LIZ.put(str11, userVirtualInfo2);
                    }
                }
                OrderSubmitAssemViewModel orderSubmitAssemViewModelN52 = N5();
                C721002rg c721002rg7 = this.LLJILJILJ;
                if (c721002rg7 != null) {
                    str8 = c721002rg7.LLIZ;
                    virtualInfoModule3 = c721002rg7.LLILZLL;
                } else {
                    str8 = null;
                    virtualInfoModule3 = null;
                }
                orderSubmitAssemViewModelN52.OQ2(virtualInfoModule3, str8);
                UserVirtualInfo userVirtualInfo3 = virtualInfoFromEvent.virtualInfo;
                C721002rg c721002rg8 = this.LLJILJILJ;
                if (c721002rg8 != null) {
                    virtualInfoModule6 = c721002rg8.LLILZLL;
                }
                L5(userVirtualInfo3, virtualInfoModule6);
            }
        }
    }
}
