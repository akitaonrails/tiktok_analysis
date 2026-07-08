package com.ss.android.ugc.aweme.search.lynx.spark.core.ui;

import X.AbstractC1542100qES;
import X.AbstractC648910Pcn;
import X.AbstractC649370PdX;
import X.AbstractC649410Pdb;
import X.C0BQ0;
import X.C0PZI;
import X.C19719612Di;
import X.C2188811AlT;
import X.C646000PVm;
import X.C648850Pch;
import X.C650950Pg5;
import X.C650960Pg6;
import X.C664000Q2s;
import X.C667750QHd;
import X.C786410Ut5;
import X.C830490Whz;
import X.InterfaceC420801kM;
import X.InterfaceC649280PdO;
import X.InterfaceC663910Q2j;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public abstract class SearchBaseSparkView implements C0PZI {
    public final Fragment LIZ;
    public final Context LIZIZ;
    public final LifecycleOwner LIZJ;
    public C648850Pch LIZLLL;
    public AbstractC1542100qES LJ;
    public AbstractC649410Pdb LJFF;
    public final C830490Whz<String, JSONObject> LJI;
    public final ArrayList<Object> LJII;
    public final ArrayList<AbstractC649370PdX> LJIIIIZZ;
    public final ArrayList<AbstractC648910Pcn> LJIIIZ;
    public final ArrayList<InterfaceC420801kM> LJIIJ;
    public DynamicPatch LJIIJJI;
    public InterfaceC649280PdO LJIIL;

    public final void LJIIIIZZ() {
        this.LJI.clear();
        this.LJII.clear();
    }

    @Override // X.C0PZI
    public final void LIZJ(String str) {
        if (this.LIZLLL != null) {
            AbstractC649410Pdb abstractC649410Pdb = this.LJFF;
            if (abstractC649410Pdb != null) {
                abstractC649410Pdb.LIZIZ(str);
            }
            C648850Pch c648850Pch = this.LIZLLL;
            if (c648850Pch != null) {
                c648850Pch.LIZLLL(str);
            }
            AbstractC649410Pdb abstractC649410Pdb2 = this.LJFF;
            if (abstractC649410Pdb2 != null) {
                abstractC649410Pdb2.LIZ(str);
                return;
            }
            return;
        }
        this.LJII.add(str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateData:");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C0PZI
    public final void LIZLLL(TemplateData templateData) {
        if (this.LIZLLL != null) {
            AbstractC649410Pdb abstractC649410Pdb = this.LJFF;
            if (abstractC649410Pdb != null) {
                abstractC649410Pdb.LIZIZ(templateData);
            }
            C648850Pch c648850Pch = this.LIZLLL;
            if (c648850Pch != null) {
                c648850Pch.LIZIZ(templateData);
            }
            AbstractC649410Pdb abstractC649410Pdb2 = this.LJFF;
            if (abstractC649410Pdb2 != null) {
                abstractC649410Pdb2.LIZ(templateData);
            }
            C667750QHd c667750QHd = new C667750QHd();
            System.currentTimeMillis();
            c667750QHd.LIZ(new InterfaceC663910Q2j() { // from class: X.0Pda
            });
            return;
        }
        this.LJII.add(templateData);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateData:");
        sbLIZ.append(templateData);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LJI(AbstractC649370PdX... abstractC649370PdXArr) {
        C19719612Di.LJJII(this.LJIIIIZZ, abstractC649370PdXArr);
    }

    public final void LJII(C830490Whz c830490Whz) {
        String str;
        C664000Q2s c664000Q2s;
        String str2;
        C664000Q2s c664000Q2s2;
        C646000PVm c646000PVm = C650950Pg5.Companion;
        Fragment fragment = this.LIZ;
        LifecycleOwner lifecycleOwner = this.LIZJ;
        c646000PVm.getClass();
        C650960Pg6 c650960Pg6LJII = C646000PVm.LJII(fragment, lifecycleOwner);
        String str3 = "";
        if (c650960Pg6LJII == null || (c664000Q2s2 = c650960Pg6LJII.searchCommonModel) == null || (str = c664000Q2s2.enterFrom) == null) {
            str = "";
        }
        c830490Whz.put("search_entrance", str);
        Fragment fragment2 = this.LIZ;
        LifecycleOwner lifecycleOwner2 = this.LIZJ;
        c646000PVm.getClass();
        C650960Pg6 c650960Pg6LJII2 = C646000PVm.LJII(fragment2, lifecycleOwner2);
        if (c650960Pg6LJII2 != null && (c664000Q2s = c650960Pg6LJII2.searchCommonModel) != null && (str2 = c664000Q2s.enterFrom) != null) {
            str3 = str2;
        }
        c830490Whz.put("searchEntrance", str3);
    }

    @Override // X.C0PZI
    public final void sendEvent(String str, JSONObject jSONObject) {
        C648850Pch c648850Pch = this.LIZLLL;
        if (c648850Pch != null) {
            c648850Pch.LIZ(str, jSONObject);
            return;
        }
        this.LJI.put(str, jSONObject);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sendEvent:");
        sbLIZ.append(str);
        sbLIZ.append(' ');
        sbLIZ.append(jSONObject);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public SearchBaseSparkView(Fragment fragment, Context context, LifecycleOwner lifecycleOwner) {
        Lifecycle lifecycle;
        this.LIZ = fragment;
        this.LIZIZ = context;
        this.LIZJ = lifecycleOwner;
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.search.lynx.spark.core.ui.SearchBaseSparkView.1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        C648850Pch c648850Pch = SearchBaseSparkView.this.LIZLLL;
                        if (c648850Pch != null) {
                            if (((Number) C0BQ0.LIZ.getValue()).intValue() == 1) {
                                c648850Pch.LIZ.LLD(true);
                            } else {
                                c648850Pch.LIZ.LLD(true);
                            }
                        }
                        for (InterfaceC420801kM interfaceC420801kM : SearchBaseSparkView.this.LJIIJ) {
                            if (!interfaceC420801kM.isDisposed()) {
                                interfaceC420801kM.dispose();
                            }
                        }
                    }
                }
            });
        }
        this.LJI = new C830490Whz<>();
        this.LJII = new ArrayList<>();
        this.LJIIIIZZ = new ArrayList<>();
        this.LJIIIZ = new ArrayList<>();
        this.LJIIJ = new ArrayList<>();
    }

    @Override // X.C0PZI
    public final void LIZ(int i, ViewGroup.LayoutParams layoutParams, ViewGroup viewGroup) {
        ViewParent parent;
        View viewLIZIZ = LIZIZ();
        if (viewLIZIZ != null) {
            parent = viewLIZIZ.getParent();
        } else {
            parent = null;
        }
        if (!Intrinsics.LJFF(parent, viewGroup)) {
            if (parent != null) {
                C786410Ut5.LJJJLZIJ(viewLIZIZ, (ViewGroup) parent);
            }
            viewGroup.addView(viewLIZIZ, i, layoutParams);
        }
    }
}
