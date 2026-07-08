package com.ss.android.ugc.aweme.prop.mobileefffect.hint;

import X.AbstractC21673619ry;
import X.C01GW;
import X.C098200Yq;
import X.C0OM1;
import X.C1251150ifB;
import X.C13BV;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C21341918fZ;
import X.C21342318fd;
import X.C446260Hei;
import X.C446280Hek;
import X.C446290Hel;
import X.C452501pT;
import X.C455090Hsx;
import X.C786410Ut5;
import X.EnumC035300Al;
import X.InterfaceC344240DeY;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.effectcreator.experiments.EdpIconEditHintImgConfig;
import com.zhiliaoapp.musically.R;
import irm.AkS78S0100000_6;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class EffectIconAutoApplyHintFragment extends Fragment implements InterfaceC344240DeY {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjU+Jj99JSouICM2LSMqLyHELIOSowPGskICEnZgAqLyowPAwvJiESPTEjCD8jJDwEICEnDjctLiI2JjE=";
    public TuxTextView LL;
    public RecyclerView LLILLJJLI;
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(117));

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
        c1251150ifB.LIZLLL = true;
        c1251150ifB.LIZJ(new AwS550S0100000_6(this, 529));
        c0om1.LIZIZ(c1251150ifB);
        return c0om1;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            arguments.getInt("key_hint_type");
        } else {
            EnumC035300Al.HINT_TYPE_NAME.getTypeVal();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        List list;
        String string;
        super.onViewCreated(view, bundle);
        this.LL = (TuxTextView) view.findViewById(R.id.tv_title);
        this.LLILLJJLI = (RecyclerView) view.findViewById(R.id.tua);
        View viewFindViewById = view.findViewById(R.id.cna);
        if (viewFindViewById != null) {
            C786410Ut5.I7(new AkS78S0100000_6(this, 23), viewFindViewById);
        }
        View viewFindViewById2 = view.findViewById(R.id.cwi);
        if (viewFindViewById2 != null) {
            C786410Ut5.I7(new AkS78S0100000_6(this, 24), viewFindViewById2);
        }
        Context context = getContext();
        if (context == null) {
            list = C13BV.INSTANCE;
        } else {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            EdpIconEditHintImgConfig edpIconEditHintImgConfig = C455090Hsx.LIZ;
            EdpIconEditHintImgConfig edpIconEditHintImgConfig2 = (EdpIconEditHintImgConfig) settingsManagerLIZLLL.LJIIIIZZ("ame_icon_guide_image_urls", EdpIconEditHintImgConfig.class, edpIconEditHintImgConfig);
            if (edpIconEditHintImgConfig2 != null) {
                edpIconEditHintImgConfig = edpIconEditHintImgConfig2;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C446280Hek(edpIconEditHintImgConfig.femaleIcon, edpIconEditHintImgConfig.maleIcon, context.getString(2131821250)));
            String str = edpIconEditHintImgConfig.petIcon;
            arrayList.add(new C446280Hek(str, str, context.getString(2131821249)));
            list = arrayList;
        }
        C446260Hei c446260Hei = (C446260Hei) this.LLILLL.getValue();
        c446260Hei.getClass();
        C21341918fZ c21341918fZLIZ = C21342318fd.LIZ(new C446290Hel(c446260Hei, list), true);
        ((ArrayList) c446260Hei.LL).clear();
        ((ArrayList) c446260Hei.LL).addAll(list);
        c21341918fZLIZ.LIZJ(c446260Hei);
        TuxTextView tuxTextView = this.LL;
        if (tuxTextView != null) {
            Context context2 = getContext();
            if (context2 == null || (string = context2.getString(2131821251)) == null) {
                string = "";
            }
            tuxTextView.setText(string);
        }
        RecyclerView recyclerView = this.LLILLJJLI;
        if (recyclerView != null) {
            recyclerView.setAdapter((AbstractC21673619ry) this.LLILLL.getValue());
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.d42, viewGroup, false);
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
}
