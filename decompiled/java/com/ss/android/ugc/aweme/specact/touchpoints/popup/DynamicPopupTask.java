package com.ss.android.ugc.aweme.specact.touchpoints.popup;

import X.AbstractC20660815t0;
import X.C01GW;
import X.C1537900q7g;
import X.C1541950qED;
import X.C1894700zPA;
import X.C19336910kx;
import X.C19EG;
import X.C20656615sK;
import X.C2178808gE;
import X.C2188811AlT;
import X.C688120Qyw;
import X.InterfaceC1554220qY0;
import X.InterfaceC20647615qs;
import X.InterfaceC20660615sy;
import android.content.Context;
import android.content.res.Configuration;
import android.view.LayoutInflater;
import android.view.View;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkPopup;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.touchpoint.api.model.DynamicDialog;
import com.bytedance.touchpoint.api.model.TouchPoint;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.specact.touchpoints.popup.DynamicPopupTask;
import com.ss.android.ugc.aweme.utils.GsonProvider;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
@InterfaceC20647615qs("lynx_dynamic_popup")
public final class DynamicPopupTask extends AbstractC20660815t0 {
    public final String LL;
    public final boolean LLILLJJLI;
    public final List<TouchPoint> LLILLL;
    public TouchPoint LLILZ;
    public DynamicDialog LLILZIL;
    public final int LLILZLL;

