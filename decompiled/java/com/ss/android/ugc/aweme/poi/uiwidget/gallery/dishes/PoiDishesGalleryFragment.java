package com.ss.android.ugc.aweme.poi.uiwidget.gallery.dishes;

import X.C01GW;
import X.C03H5;
import X.C098200Yq;
import X.C0QSJ;
import X.C0ZP4;
import X.C1175120ggY;
import X.C1175360ggw;
import X.C1182990gtF;
import X.C1185050gwZ;
import X.C1185430gxB;
import X.C1185440gxC;
import X.C1196110hEP;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1220000hqw;
import X.C12ES;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1685300txQ;
import X.C1770850wBP;
import X.C189200o6;
import X.C19474211Gy;
import X.C19EG;
import X.C19GS;
import X.C19HL;
import X.C19HN;
import X.C2188811AlT;
import X.C338520DOw;
import X.C422030Ggj;
import X.C451460Hn6;
import X.C451620HnM;
import X.C452070Ho5;
import X.C452501pT;
import X.C673150Qan;
import X.C687700QyG;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.C786410Ut5;
import X.InterfaceC0148002o;
import X.InterfaceC1146704e9;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC687730QyJ;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.ViewOnAttachStateChangeListenerC20631115oD;
import Y.AUListenerS0S0300004_18;
import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.poi.detail.dishes.PoiRecommendDishesVM;
import com.ss.android.ugc.aweme.poi.detail.gallery.PoiDishesGalleryScope;
import com.ss.android.ugc.aweme.poi.detail.gallery.PoiRecommendDishesGalleryAbility;
import com.ss.android.ugc.aweme.poi.uiwidget.gallery.PoiGalleryAnchorData;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDishesGalleryFragment extends BaseFragment implements PoiRecommendDishesGalleryAbility, InterfaceC724530SbT, C0QSJ, InterfaceC1146704e9 {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjUjIGEmITIlLSg2PGsrHELIOSKCM/LTc1Zys6Oy0pOmEDJywIIDw7LTYLKCM/LTc1Dz0yLygpJzs=";
    public final C736950SvV LLIZ;
    public C422030Ggj LLIZLLLIL;
    public ViewOnAttachStateChangeListenerC20631115oD LLJ;
    public C1196110hEP LLJI;
    public FrameLayout LLJIJIL;
    public View LLJILJIL;
    public TuxIconView LLJILJILJ;
    public ViewGroup LLJILLL;
    public C1185440gxC LLJJ;
    public C1175360ggw LLJJI;
    public final C01GW LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;
    public int LLJJIJIL;
    public C19HL LLJJJ;
    public View LLJJJIL;

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{PoiDishesGalleryScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
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

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(PoiDishesGalleryScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(PoiDishesGalleryScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.InterfaceC1182630gsf
    public final void yt(float f) {
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.gallery.PoiRecommendDishesGalleryAbility
    public final String C21() {
        C1175360ggw c1175360ggw = this.LLJJI;
        if (c1175360ggw != null) {
            return c1175360ggw.poiId;
        }
        return null;
    }

    public PoiDishesGalleryFragment() {
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(this, 2075);
        this.LLIZ = new C736950SvV(C13LE.LIZ(PoiRecommendDishesVM.class), awS562S0100000_18, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS256S0000000_18.get$arr$(715), new C451460Hn6(this, false), new C451620HnM(this, true), new C338520DOw(this));
        this.LLJJIII = C452501pT.LIZIZ(new AwS562S0100000_18(this, 2074));
    }

    @Override // X.InterfaceC1182630gsf
    public final void Yx() {
        C19GS c19gs;
        C19HL c19hl;
        ArrayList<PoiGalleryAnchorData> arrayList;
        C19EG activity = getActivity();
        if (!(activity instanceof C19GS) || (c19gs = (C19GS) activity) == null) {
            return;
        }
        C1182990gtF c1182990gtF = C1182990gtF.LIZ;
        C1175360ggw c1175360ggw = this.LLJJI;
        ArrayList<PoiGalleryAnchorData> arrayList2 = c1175360ggw != null ? c1175360ggw.anchorDataArray : null;
        int i = this.LLJJIJIL;
        c1182990gtF.getClass();
        if (!C1182990gtF.LJFF(i, arrayList2) || (c19hl = this.LLJJJ) == null) {
            C1182990gtF.LJ(c19gs);
            return;
        }
        C1175360ggw c1175360ggw2 = this.LLJJI;
        if (c1175360ggw2 == null || (arrayList = c1175360ggw2.anchorDataArray) == null) {
            return;
        }
        C1182990gtF.LIZLLL(c19gs, arrayList, c19hl, this.LLJJIJIL);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() throws IllegalAccessException {
        super.onDestroyView();
        C1558520qew.LJIIJ(this, PoiDishesGalleryScope.class, PoiRecommendDishesGalleryAbility.class, null);
        C1185440gxC c1185440gxC = this.LLJJ;
        if (c1185440gxC != null) {
            c1185440gxC.LIZJ(getContext(), this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        C1185440gxC c1185440gxC = this.LLJJ;
        if (c1185440gxC != null) {
            c1185440gxC.LIZLLL();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C1185440gxC c1185440gxC = this.LLJJ;
        if (c1185440gxC != null) {
            c1185440gxC.LJ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    @Override // com.ss.android.ugc.aweme.poi.detail.gallery.PoiRecommendDishesGalleryAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AP2(com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi.RecommendedDish r11) {
        /*
            r10 = this;
            X.0gxB r2 = X.C1185430gxB.LIZ
            X.0ggw r1 = r10.LLJJI
            r5 = 0
            if (r1 == 0) goto L3c
            java.lang.String r3 = r1.poiId
            com.ss.android.ugc.aweme.poi.uiwidget.gallery.dishes.PoiDishesGalleryMobData r0 = r1.mobData
            if (r0 == 0) goto L3d
            java.lang.String r4 = r0.collectInfo
        Lf:
            com.ss.android.ugc.aweme.poi.uiwidget.gallery.dishes.PoiDishesGalleryMobData r0 = r1.mobData
            if (r0 == 0) goto L15
            java.lang.String r5 = r0.moduleName
        L15:
            java.util.List r0 = r11.getImages()
            if (r0 == 0) goto L3a
            java.lang.Object r0 = X.C13LP.LJJJLL(r0)
            if (r0 == 0) goto L3a
            r6 = 1
        L22:
            java.lang.String r7 = r11.getDishId()
            X.01GW r0 = r10.LLJJIII
            java.lang.Object r9 = r0.getValue()
            com.bytedance.android.btm.api.model.PageFinder r9 = (com.bytedance.android.btm.api.model.PageFinder) r9
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            r8.<init>()
            r2.getClass()
            X.C1185430gxB.LJJ(r3, r4, r5, r6, r7, r8, r9)
            return
        L3a:
            r6 = 0
            goto L22
        L3c:
            r3 = r5
        L3d:
            r4 = r5
            if (r1 == 0) goto L15
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.uiwidget.gallery.dishes.PoiDishesGalleryFragment.AP2(com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi$RecommendedDish):void");
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1185440gxC c1185440gxC = new C1185440gxC(getLifecycle(), null, false, new C1185050gwZ(PageFinder.via((Fragment) this)));
        this.LLJJ = c1185440gxC;
        c1185440gxC.LIZIZ(bundle);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C1185440gxC c1185440gxC = this.LLJJ;
        if (c1185440gxC != null) {
            bundle.putLong("play_time_in_current_page", c1185440gxC.LIZLLL);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    @Override // com.ss.android.ugc.aweme.poi.detail.gallery.PoiRecommendDishesGalleryAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v02(com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi.RecommendedDish r11) {
        /*
            r10 = this;
            X.0gxB r2 = X.C1185430gxB.LIZ
            X.0ggw r1 = r10.LLJJI
            r5 = 0
            if (r1 == 0) goto L3c
            java.lang.String r3 = r1.poiId
            com.ss.android.ugc.aweme.poi.uiwidget.gallery.dishes.PoiDishesGalleryMobData r0 = r1.mobData
            if (r0 == 0) goto L3d
            java.lang.String r4 = r0.collectInfo
        Lf:
            com.ss.android.ugc.aweme.poi.uiwidget.gallery.dishes.PoiDishesGalleryMobData r0 = r1.mobData
            if (r0 == 0) goto L15
            java.lang.String r5 = r0.moduleName
        L15:
            java.util.List r0 = r11.getImages()
            if (r0 == 0) goto L3a
            java.lang.Object r0 = X.C13LP.LJJJLL(r0)
            if (r0 == 0) goto L3a
            r6 = 1
        L22:
            java.lang.String r7 = r11.getDishId()
            X.01GW r0 = r10.LLJJIII
            java.lang.Object r9 = r0.getValue()
            com.bytedance.android.btm.api.model.PageFinder r9 = (com.bytedance.android.btm.api.model.PageFinder) r9
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            r8.<init>()
            r2.getClass()
            X.C1185430gxB.LJIIIZ(r3, r4, r5, r6, r7, r8, r9)
            return
        L3a:
            r6 = 0
            goto L22
        L3c:
            r3 = r5
        L3d:
            r4 = r5
            if (r1 == 0) goto L15
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.uiwidget.gallery.dishes.PoiDishesGalleryFragment.v02(com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi$RecommendedDish):void");
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.gallery.PoiRecommendDishesGalleryAbility
    public final void yv2(String str) {
        String str2;
        PoiDishesGalleryMobData poiDishesGalleryMobData;
        C1185430gxB c1185430gxB = C1185430gxB.LIZ;
        C1175360ggw c1175360ggw = this.LLJJI;
        if (c1175360ggw != null && (poiDishesGalleryMobData = c1175360ggw.mobData) != null) {
            str2 = poiDishesGalleryMobData.enterFrom;
        } else {
            str2 = null;
        }
        C1185430gxB.LJJIJL(c1185430gxB, str2, "click", C1558360qeg.LJFF(this, null), "poi_secondary_feature_page", "poi_recommend_dish", PageFinder.via((Fragment) this));
    }

    public final boolean SR(int i, ArrayList arrayList) {
        PoiGalleryAnchorData poiGalleryAnchorData;
        if (arrayList == null || i < 0 || i >= arrayList.size() || 1 == 0 || (poiGalleryAnchorData = (PoiGalleryAnchorData) ListProtector.get(arrayList, i)) == null || poiGalleryAnchorData.w <= 0 || poiGalleryAnchorData.h <= 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0230 A[PHI: r7 r8
      0x0230: PHI (r7v2 java.lang.String) = (r7v1 java.lang.String), (r7v6 java.lang.String) binds: [B:127:0x022d, B:116:0x0201] A[DONT_GENERATE, DONT_INLINE]
      0x0230: PHI (r8v1 java.lang.String) = (r8v0 java.lang.String), (r8v5 java.lang.String) binds: [B:127:0x022d, B:116:0x0201] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0234 A[PHI: r7 r8 r9
      0x0234: PHI (r7v3 java.lang.String) = (r7v2 java.lang.String), (r7v5 java.lang.String) binds: [B:130:0x0231, B:119:0x0207] A[DONT_GENERATE, DONT_INLINE]
      0x0234: PHI (r8v2 java.lang.String) = (r8v1 java.lang.String), (r8v4 java.lang.String) binds: [B:130:0x0231, B:119:0x0207] A[DONT_GENERATE, DONT_INLINE]
      0x0234: PHI (r9v1 java.lang.String) = (r9v0 java.lang.String), (r9v3 java.lang.String) binds: [B:130:0x0231, B:119:0x0207] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r22, android.os.Bundle r23) {
        /*
            Method dump skipped, instruction units count: 568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.uiwidget.gallery.dishes.PoiDishesGalleryFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.gallery.PoiRecommendDishesGalleryAbility
    public final void Gg(boolean z, C19HL c19hl, int i) {
        Integer num;
        ArrayList<PoiGalleryAnchorData> arrayList;
        C19GS c19gs;
        View view;
        PoiGalleryAnchorData poiGalleryAnchorData;
        C1175360ggw c1175360ggw = this.LLJJI;
        if (c1175360ggw != null) {
            num = c1175360ggw.index;
        } else {
            num = null;
        }
        if (i == C1175120ggY.LIZJ(num) && !this.LLJJIJI) {
            C1175360ggw c1175360ggw2 = this.LLJJI;
            if (c1175360ggw2 != null) {
                arrayList = c1175360ggw2.anchorDataArray;
            } else {
                arrayList = null;
            }
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            } else {
                c19gs = null;
            }
            if (c19gs != null) {
                if (z) {
                    if (SR(i, arrayList) && (view = this.LLJJJIL) != null) {
                        if (arrayList != null && (poiGalleryAnchorData = (PoiGalleryAnchorData) ListProtector.get(arrayList, i)) != null && poiGalleryAnchorData.w > 0 && poiGalleryAnchorData.h > 0) {
                            RectF rectFLJFF = C19HN.LJFF();
                            c19hl.LJI(rectFLJFF);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("tryDoStartAnimWithAnchor currentAnchor x: ");
                            sbLIZ.append(poiGalleryAnchorData.x);
                            sbLIZ.append(", y: ");
                            sbLIZ.append(poiGalleryAnchorData.y);
                            sbLIZ.append(", w: ");
                            sbLIZ.append(poiGalleryAnchorData.w);
                            sbLIZ.append(", h: ");
                            sbLIZ.append(poiGalleryAnchorData.h);
                            sbLIZ.append("; \n bound: x: ");
                            sbLIZ.append(rectFLJFF.left);
                            sbLIZ.append(", y: ");
                            sbLIZ.append(rectFLJFF.top);
                            sbLIZ.append(", w: ");
                            sbLIZ.append(rectFLJFF.width());
                            sbLIZ.append(", h: ");
                            sbLIZ.append(rectFLJFF.height());
                            C2188811AlT.LIZIZ(sbLIZ);
                            float fWidth = poiGalleryAnchorData.w / rectFLJFF.width();
                            float fHeight = poiGalleryAnchorData.h / rectFLJFF.height();
                            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            valueAnimatorOfFloat.setDuration(300L);
                            valueAnimatorOfFloat.addUpdateListener(new AUListenerS0S0300004_18(this, view, c19hl, (poiGalleryAnchorData.x + (poiGalleryAnchorData.w / 2)) - (rectFLJFF.left + (rectFLJFF.width() / 2)), ((poiGalleryAnchorData.y - C12ES.LJIIJJI(c19gs)) + (poiGalleryAnchorData.h / 2)) - (c19hl.getTop() + (c19hl.getHeight() / 2)), fWidth, fHeight, 1));
                            valueAnimatorOfFloat.start();
                        }
                    } else {
                        C1182990gtF.LIZ.getClass();
                        C1182990gtF.LIZJ(c19gs);
                    }
                } else {
                    C1182990gtF.LIZ.getClass();
                    C1182990gtF.LIZ(c19gs);
                }
            }
            this.LLJJIJI = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0055 A[PHI: r3 r4
      0x0055: PHI (r3v2 java.lang.String) = (r3v1 java.lang.String), (r3v5 java.lang.String) binds: [B:31:0x0052, B:10:0x0015] A[DONT_GENERATE, DONT_INLINE]
      0x0055: PHI (r4v1 java.lang.String) = (r4v0 java.lang.String), (r4v4 java.lang.String) binds: [B:31:0x0052, B:10:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.android.ugc.aweme.poi.detail.gallery.PoiRecommendDishesGalleryAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Ui2(int r11, X.C19HL r12, android.view.View r13) {
        /*
            r10 = this;
            boolean r0 = r10.LLJJIJIIJIL
            if (r0 == 0) goto L2d
            X.0gxB r2 = X.C1185430gxB.LIZ
            X.0ggw r1 = r10.LLJJI
            r6 = 0
            if (r1 == 0) goto L50
            java.lang.String r3 = r1.poiId
            com.ss.android.ugc.aweme.poi.uiwidget.gallery.dishes.PoiDishesGalleryMobData r0 = r1.mobData
            if (r0 == 0) goto L51
            java.lang.String r4 = r0.collectInfo
        L13:
            com.ss.android.ugc.aweme.poi.uiwidget.gallery.dishes.PoiDishesGalleryMobData r0 = r1.mobData
            if (r0 == 0) goto L55
            java.lang.String r5 = r0.moduleName
        L19:
            com.ss.android.ugc.aweme.poi.uiwidget.gallery.dishes.PoiDishesGalleryMobData r0 = r1.mobData
            if (r0 == 0) goto L1f
            java.lang.String r6 = r0.enterFrom
        L1f:
            r7 = 0
            X.01GW r0 = r10.LLJJIII
            java.lang.Object r8 = r0.getValue()
            com.bytedance.android.btm.api.model.PageFinder r8 = (com.bytedance.android.btm.api.model.PageFinder) r8
            r9 = 16
            X.C1185430gxB.LJJIL(r2, r3, r4, r5, r6, r7, r8, r9)
        L2d:
            r10.LLJJIJIL = r11
            r10.LLJJJ = r12
            r10.LLJJJIL = r13
            X.0hEP r1 = r10.LLJI
            if (r1 == 0) goto L46
            X.0ggw r0 = r10.LLJJI
            if (r0 == 0) goto L4e
            java.util.List<com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi$RecommendedDish> r0 = r0.images
            if (r0 == 0) goto L4e
            int r0 = r0.size()
        L43:
            r1.LJJJJJ(r11, r0)
        L46:
            X.0Ggj r0 = r10.LLIZLLLIL
            if (r0 == 0) goto L4d
            r0.setSelectedIndex(r11)
        L4d:
            return
        L4e:
            r0 = 0
            goto L43
        L50:
            r3 = r6
        L51:
            r4 = r6
            if (r1 == 0) goto L55
            goto L13
        L55:
            r5 = r6
            if (r1 == 0) goto L1f
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.uiwidget.gallery.dishes.PoiDishesGalleryFragment.Ui2(int, X.19HL, android.view.View):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.e44, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
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
