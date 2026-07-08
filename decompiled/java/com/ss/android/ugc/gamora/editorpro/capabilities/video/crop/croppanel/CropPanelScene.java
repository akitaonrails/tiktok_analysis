package com.ss.android.ugc.gamora.editorpro.capabilities.video.crop.croppanel;

import X.AbstractC1664490tPr;
import X.C0E47;
import X.C2217381BqS;
import X.C376160Eow;
import X.C376180Eoy;
import X.C376210Ep1;
import X.C376230Ep3;
import X.C786410Ut5;
import X.EnumC375190EnN;
import X.InterfaceC376240Ep4;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: loaded from: classes6.dex */
public final class CropPanelScene extends AbstractC1664490tPr<C376210Ep1, C376230Ep3> {
    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        RecyclerView recyclerView;
        super.onViewCreated(view, bundle);
        if (!C0E47.LIZ()) {
            return;
        }
        C376160Eow c376160Eow = new C376160Eow(view.getContext());
        if ((view instanceof RecyclerView) && (recyclerView = (RecyclerView) view) != null) {
            final Context context = recyclerView.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(context) { // from class: com.ss.android.ugc.gamora.editorpro.capabilities.video.crop.croppanel.CropPanelScene$onViewCreated$1$1
                @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
                public final boolean canScrollHorizontally() {
                    return false;
                }
            });
            recyclerView.setAdapter(c376160Eow);
        }
        Context context2 = view.getContext();
        ArrayList<C376180Eoy> arrayList = c376160Eow.LLILLJJLI;
        arrayList.clear();
        arrayList.add(new C376180Eoy(context2.getString(2131833366), EnumC375190EnN.FREE));
        arrayList.add(new C376180Eoy("9:16", EnumC375190EnN.MODE_9_16));
        arrayList.add(new C376180Eoy("16:9", EnumC375190EnN.MODE_16_9));
        arrayList.add(new C376180Eoy("1:1", EnumC375190EnN.MODE_1_1));
        arrayList.add(new C376180Eoy("3:4", EnumC375190EnN.MODE_3_4));
        arrayList.add(new C376180Eoy("4:3", EnumC375190EnN.MODE_4_3));
        c376160Eow.notifyDataSetChanged();
        c376160Eow.LLILLL = new InterfaceC376240Ep4() { // from class: X.0Eoz
            @Override // X.InterfaceC376240Ep4
            public final boolean LIZ(EnumC375190EnN enumC375190EnN, boolean z) {
                if (!this.LIZ.LLLLILI().LIZ.LIZIZ) {
                    return false;
                }
                this.LIZ.LLLLIL().LIZ.invoke(enumC375190EnN, Boolean.valueOf(z));
                return true;
            }
        };
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0Ep0
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C376210Ep1) obj).LIZ;
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(c376160Eow, 610));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (!C0E47.LIZ()) {
            return new FrameLayout(requireSceneContext());
        }
        RecyclerView recyclerView = new RecyclerView(requireSceneContext());
        C786410Ut5.p6(recyclerView, new FrameLayout.LayoutParams(-1, -1));
        recyclerView.setHasFixedSize(true);
        return recyclerView;
    }
}