    @Override // X.AbstractC20656215sG
    public final boolean canShow() {
        TouchPoint touchPoint = this.LLILZ;
        if (touchPoint != null && touchPoint.LIZ) {
            return false;
        }
        List<TouchPoint> list = this.LLILLL;
        TouchPoint touchPoint2 = null;
        if (list != null) {
            Iterator<TouchPoint> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                TouchPoint next = it2.next();
                if (Intrinsics.LJFF(next.scene, this.LL)) {
                    touchPoint2 = next;
                    break;
                }
            }
            touchPoint2 = touchPoint2;
        }
        this.LLILZ = touchPoint2;
        if (touchPoint2 != null) {
            DynamicDialog dynamicDialog = (DynamicDialog) GsonProtectorUtils.fromJson(((GsonProvider) ServiceManager.get().getService(GsonProvider.class)).getGson(), touchPoint2.data, DynamicDialog.class);
            this.LLILZIL = dynamicDialog;
            if (dynamicDialog != null) {
                dynamicDialog.LJFF = touchPoint2.data;
                dynamicDialog.LIZ = touchPoint2.touchPointId;
                dynamicDialog.LIZIZ = touchPoint2.touchPointName;
                int i = touchPoint2.launchPlanId;
                if (i == null) {
                    i = -1;
                }
                dynamicDialog.LIZJ = i;
                String str = touchPoint2.abVersions;
                if (str == null) {
                    str = "";
                }
                dynamicDialog.LIZLLL = str;
            }
        }
        TouchPoint touchPoint3 = this.LLILZ;
        return (touchPoint3 == null || this.LLILZIL == null || touchPoint3.LIZ) ? false : true;
    }

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC20659015si
    public final void LJFF(final C688120Qyw c688120Qyw, final C20656615sK c20656615sK) {
        String str;
        Lifecycle lifecycle;
        if (this.LLILZIL == null) {
            c20656615sK.LIZ();
            return;
        }
        C19EG c19egLIZIZ = c688120Qyw.LIZIZ();
        if (c19egLIZIZ != null && (lifecycle = c19egLIZIZ.getLifecycle()) != null) {
            lifecycle.addObserver(new GenericLifecycleObserver() { // from class: com.ss.android.ugc.aweme.specact.touchpoints.popup.DynamicPopupTask$showPopup$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        onDestroy();
                    }
                }

                @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
                public final void onDestroy() {
                    PopupManager.LIZJ(DynamicPopupTask.class);
                }
            });
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        DynamicDialog dynamicDialog = this.LLILZIL;
        String str2 = null;
        if (dynamicDialog != null) {
            str = dynamicDialog.jsSource;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        sbLIZ.append("&data=");
        DynamicDialog dynamicDialog2 = this.LLILZIL;
        if (dynamicDialog2 != null) {
            str2 = dynamicDialog2.LJFF;
        }
        sbLIZ.append(URLEncoder.encode(str2));
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C1537900q7g c1537900q7g = C1541950qED.LIZJ;
        Context context = c688120Qyw.LIZ;
        SparkContext sparkContext = new SparkContext();
        sparkContext.LJJLIIJ(strLIZIZ);
        sparkContext.LJJJZ("container_bg_color", "00000000");
        sparkContext.LJJJZ("show_mask", "1");
        sparkContext.LJJJZ("mask_bg_color", "00000080");
        sparkContext.LJJJZ("loading_bg_color", "00000000");
        sparkContext.LJJJLZIJ(1, "silent_load_type");
        sparkContext.LJJJJZI(new C19336910kx(this, 1));
        sparkContext.LJJLIIIJJIZ(new InterfaceC1554220qY0() { // from class: X.0zWo
            @Override // X.InterfaceC1554220qY0
            public final void LIZ() {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJII() {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJIIIIZZ() {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJIIIZ() {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJIIJ() {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJIIJJI(SparkPopup sparkPopup, LayoutInflater layoutInflater) {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJIIL(SparkPopup sparkPopup, Configuration configuration) {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJIILIIL(SparkPopup sparkPopup, View view) {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJIILJJIL(SparkPopup sparkPopup) {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJIILL(SparkPopup sparkPopup, int i) {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJIILLIIL() {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJIJ() {
            }

            @Override // X.InterfaceC1554220qY0
            public final boolean LJIJI(SparkPopup sparkPopup) {
                return false;
            }

            @Override // X.InterfaceC1554220qY0
            public final boolean LJIJJ(SparkPopup sparkPopup) {
                return false;
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJIJJLI(SparkPopup sparkPopup, float f) {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJIL(SparkPopup sparkPopup) {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJJ() {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJJI(SparkPopup sparkPopup) {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJJIFFI(SparkPopup sparkPopup) {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJJII() {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJJIIJ(SparkPopup sparkPopup) {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJJIIJZLJL(SparkPopup sparkPopup, boolean z) {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJJIIZ() {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJJIIZI() {
            }

            @Override // X.InterfaceC1554220qY0
            public final void onViewAttachedToWindow() {
            }

            @Override // X.InterfaceC1554220qY0
            public final void onViewDetachedFromWindow() {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJIIZILJ(SparkPopup sparkPopup) {
                c20656615sK.LIZ();
            }

            @Override // X.InterfaceC1554220qY0
            public final boolean LJJIII(SparkPopup sparkPopup, SparkContext sparkContext2) {
                DynamicPopupTask dynamicPopupTask = this.LIZ;
                if (dynamicPopupTask.LLILLJJLI) {
                    C19EG c19egLIZIZ2 = c688120Qyw.LIZIZ();
                    if (c19egLIZIZ2 != null) {
                        if (C1058550deX.LIZIZ(c19egLIZIZ2, this.LIZ.LL)) {
                            DynamicPopupTask dynamicPopupTask2 = this.LIZ;
                            dynamicPopupTask2.getClass();
                            C01U6.LIZIZ(new AwS555S0100000_11(dynamicPopupTask2, 1498));
                            return false;
                        }
                        return true;
                    }
                    DynamicPopupTask dynamicPopupTask3 = this.LIZ;
                    dynamicPopupTask3.getClass();
                    C01U6.LIZIZ(new AwS555S0100000_11(dynamicPopupTask3, 1498));
                    return false;
                }
                C01U6.LIZIZ(new AwS555S0100000_11(dynamicPopupTask, 1498));
                return false;
            }
        });
        c1537900q7g.getClass();
        new C1541950qED(context, sparkContext).LIZIZ();
    }

    public DynamicPopupTask(InterfaceC20660615sy interfaceC20660615sy, String str, int i, boolean z) {
        super(interfaceC20660615sy);
        this.LL = str;
        this.LLILLJJLI = z;
        C01GW<C1894700zPA> c01gw = C1894700zPA.LJIJ;
        this.LLILLL = C2178808gE.LIZ().LJI;
        this.LLILZLL = i;
    }
}
