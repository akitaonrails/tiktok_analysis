package com.ss.android.ugc.aweme.poi.detail.guides;

import X.C019F;
import X.C0BMY;
import X.C0DXR;
import X.C1185610gxT;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1637806bA;
import X.C19719912Dl;
import X.C19ME;
import X.C2217381BqS;
import X.C2255108sX;
import X.C418440Gaw;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher$PoiDetailDataUpdateAbility;
import com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi;
import com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBaseAssem;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS632S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDetailGuidesAssem extends PoiDetailBaseAssem<PoiDetailApi.PoiGuidesBasicData> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLIL;
    public final AssemVMLazy LLJJL;
    public TuxTextView LLJJLIIIJLLLLLLLZ;
    public ViewOnAttachStateChangeListenerC20604515jv LLJL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiDetailGuidesAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/poi/detail/guides/PoiDetailGuidesVM;", 0);
        C13LE.LIZ.getClass();
        LLJLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PoiDetailGuidesAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiDetailGuidesVM.class);
        this.LLJJL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 1135), AFwS256S0000000_18.get$arr$(407), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.e31;
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBaseAssem
    public final boolean yp() {
        return false;
    }

    public final PoiDetailGuidesVM Ep() {
        AssemVMLazy assemVMLazy = this.LLJJL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLIL;
        return (PoiDetailGuidesVM) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, X.InterfaceC1173970geh
    public final void CG1(BaseComponentData baseComponentData) {
        PoiDetailApi.PoiGuidesBasicData poiGuidesBasicData = (PoiDetailApi.PoiGuidesBasicData) baseComponentData;
        super.CG1(poiGuidesBasicData);
        PoiDetailGuidesVM poiDetailGuidesVMEp = Ep();
        if (poiGuidesBasicData != null && poiGuidesBasicData.hasGuidesBasicData$poi_release()) {
            poiDetailGuidesVMEp.setState(new AwS597S0100000_18(poiGuidesBasicData, 796));
        } else {
            poiDetailGuidesVMEp.setState(AFwS256S0000000_18.get$arr$(895));
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBaseAssem, com.ss.android.ugc.aweme.slash.component.glue.BaseSlashGlueSlotAssemComponent, com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        boolean z;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        super.onViewCreated(view);
        this.LLJJLIIIJLLLLLLLZ = (TuxTextView) view.findViewById(R.id.jfo);
        this.LLJL = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.jfn);
        if (((Number) C0BMY.LIZ.getValue()).intValue() == 2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            TuxTextView tuxTextView = this.LLJJLIIIJLLLLLLLZ;
            if (tuxTextView != null) {
                layoutParams = tuxTextView.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if (layoutParams instanceof C19ME) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (marginLayoutParams != null) {
                    marginLayoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                }
            } else {
                marginLayoutParams = null;
            }
            TuxTextView tuxTextView2 = this.LLJJLIIIJLLLLLLLZ;
            if (tuxTextView2 != null) {
                C786410Ut5.R6(tuxTextView2, marginLayoutParams);
            }
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJL;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            viewOnAttachStateChangeListenerC20604515jv.setLifecycleOwner(this);
            viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(PoiDetailGuidesCell.class);
            viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(new LinearLayoutManager(viewOnAttachStateChangeListenerC20604515jv.getContext(), 0, false));
            viewOnAttachStateChangeListenerC20604515jv.setItemAnimator(null);
            final int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            final int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            final int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            viewOnAttachStateChangeListenerC20604515jv.addItemDecoration(new C0DXR(iLIZIZ, iLIZIZ2, iLIZIZ3) { // from class: X.0DXC
                public final int LL;
                public final int LLILLJJLI = 0;
                public final int LLILLL;
                public final int LLILZ;

                {
                    this.LL = iLIZIZ;
                    this.LLILLL = iLIZIZ2;
                    this.LLILZ = iLIZIZ3;
                }

                @Override // X.C0DXR
                public final void LIZIZ(Rect rect, View view2, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                    int itemCount;
                    int i;
                    int i2;
                    int itemCount2;
                    int childAdapterPosition = recyclerView.getChildAdapterPosition(view2);
                    if (this.LLILLJJLI == 1) {
                        AbstractC21673619ry adapter = recyclerView.getAdapter();
                        if (adapter != null) {
                            itemCount2 = adapter.getItemCount();
                        } else {
                            itemCount2 = 0;
                        }
                        if (childAdapterPosition == 0) {
                            rect.set(0, this.LLILLL, 0, (int) (this.LL / 2.0f));
                            return;
                        } else if (childAdapterPosition == itemCount2 - 1) {
                            rect.set(0, (int) (this.LL / 2.0f), 0, this.LLILZ);
                            return;
                        } else {
                            int i3 = (int) (this.LL / 2.0f);
                            rect.set(0, i3, 0, i3);
                            return;
                        }
                    }
                    AbstractC21673619ry adapter2 = recyclerView.getAdapter();
                    if (adapter2 != null) {
                        itemCount = adapter2.getItemCount();
                    } else {
                        itemCount = 0;
                    }
                    if (C426750GoL.LJFF()) {
                        i = (int) (this.LL / 2.0f);
                        i2 = this.LLILZ;
                    } else {
                        i = this.LLILLL;
                        i2 = (int) (this.LL / 2.0f);
                    }
                    if (childAdapterPosition == 0) {
                        rect.set(i, 0, i2, 0);
                    } else if (childAdapterPosition == itemCount - 1) {
                        rect.set(i2, 0, i, 0);
                    } else {
                        int i4 = (int) (this.LL / 2.0f);
                        rect.set(i4, 0, i4, 0);
                    }
                }
            });
        }
        Ep().LL = ((C1185610gxT) mp()).getPoiId();
        Ep().LLILLJJLI = ((C1185610gxT) mp()).getGroupId();
        C736680Sv4.LJIIIIZZ(this, Ep(), new C2217381BqS() { // from class: X.0gdQ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1155480gAs) obj).LL;
            }
        }, null, new AwS632S0100000_18(this, 117), 6);
        C736680Sv4.LJIIIIZZ(this, Ep(), new C2217381BqS() { // from class: X.0gdR
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1155480gAs) obj).LLILLJJLI;
            }
        }, null, new AwS632S0100000_18(this, 118), 6);
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJI, null);
            ContainerEventDispatcher$PoiDetailDataUpdateAbility containerEventDispatcher$PoiDetailDataUpdateAbility = new ContainerEventDispatcher$PoiDetailDataUpdateAbility(this) { // from class: com.ss.android.ugc.aweme.poi.detail.guides.PoiDetailGuidesAssem.onViewCreated.5
            };
            InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7zLJFF, ContainerEventDispatcher$PoiDetailDataUpdateAbility.class, null);
            if (interfaceC494301wDLIZ == null) {
                C1558520qew.LJII(interfaceC665370Q7zLJFF, containerEventDispatcher$PoiDetailDataUpdateAbility, ContainerEventDispatcher$PoiDetailDataUpdateAbility.class, null, null);
                return;
            }
            try {
                InvocationHandler invocationHandler = Proxy.getInvocationHandler(interfaceC494301wDLIZ);
                if (invocationHandler instanceof C2255108sX) {
                    ((C2255108sX) invocationHandler).LL.add(containerEventDispatcher$PoiDetailDataUpdateAbility);
                    return;
                }
                throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
            } catch (IllegalArgumentException e) {
                TryCatchGuardChecker.doCheck(e);
                C2255108sX c2255108sX = new C2255108sX();
                c2255108sX.LL.add(containerEventDispatcher$PoiDetailDataUpdateAbility);
                c2255108sX.LL.add((T) interfaceC494301wDLIZ);
                Object objNewProxyInstance = Proxy.newProxyInstance(ContainerEventDispatcher$PoiDetailDataUpdateAbility.class.getClassLoader(), new Class[]{ContainerEventDispatcher$PoiDetailDataUpdateAbility.class}, c2255108sX);
                if (objNewProxyInstance != null) {
                    C1558520qew.LJII(interfaceC665370Q7zLJFF, (InterfaceC494301wD) objNewProxyInstance, ContainerEventDispatcher$PoiDetailDataUpdateAbility.class, null, null);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher.PoiDetailDataUpdateAbility");
            }
        }
    }
}
