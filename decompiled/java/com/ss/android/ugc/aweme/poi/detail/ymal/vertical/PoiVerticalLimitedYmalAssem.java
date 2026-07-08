package com.ss.android.ugc.aweme.poi.detail.ymal.vertical;

import X.C0DXR;
import X.C1173330gdf;
import X.C1173350gdh;
import X.C1174850gg7;
import X.C123100dR;
import X.C13LP;
import X.C20600815jK;
import X.C2211631BhB;
import X.C339190DRl;
import X.C427690Gpr;
import X.C786410Ut5;
import X.C960203pA;
import X.InterfaceC1891350zJl;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBaseAssem;
import com.ss.android.ugc.aweme.poi.experiment.PoiDetailYmalV2Exp;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiDiscoveryCard;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS384S0200000_18;
import wh6.AbS699S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiVerticalLimitedYmalAssem extends PoiDetailBaseAssem<PoiDetailYmalModule> {
    public ViewOnAttachStateChangeListenerC20604515jv LLJJL;
    public View LLJJLIIIJLLLLLLLZ;
    public TuxTextView LLJL;
    public final int LLJLIL = 4;
    public final int LLJLILLLLZIIL;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.e3o;
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBaseAssem
    public final boolean yp() {
        return true;
    }

    public final int Ep() {
        C20600815jK<InterfaceC1891350zJl> state;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJJL;
        if (viewOnAttachStateChangeListenerC20604515jv == null || (state = viewOnAttachStateChangeListenerC20604515jv.getState()) == null) {
            return 0;
        }
        return state.LJIIIIZZ();
    }

    public PoiVerticalLimitedYmalAssem() {
        Integer num;
        PoiDetailYmalV2Exp.Config config = (PoiDetailYmalV2Exp.Config) PoiDetailYmalV2Exp.LIZ.getValue();
        this.LLJLILLLLZIIL = (config == null || (num = config.ymalCount) == null) ? 12 : num.intValue();
    }

    public final boolean Fp() {
        List<PoiDiscoveryCard> poiList;
        if (Ep() <= this.LLJLILLLLZIIL) {
            int iEp = Ep();
            PoiDetailYmalModule poiDetailYmalModule = (PoiDetailYmalModule) C1174850gg7.LIZJ(this);
            if (iEp < ((poiDetailYmalModule == null || (poiList = poiDetailYmalModule.getPoiList()) == null) ? 0 : poiList.size())) {
                return false;
            }
        }
        return true;
    }

    public final void Gp() {
        if (Fp()) {
            View view = this.LLJJLIIIJLLLLLLLZ;
            if (view != null) {
                C339190DRl.LIZIZ(view);
                return;
            }
            return;
        }
        View view2 = this.LLJJLIIIJLLLLLLLZ;
        if (view2 != null) {
            C339190DRl.LIZLLL(view2);
        }
        View view3 = this.LLJJLIIIJLLLLLLLZ;
        if (view3 != null) {
            C786410Ut5.I7(new AbS699S0100000_18(this, 24, 42), view3);
        }
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, X.InterfaceC1173970geh
    public final void CG1(BaseComponentData baseComponentData) {
        TuxTextView tuxTextView;
        PoiDetailYmalModule poiDetailYmalModule = (PoiDetailYmalModule) baseComponentData;
        super.CG1(poiDetailYmalModule);
        if (C123100dR.LIZ(poiDetailYmalModule.getTitle()) && (tuxTextView = this.LLJL) != null) {
            tuxTextView.setText(poiDetailYmalModule.getTitle());
        }
        Ip(poiDetailYmalModule);
        Gp();
    }

    public final void Ip(PoiDetailYmalModule poiDetailYmalModule) {
        C20600815jK<InterfaceC1891350zJl> state;
        List<PoiDiscoveryCard> poiList;
        C20600815jK<InterfaceC1891350zJl> state2;
        List<PoiDiscoveryCard> poiList2;
        if (Fp()) {
            return;
        }
        int size = 0;
        if (Ep() <= 0) {
            List<PoiDiscoveryCard> poiList3 = poiDetailYmalModule.getPoiList();
            if (poiList3 != null) {
                int i = this.LLJLIL;
                PoiDetailYmalModule poiDetailYmalModule2 = (PoiDetailYmalModule) C1174850gg7.LIZJ(this);
                if (poiDetailYmalModule2 != null && (poiList2 = poiDetailYmalModule2.getPoiList()) != null) {
                    size = poiList2.size();
                }
                if (i > size) {
                    i = size;
                }
                List listLL = C13LP.LL(poiList3, i);
                if (listLL != null) {
                    List<C1173350gdh> listLIZ = C1173330gdf.LIZ(listLL);
                    ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJJL;
                    if (viewOnAttachStateChangeListenerC20604515jv != null && (state2 = viewOnAttachStateChangeListenerC20604515jv.getState()) != null) {
                        state2.LJIILL(listLIZ, null);
                    }
                }
            }
        } else {
            List<PoiDiscoveryCard> poiList4 = poiDetailYmalModule.getPoiList();
            if (poiList4 != null) {
                int iEp = Ep();
                int iEp2 = Ep() + this.LLJLIL;
                PoiDetailYmalModule poiDetailYmalModule3 = (PoiDetailYmalModule) C1174850gg7.LIZJ(this);
                if (poiDetailYmalModule3 != null && (poiList = poiDetailYmalModule3.getPoiList()) != null) {
                    size = poiList.size();
                }
                if (iEp2 > size) {
                    iEp2 = size;
                }
                List<PoiDiscoveryCard> listSubList = poiList4.subList(iEp, iEp2);
                if (listSubList != null) {
                    List<C1173350gdh> listLIZ2 = C1173330gdf.LIZ(listSubList);
                    ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLJJL;
                    if (viewOnAttachStateChangeListenerC20604515jv2 != null && (state = viewOnAttachStateChangeListenerC20604515jv2.getState()) != null) {
                        state.LIZLLL(listLIZ2, null);
                    }
                }
            }
        }
        Gp();
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBaseAssem, com.ss.android.ugc.aweme.slash.component.glue.BaseSlashGlueSlotAssemComponent, com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C0DXR c0dxr;
        super.onViewCreated(view);
        C2211631BhB.LJ(view, new AwS384S0200000_18(view, this, 24));
        this.LLJJL = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.ymal_poi_list);
        final Context context = getContext();
        if (context != null) {
            c0dxr = new C0DXR(context) { // from class: X.0DYX
                public final Drawable LLILLJJLI;
                public final boolean LL = false;
                public final int LLILLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));

                {
                    this.LLILLJJLI = C800330VaR.LIZIZ(context, R.drawable.fjf);
                }

                @Override // X.C0DXR
                public final void LIZJ(Canvas canvas, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                    Drawable drawable = this.LLILLJJLI;
                    if (drawable != null) {
                        int paddingLeft = recyclerView.getPaddingLeft() + this.LLILLL;
                        int width = (recyclerView.getWidth() - recyclerView.getPaddingRight()) - this.LLILLL;
                        int childCount = recyclerView.getChildCount() - 1;
                        for (int i = 0; i < childCount; i++) {
                            View childAt = recyclerView.getChildAt(i);
                            int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).bottomMargin;
                            drawable.setBounds(paddingLeft, bottom, width, drawable.getIntrinsicHeight() + bottom);
                            drawable.draw(canvas);
                        }
                    }
                }

                @Override // X.C0DXR
                public final void LIZIZ(Rect rect, View view2, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                    Drawable drawable = this.LLILLJJLI;
                    if (drawable != null) {
                        if (this.LL && recyclerView.getChildAdapterPosition(view2) == 0) {
                            rect.set(0, 0, 0, 0);
                            return;
                        }
                        AbstractC21673619ry adapter = recyclerView.getAdapter();
                        if (adapter != null) {
                            if (recyclerView.getChildAdapterPosition(view2) == adapter.getItemCount() - 1) {
                                rect.set(0, 0, 0, 0);
                                return;
                            }
                        }
                        rect.set(0, 0, 0, drawable.getIntrinsicHeight());
                    }
                }
            };
        } else {
            c0dxr = null;
        }
        this.LLJL = (TuxTextView) view.findViewById(R.id.ymal_title);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJJL;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            viewOnAttachStateChangeListenerC20604515jv.setLifecycleOwner(this);
            viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(VerticalYmalCell.class);
            viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(new LinearLayoutManager(viewOnAttachStateChangeListenerC20604515jv.getContext()));
            if (c0dxr != null) {
                viewOnAttachStateChangeListenerC20604515jv.addItemDecoration(c0dxr);
            }
        }
        View viewFindViewById = view.findViewById(R.id.uj5);
        this.LLJJLIIIJLLLLLLLZ = viewFindViewById;
        if (viewFindViewById != null) {
            C427690Gpr.LJIIIIZZ(viewFindViewById);
        }
        View viewFindViewById2 = view.findViewById(R.id.uj6);
        Context context2 = getContext();
        if (context2 != null && C960203pA.LIZIZ(context2)) {
            if (viewFindViewById2 != null) {
                viewFindViewById2.setBackgroundResource(R.drawable.d8i);
            }
        } else {
            if (viewFindViewById2 == null) {
                return;
            }
            viewFindViewById2.setBackgroundResource(R.drawable.d8j);
        }
    }
}
