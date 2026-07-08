package com.ss.android.ugc.aweme.compliance.business.search.feedback;

import X.AbstractC21673619ry;
import X.C01GW;
import X.C098200Yq;
import X.C0I7D;
import X.C0OM1;
import X.C1251150ifB;
import X.C1391190mJ3;
import X.C1685300txQ;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C20684815ws;
import X.C2344009Gk;
import X.C343980De8;
import X.C452501pT;
import X.C747610TUh;
import X.C786410Ut5;
import X.InterfaceC344240DeY;
import Y.ACListenerS113S0200000_9;
import Y.ACListenerS116S0200000_12;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.ss.android.ugc.aweme.compliance.business.search.feedback.SearchAidFeedbackFragment;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class SearchAidFeedbackFragment extends Fragment implements InterfaceC344240DeY {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJD8/ISQiKip9KjA/ICE2OzHELIOSZiOioyOiYkZyk2LSEuKCw4ZhYpKD0wIAQlLQk2LSEuKCw4DjctLiI2JjE=";
    public C197039127h LL;
    public C0I7D LLILLJJLI;
    public TuxTextView LLILLL;
    public TuxTextView LLILZ;
    public TuxTextView LLILZIL;
    public TuxTextView LLILZLL;
    public TuxTextView LLIZ;
    public TuxIconView LLIZLLLIL;
    public RecyclerView LLJ;
    public LinearLayout LLJI;
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 408));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 411));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS556S0100000_12(this, 406));
    public final C01GW LLJILLL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 403));
    public final C01GW LLJJ = C452501pT.LIZIZ(new AwS556S0100000_12(this, 404));
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS556S0100000_12(this, 410));
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS556S0100000_12(this, 405));
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS556S0100000_12(this, 407));
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 409));

    public final QuestionData MR() {
        return (QuestionData) this.LLJJIII.getValue();
    }

    public final C197039127h NR() {
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.whe) : null;
            this.LL = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
        c1251150ifB.LIZJ(new AwS553S0100000_9(this, 74));
        c0om1.LIZIZ(c1251150ifB);
        return c0om1;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        MutableLiveData<Boolean> mutableLiveData;
        super.onDestroy();
        SearchStateViewModel searchStateViewModel = (SearchStateViewModel) this.LLJJIJIIJIL.getValue();
        if (searchStateViewModel == null || (mutableLiveData = searchStateViewModel.shouldBlockMediaPlay) == null) {
            return;
        }
        mutableLiveData.setValue(Boolean.FALSE);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
        this.LLILZLL = null;
        this.LLIZ = null;
        this.LLIZLLLIL = null;
        this.LLJ = null;
        this.LLJI = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Object parent;
        String str;
        String str2;
        String str3;
        String str4;
        MutableLiveData<Boolean> mutableLiveData;
        View view2;
        View viewFindViewById;
        ViewParent parent2;
        ViewParent parent3;
        ViewParent parent4;
        ViewParent parent5;
        super.onViewCreated(view, bundle);
        ViewParent parent6 = view.getParent();
        View viewFindViewById2 = null;
        if (parent6 != null && (parent2 = parent6.getParent()) != null && (parent3 = parent2.getParent()) != null && (parent4 = parent3.getParent()) != null && (parent5 = parent4.getParent()) != null) {
            parent = parent5.getParent();
        } else {
            parent = null;
        }
        if ((parent instanceof View) && (view2 = (View) parent) != null && (viewFindViewById = view2.findViewById(R.id.yg_)) != null) {
            C786410Ut5.I7(new ACListenerS113S0200000_9(this, view, 10), viewFindViewById);
        }
        if (MR() == null) {
            String str5 = TuxSheet._pnsPageId;
            C1391190mJ3.LJFF(this, C343980De8.LIZ);
            return;
        }
        SearchStateViewModel searchStateViewModel = (SearchStateViewModel) this.LLJJIJIIJIL.getValue();
        if (searchStateViewModel != null && (mutableLiveData = searchStateViewModel.shouldBlockMediaPlay) != null) {
            mutableLiveData.setValue(Boolean.TRUE);
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("search_id", (String) this.LLJIJIL.getValue());
        c2344009Gk.LJIIIIZZ("channel", (String) this.LLJILLL.getValue());
        c2344009Gk.LJIIIIZZ("search_aid_issue_name", (String) this.LLJJ.getValue());
        c2344009Gk.LJIIIIZZ("survey_source_page", (String) this.LLJJI.getValue());
        C20684815ws.LJIILLIIL("survey_page_display", c2344009Gk.LIZ);
        C197039127h c197039127hNR = NR();
        C786410Ut5.U8(c197039127hNR, new ACListenerS116S0200000_12(this, c197039127hNR, 35));
        View viewFindViewById3 = this.LLILLL;
        if (viewFindViewById3 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById3 = view3.findViewById(R.id.title);
            } else {
                viewFindViewById3 = null;
            }
            this.LLILLL = (TuxTextView) viewFindViewById3;
        }
        TextView textView = (TextView) viewFindViewById3;
        QuestionData questionDataMR = MR();
        if (questionDataMR != null) {
            str = questionDataMR.title;
        } else {
            str = null;
        }
        textView.setText(str);
        View viewFindViewById4 = this.LLILZ;
        if (viewFindViewById4 == null) {
            View view4 = getView();
            if (view4 != null) {
                viewFindViewById4 = view4.findViewById(R.id.desc);
            } else {
                viewFindViewById4 = null;
            }
            this.LLILZ = (TuxTextView) viewFindViewById4;
        }
        TextView textView2 = (TextView) viewFindViewById4;
        QuestionData questionDataMR2 = MR();
        if (questionDataMR2 != null) {
            str2 = questionDataMR2.desc;
        } else {
            str2 = null;
        }
        textView2.setText(str2);
        View viewFindViewById5 = this.LLILZIL;
        if (viewFindViewById5 == null) {
            View view5 = getView();
            if (view5 != null) {
                viewFindViewById5 = view5.findViewById(R.id.jok);
            } else {
                viewFindViewById5 = null;
            }
            this.LLILZIL = (TuxTextView) viewFindViewById5;
        }
        TextView textView3 = (TextView) viewFindViewById5;
        QuestionData questionDataMR3 = MR();
        if (questionDataMR3 != null) {
            str3 = questionDataMR3.hint;
        } else {
            str3 = null;
        }
        textView3.setText(str3);
        View viewFindViewById6 = this.LLILLJJLI;
        if (viewFindViewById6 == null) {
            View view6 = getView();
            if (view6 != null) {
                viewFindViewById6 = view6.findViewById(R.id.kp9);
            } else {
                viewFindViewById6 = null;
            }
            this.LLILLJJLI = (C0I7D) viewFindViewById6;
        }
        final C0I7D c0i7d = (C0I7D) viewFindViewById6;
        QuestionData questionDataMR4 = MR();
        if (questionDataMR4 != null) {
            str4 = questionDataMR4.placeholder;
        } else {
            str4 = null;
        }
        c0i7d.setHint(str4);
        c0i7d.addTextChangedListener(new TextWatcher() { // from class: X.0TUj
            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                int length;
                int iIntValue;
                boolean z = false;
                if (editable != null) {
                    length = editable.length();
                } else {
                    length = 0;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(length);
                sbLIZ.append("/500");
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                View viewFindViewById7 = null;
                if (length > 500) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strLIZIZ);
                    Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zs, c0i7d.getContext());
                    if (numLIZJ != null) {
                        iIntValue = numLIZJ.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(iIntValue), 0, String.valueOf(length).length(), 18);
                    SearchAidFeedbackFragment searchAidFeedbackFragment = this;
                    View viewFindViewById8 = searchAidFeedbackFragment.LLILZLL;
                    if (viewFindViewById8 == null) {
                        View view7 = searchAidFeedbackFragment.getView();
                        if (view7 != null) {
                            viewFindViewById8 = view7.findViewById(R.id.words_count);
                        } else {
                            viewFindViewById8 = null;
                        }
                        searchAidFeedbackFragment.LLILZLL = (TuxTextView) viewFindViewById8;
                    }
                    ((TextView) viewFindViewById8).setText(spannableStringBuilder);
                    SearchAidFeedbackFragment searchAidFeedbackFragment2 = this;
                    View viewFindViewById9 = searchAidFeedbackFragment2.LLIZ;
                    if (viewFindViewById9 == null) {
                        View view8 = searchAidFeedbackFragment2.getView();
                        if (view8 != null) {
                            viewFindViewById9 = view8.findViewById(R.id.hb9);
                        } else {
                            viewFindViewById9 = null;
                        }
                        searchAidFeedbackFragment2.LLIZ = (TuxTextView) viewFindViewById9;
                    }
                    C786410Ut5.LLLLZLL((TuxTextView) viewFindViewById9, 0);
                    SearchAidFeedbackFragment searchAidFeedbackFragment3 = this;
                    View view9 = searchAidFeedbackFragment3.LLIZLLLIL;
                    if (view9 == null) {
                        View view10 = searchAidFeedbackFragment3.getView();
                        if (view10 != null) {
                            viewFindViewById7 = view10.findViewById(R.id.hbb);
                        }
                        searchAidFeedbackFragment3.LLIZLLLIL = (TuxIconView) viewFindViewById7;
                        view9 = viewFindViewById7;
                    }
                    C786410Ut5.LLLLLLZZ((TuxIconView) view9, 0);
                    this.NR().setEnabled(false);
                    return;
                }
                SearchAidFeedbackFragment searchAidFeedbackFragment4 = this;
                View viewFindViewById10 = searchAidFeedbackFragment4.LLILZLL;
                if (viewFindViewById10 == null) {
                    View view11 = searchAidFeedbackFragment4.getView();
                    if (view11 != null) {
                        viewFindViewById10 = view11.findViewById(R.id.words_count);
                    } else {
                        viewFindViewById10 = null;
                    }
                    searchAidFeedbackFragment4.LLILZLL = (TuxTextView) viewFindViewById10;
                }
                ((TextView) viewFindViewById10).setText(strLIZIZ);
                SearchAidFeedbackFragment searchAidFeedbackFragment5 = this;
                View viewFindViewById11 = searchAidFeedbackFragment5.LLIZ;
                if (viewFindViewById11 == null) {
                    View view12 = searchAidFeedbackFragment5.getView();
                    if (view12 != null) {
                        viewFindViewById11 = view12.findViewById(R.id.hb9);
                    } else {
                        viewFindViewById11 = null;
                    }
                    searchAidFeedbackFragment5.LLIZ = (TuxTextView) viewFindViewById11;
                }
                C786410Ut5.LLLLZLL((TuxTextView) viewFindViewById11, 4);
                SearchAidFeedbackFragment searchAidFeedbackFragment6 = this;
                View view13 = searchAidFeedbackFragment6.LLIZLLLIL;
                if (view13 == null) {
                    View view14 = searchAidFeedbackFragment6.getView();
                    if (view14 != null) {
                        viewFindViewById7 = view14.findViewById(R.id.hbb);
                    }
                    searchAidFeedbackFragment6.LLIZLLLIL = (TuxIconView) viewFindViewById7;
                    view13 = viewFindViewById7;
                }
                C786410Ut5.LLLLLLZZ((TuxIconView) view13, 4);
                C197039127h c197039127hNR2 = this.NR();
                if (((C747610TUh) this.LLJJIJI.getValue()).LLILLJJLI > 0) {
                    z = true;
                }
                c197039127hNR2.setEnabled(z);
            }
        });
        View view7 = this.LLJ;
        if (view7 == null) {
            View view8 = getView();
            if (view8 != null) {
                viewFindViewById2 = view8.findViewById(R.id.ms4);
            }
            this.LLJ = (RecyclerView) viewFindViewById2;
            view7 = viewFindViewById2;
        }
        RecyclerView recyclerView = (RecyclerView) view7;
        FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(recyclerView.getContext(), 0);
        flexboxLayoutManager.LJJII(1);
        flexboxLayoutManager.LJJIFFI(0);
        flexboxLayoutManager.LJJI(4);
        flexboxLayoutManager.LJJIII(0);
        recyclerView.setLayoutManager(flexboxLayoutManager);
        recyclerView.setAdapter((AbstractC21673619ry) this.LLJJIJI.getValue());
        ((C747610TUh) this.LLJJIJI.getValue()).LLILLL = new AwS591S0100000_12(this, 602);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.bcd, viewGroup, false);
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
