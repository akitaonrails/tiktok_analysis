package com.ss.android.ugc.gamora.editor.audio.copyrightdetect.base;

import X.C098200Yq;
import X.C0OM1;
import X.C1251150ifB;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C389650FPn;
import X.C431260Gvc;
import X.C444940Hca;
import X.C786410Ut5;
import X.C895590ZBl;
import X.InterfaceC344240DeY;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.audio.copyrightdetect.PreCheckResult;
import com.ss.android.ugc.aweme.creative.model.audio.MatchDetail;
import com.ss.android.ugc.aweme.creative.model.audio.MatchDetailsV1;
import com.ss.android.ugc.aweme.creative.model.audio.MatchPeriod;
import com.ss.android.ugc.aweme.creative.model.audio.MusicInfo;
import com.ss.android.ugc.aweme.creative.model.audio.SongInfo;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes15.dex */
public final class AudioCopyrightLearnMoreFragment extends BaseFragment implements InterfaceC344240DeY {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiItJCAhKWspLSYnJzdiKDo3ISpiKiAjMTclLiHELIOScnLCA4LCwnZictOip9CTAoICAQJzU1OyY0IDEALC4hJggjOyoVOiQrJCo9PA==";
    public final Context LLIZ;
    public final PreCheckResult LLIZLLLIL;
    public final boolean LLJ;
    public final int LLJI;
    public final boolean LLJIJIL;

    static {
        new C895590ZBl();
    }

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_chevron_left_ltr;
        c1251150ifB.LIZLLL = true;
        c1251150ifB.LIZJ(new AwS558S0100000_14(this, 1169));
        c0om1.LJ(c1251150ifB);
        return c0om1;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String quantityString;
        String str;
        super.onViewCreated(view, bundle);
        ((TextView) view.findViewById(R.id.ji8)).setText(this.LLIZ.getResources().getQuantityString(2131755660, this.LLJI));
        TextView textView = (TextView) view.findViewById(R.id.fog);
        if (this.LLJ) {
            quantityString = this.LLIZ.getResources().getQuantityString(2131755661, this.LLJI);
        } else {
            quantityString = this.LLIZ.getResources().getQuantityString(2131755662, this.LLJI);
        }
        textView.setText(quantityString);
        TextView textView2 = (TextView) view.findViewById(R.id.foh);
        if (this.LLJ) {
            String string = this.LLIZ.getString(2131857854);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C786410Ut5.j4(this.LLIZ.getString(2131857853), Arrays.copyOf(new Object[]{string}, 1)));
            int iLJJJ = a0.LJJJ(spannableStringBuilder, string, 0, false, 6);
            if (iLJJJ >= 0) {
                int length = string.length() + iLJJJ;
                Context context = this.LLIZ;
                C444940Hca c444940Hca = new C444940Hca();
                c444940Hca.LIZJ(2131857854);
                c444940Hca.LIZLLL(5);
                c444940Hca.LIZIZ = false;
                c444940Hca.LIZIZ(41);
                c444940Hca.LJIIIIZZ = new AwS553S0100000_9(context, 1775);
                spannableStringBuilder.replace(iLJJJ, length, c444940Hca.LIZ(context));
            }
            textView2.setText(spannableStringBuilder);
            textView2.setMovementMethod(C431260Gvc.LIZ);
        } else {
            textView2.setText(this.LLIZ.getString(2131846192));
        }
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.fm2);
        if (this.LLJIJIL) {
            ArrayList<MatchDetailsV1> arrayList = this.LLIZLLLIL.matchDetailsV1;
            if (arrayList != null) {
                for (MatchDetailsV1 matchDetailsV1 : arrayList) {
                    SongInfo songInfo = matchDetailsV1.matchSongInfo;
                    if (songInfo == null || (str = songInfo.name) == null) {
                        str = "";
                    }
                    ArrayList<MatchPeriod> arrayList2 = matchDetailsV1.matchPeriods;
                    if (arrayList2 != null) {
                        for (MatchPeriod matchPeriod : arrayList2) {
                            String strLIZ = C389650FPn.LIZ(((int) matchPeriod.startOffset) * LSPassThroughRecordSizeConfig.DEFAULT);
                            String strLIZ2 = C389650FPn.LIZ((((int) matchPeriod.startOffset) + ((int) matchPeriod.matchDuration)) * LSPassThroughRecordSizeConfig.DEFAULT);
                            TuxTextView tuxTextView = new TuxTextView(this.LLIZ, null, 6, 0);
                            tuxTextView.setText(this.LLIZ.getString(2131846191, str, strLIZ, strLIZ2));
                            tuxTextView.setTuxFont(42);
                            viewGroup.addView(tuxTextView);
                        }
                    }
                }
                return;
            }
            return;
        }
        HashMap map = new HashMap();
        ArrayList<MusicInfo> arrayList3 = this.LLIZLLLIL.musicInfos;
        if (arrayList3 != null) {
            for (MusicInfo musicInfo : arrayList3) {
                map.put(Long.valueOf(musicInfo.id), musicInfo.name);
            }
        }
        ArrayList<MatchDetail> arrayList4 = this.LLIZLLLIL.matchDetails;
        if (arrayList4 != null) {
            for (MatchDetail matchDetail : arrayList4) {
                if (map.containsKey(Long.valueOf(matchDetail.musicId))) {
                    TuxTextView tuxTextView2 = new TuxTextView(this.LLIZ, null, 6, 0);
                    String str2 = (String) map.get(Long.valueOf(matchDetail.musicId));
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                    spannableStringBuilder2.append((CharSequence) str2);
                    spannableStringBuilder2.append((CharSequence) ": ");
                    spannableStringBuilder2.append((CharSequence) C389650FPn.LIZ(((int) matchDetail.start) * LSPassThroughRecordSizeConfig.DEFAULT));
                    spannableStringBuilder2.append((CharSequence) " to ");
                    spannableStringBuilder2.append((CharSequence) C389650FPn.LIZ(((int) (matchDetail.start + matchDetail.duration)) * LSPassThroughRecordSizeConfig.DEFAULT));
                    tuxTextView2.setText(spannableStringBuilder2);
                    tuxTextView2.setTuxFont(42);
                    viewGroup.addView(tuxTextView2);
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.bm_, viewGroup, false);
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

    public AudioCopyrightLearnMoreFragment(Context context, PreCheckResult preCheckResult, boolean z, int i, boolean z2) {
        this.LLIZ = context;
        this.LLIZLLLIL = preCheckResult;
        this.LLJ = z;
        this.LLJI = i;
        this.LLJIJIL = z2;
    }
}
