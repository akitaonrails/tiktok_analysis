package com.ss.android.ugc.nearby.toolzone;

import X.AbstractC2211791BhR;
import X.AbstractViewOnClickListenerC1637610siV;
import X.C1205120hSw;
import X.C2188811AlT;
import X.C2211751BhN;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.nearby.container.model.NearbyTool;
import com.ss.android.ugc.nearby.toolzone.NearbyToolBaseCell;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public class NearbyToolBaseCell<T extends InterfaceC1891350zJl> extends PowerCell<T> {
    public View LL;
    public SmartImageView LLILLJJLI;
    public TuxTextView LLILLL;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C2211751BhN.LIZ(this.itemView, new AbstractC2211791BhR(this) { // from class: X.0hSy
            public Function0<String> LJ;
            public final float LJFF = 1.0f;
            public final C1208900hZ2 LJI;

            @Override // X.AbstractC2211791BhR
            public final int LIZJ() {
                return 0;
            }

            @Override // X.AbstractC2211791BhR
            public final Function0<String> LIZLLL() {
                return this.LJ;
            }

            @Override // X.AbstractC2211791BhR
            public final InterfaceC2211931Bhf LJFF() {
                return this.LJI;
            }

            @Override // X.AbstractC2211791BhR
            public final float LJIIL() {
                return this.LJFF;
            }

            {
                this.LJ = new AwS562S0100000_18((NearbyToolBaseCell) this, 2398);
                this.LJI = new C1208900hZ2(this, 4);
            }

            @Override // X.AbstractC2211791BhR
            public final void LJIILL(Function0<String> function0) {
                this.LJ = function0;
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x016f  */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onBindItemView(T r9) {
        /*
            Method dump skipped, instruction units count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.nearby.toolzone.NearbyToolBaseCell.onBindItemView(X.0zJl):void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public View onCreateItemView(ViewGroup viewGroup) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.dsa, viewGroup, false);
        this.LL = viewTd;
        this.LLILLJJLI = (SmartImageView) viewTd.findViewById(R.id.y63);
        this.LLILLL = (TuxTextView) viewTd.findViewById(R.id.y6a);
        return viewTd;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(T t, List<? extends Object> list) {
        super.onBindItemView(t, list);
        if (!list.isEmpty()) {
            Object obj = ListProtector.get(list, 0);
            if (obj instanceof C1205120hSw) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onBind with new payload=");
                C1205120hSw c1205120hSw = (C1205120hSw) obj;
                sbLIZ.append(c1205120hSw.LIZ);
                C2188811AlT.LIZIZ(sbLIZ);
                final String str = c1205120hSw.LIZ;
                View view = this.LL;
                if (view != null) {
                    C786410Ut5.I7(new AbstractViewOnClickListenerC1637610siV() { // from class: X.0hSx
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // X.AbstractViewOnClickListenerC1637610siV
                        public final void LIZ(View view2) {
                            String componentKey;
                            NearbyTool nearbyTool;
                            NearbyTool nearbyTool2;
                            if (view2 != null) {
                                C1204900hSa c1204900hSa = C1204900hSa.LIZ;
                                T item = this.LLILZ.getItem();
                                Context context = null;
                                if ((item instanceof NearbyTool) && (nearbyTool2 = (NearbyTool) item) != null) {
                                    componentKey = nearbyTool2.getComponentKey();
                                } else {
                                    componentKey = null;
                                }
                                c1204900hSa.getClass();
                                C1204900hSa.LIZJ(componentKey);
                                C1204900hSa.LIZLLL(true);
                                View view3 = this.LLILZ.LL;
                                if (view3 != null) {
                                    context = view3.getContext();
                                }
                                SmartRouter.buildRoute(context, str).open();
                                T item2 = this.LLILZ.getItem();
                                if ((item2 instanceof NearbyTool) && (nearbyTool = (NearbyTool) item2) != null) {
                                    C1204900hSa.LIZIZ(Integer.valueOf(this.LLILZ.getItemCount()), Integer.valueOf(this.LLILZ.getBindingAdapterPosition()), Boolean.valueOf(nearbyTool.isCacheData()), nearbyTool.getComponentKey());
                                }
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(300L);
                        }
                    }, view);
                }
            }
        }
    }
}
