package com.ss.android.ugc.aweme.music.ui.artistprofile;

import X.C098200Yq;
import X.C0OM1;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C419910GdJ;
import X.C630940Oou;
import X.C723850SaN;
import X.C786410Ut5;
import X.InterfaceC344240DeY;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.UncertMusicOwnerInfo;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class ArtistProfileTuxSheetFragment extends Fragment implements InterfaceC344240DeY {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2Zig5OiYwZjAlZy4hPCw/HELIOSPT8hJyMlJSp9CTc4IDwnGDcjLyY/LRE5MRw7LSA4Dz0yLygpJzs=";
    public boolean LL;

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        C1251150ifB c1251150ifB = new C1251150ifB();
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_x_mark_small;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
        c1251150ifB.LIZLLL();
        c1251150ifB.LJ = c419910GdJ;
        c1251150ifB.LIZJ(new AwS553S0100000_9(this, 1191));
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = getString(this.LL ? 2131837722 : 2131837767);
        C0OM1 c0om1 = new C0OM1();
        c0om1.LIZJ = c1250250idj;
        c0om1.LIZIZ(c1251150ifB);
        return c0om1;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Serializable serializable;
        Aweme aweme;
        Serializable serializable2;
        Music music;
        String string;
        String string2;
        boolean z;
        int i;
        int i2;
        boolean z2;
        String string3;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            serializable = arguments.getSerializable("extra_aweme");
        } else {
            serializable = null;
        }
        if (serializable instanceof Aweme) {
            aweme = (Aweme) serializable;
        } else {
            aweme = null;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            serializable2 = arguments2.getSerializable("extra_music");
        } else {
            serializable2 = null;
        }
        if (serializable2 instanceof Music) {
            music = (Music) serializable2;
        } else {
            music = null;
        }
        Bundle arguments3 = getArguments();
        String str = "";
        if (arguments3 == null || (string = arguments3.getString("extra_artist_profile", "")) == null) {
            string = "";
        }
        List listLIZJ = JsonParseUtils.LIZJ(UncertMusicOwnerInfo.class, string);
        Bundle arguments4 = getArguments();
        if (arguments4 == null || (string2 = arguments4.getString("extra_enter_type", "")) == null) {
            string2 = "";
        }
        Bundle arguments5 = getArguments();
        if (arguments5 != null && (string3 = arguments5.getString("extra_enter_method", "")) != null) {
            str = string3;
        }
        Bundle arguments6 = getArguments();
        if (arguments6 != null) {
            z = arguments6.getBoolean("extra_show_follow_btn", false);
        } else {
            z = false;
        }
        Bundle arguments7 = getArguments();
        if (arguments7 != null) {
            i = arguments7.getInt("extra_artist_label", 0);
        } else {
            i = 0;
        }
        Bundle arguments8 = getArguments();
        if (arguments8 != null) {
            i2 = arguments8.getInt("extra_behind_the_song_video_type", 0);
        } else {
            i2 = 0;
        }
        Bundle arguments9 = getArguments();
        if (arguments9 != null) {
            z2 = arguments9.getBoolean("extra_is_from_music_credits", false);
        } else {
            z2 = false;
        }
        this.LL = z2;
        C723850SaN.LIZ(this, false, null, new C630940Oou(this, aweme, music, listLIZJ, string2, str, z, i, i2, view), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.dq2, viewGroup, false);
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
