package com.bytedance.ies.ugc.aweme.commercialize.compliance.adchoice;

import X.C0TRW;
import X.C197039127h;
import X.C20684815ws;
import X.C2344009Gk;
import X.C786410Ut5;
import Y.ACListenerS147S0100000_12;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.datamodel.ChooseYourExperienceStruct;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class ChooseYourExperienceFragment extends BaseAdChoiceFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWslLDx9PSIvZy4kLSgpZyw8JSgpOyw6KSklMyp9KyohHELIOSOSM6KSsvLGEyLCYkJiYwLWsPISA8OyAVJjohDT08LD06LSsvLAkhKSIhLCEn";
    public TuxTextView LLILZIL;
    public TuxTextView LLILZLL;
    public TuxTextView LLIZ;
    public TuxTextView LLIZLLLIL;
    public C197039127h LLJ;
    public TuxTextView LLJI;
    public TuxTextView LLJIJIL;
    public TuxTextView LLJILJIL;
    public C197039127h LLJILJILJ;
    public TuxTextView LLJILLL;
    public TuxTextView LLJJ;
    public C197039127h LLJJI;
    public TuxTextView LLJJIII;
    public ChooseYourExperienceStruct LLJJIJI;
    public boolean LLJJIJIIJIL;

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.adchoice.BaseAdChoiceFragment
    public final int MR() {
        return R.layout.af7;
    }

    public final TuxTextView PR() {
        View viewFindViewById = this.LLJILJIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.iu3) : null;
            this.LLJILJIL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final TuxTextView RR() {
        View viewFindViewById = this.LLJJIII;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.jok) : null;
            this.LLJJIII = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final TuxTextView SR() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.q_i) : null;
            this.LLIZLLLIL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLILZIL = null;
        this.LLILZLL = null;
        this.LLIZ = null;
        this.LLIZLLLIL = null;
        this.LLJ = null;
        this.LLJI = null;
        this.LLJIJIL = null;
        this.LLJILJIL = null;
        this.LLJILJILJ = null;
        this.LLJILLL = null;
        this.LLJJ = null;
        this.LLJJI = null;
        this.LLJJIII = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        String str;
        super.onResume();
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (this.LLJJIJIIJIL) {
            str = "more_options";
        } else {
            str = this.LLILZ;
            if (str == null) {
                str = "";
            }
        }
        c2344009Gk.LJIIIIZZ("enter_from", str);
        C20684815ws.LJIILLIIL("show_choose_your_experience_prompt", c2344009Gk.LIZ);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ChooseYourExperienceStruct chooseYourExperienceStruct;
        ChooseYourExperienceStruct chooseYourExperienceStruct2;
        ChooseYourExperienceStruct chooseYourExperienceStruct3;
        ChooseYourExperienceStruct chooseYourExperienceStruct4;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        ChooseYourExperienceStruct chooseYourExperienceStruct5 = null;
        if (arguments != null && (chooseYourExperienceStruct = (ChooseYourExperienceStruct) arguments.getParcelable("chooseYourExperienceFragmentData")) != null) {
            this.LLJJIJI = chooseYourExperienceStruct;
            View viewFindViewById = this.LLILZIL;
            if (viewFindViewById == null) {
                View view2 = getView();
                if (view2 != null) {
                    viewFindViewById = view2.findViewById(R.id.jkv);
                } else {
                    viewFindViewById = null;
                }
                this.LLILZIL = (TuxTextView) viewFindViewById;
            }
            TextView textView = (TextView) viewFindViewById;
            ChooseYourExperienceStruct chooseYourExperienceStruct6 = this.LLJJIJI;
            if (chooseYourExperienceStruct6 == null) {
                chooseYourExperienceStruct6 = null;
            }
            textView.setText(chooseYourExperienceStruct6.header_title);
            View viewFindViewById2 = this.LLILZIL;
            if (viewFindViewById2 == null) {
                View view3 = getView();
                if (view3 != null) {
                    viewFindViewById2 = view3.findViewById(R.id.jkv);
                } else {
                    viewFindViewById2 = null;
                }
                this.LLILZIL = (TuxTextView) viewFindViewById2;
            }
            ((TuxTextView) viewFindViewById2).LJJJJI(38.0f);
            View viewFindViewById3 = this.LLILZLL;
            if (viewFindViewById3 == null) {
                View view4 = getView();
                if (view4 != null) {
                    viewFindViewById3 = view4.findViewById(R.id.q_o);
                } else {
                    viewFindViewById3 = null;
                }
                this.LLILZLL = (TuxTextView) viewFindViewById3;
            }
            TextView textView2 = (TextView) viewFindViewById3;
            ChooseYourExperienceStruct chooseYourExperienceStruct7 = this.LLJJIJI;
            if (chooseYourExperienceStruct7 == null) {
                chooseYourExperienceStruct7 = null;
            }
            textView2.setText(chooseYourExperienceStruct7.personalize_data.title);
            View viewFindViewById4 = this.LLIZ;
            if (viewFindViewById4 == null) {
                View view5 = getView();
                if (view5 != null) {
                    viewFindViewById4 = view5.findViewById(R.id.q_n);
                } else {
                    viewFindViewById4 = null;
                }
                this.LLIZ = (TuxTextView) viewFindViewById4;
            }
            TextView textView3 = (TextView) viewFindViewById4;
            ChooseYourExperienceStruct chooseYourExperienceStruct8 = this.LLJJIJI;
            if (chooseYourExperienceStruct8 == null) {
                chooseYourExperienceStruct8 = null;
            }
            textView3.setText(chooseYourExperienceStruct8.personalize_data.sub_title);
            ChooseYourExperienceStruct chooseYourExperienceStruct9 = this.LLJJIJI;
            if (chooseYourExperienceStruct9 == null) {
                chooseYourExperienceStruct9 = null;
            }
            String str = chooseYourExperienceStruct9.personalize_data.link_text;
            if (str != null && str.length() != 0) {
                TuxTextView tuxTextViewSR = SR();
                Context context = SR().getContext();
                ChooseYourExperienceStruct chooseYourExperienceStruct10 = this.LLJJIJI;
                if (chooseYourExperienceStruct10 == null) {
                    chooseYourExperienceStruct4 = null;
                } else {
                    chooseYourExperienceStruct4 = chooseYourExperienceStruct10;
                }
                String str2 = chooseYourExperienceStruct4.personalize_data.link_text;
                if (chooseYourExperienceStruct10 == null) {
                    chooseYourExperienceStruct10 = null;
                }
                tuxTextViewSR.setText(C0TRW.LIZIZ(context, str2, chooseYourExperienceStruct10.personalize_data.desc, new AwS556S0100000_12(this, 28)));
                SR().setMovementMethod(LinkMovementMethod.getInstance());
            } else {
                TuxTextView tuxTextViewSR2 = SR();
                ChooseYourExperienceStruct chooseYourExperienceStruct11 = this.LLJJIJI;
                if (chooseYourExperienceStruct11 == null) {
                    chooseYourExperienceStruct11 = null;
                }
                tuxTextViewSR2.setText(chooseYourExperienceStruct11.personalize_data.desc);
            }
            View viewFindViewById5 = this.LLJ;
            if (viewFindViewById5 == null) {
                View view6 = getView();
                if (view6 != null) {
                    viewFindViewById5 = view6.findViewById(R.id.q_m);
                } else {
                    viewFindViewById5 = null;
                }
                this.LLJ = (C197039127h) viewFindViewById5;
            }
            C197039127h c197039127h = (C197039127h) viewFindViewById5;
            ChooseYourExperienceStruct chooseYourExperienceStruct12 = this.LLJJIJI;
            if (chooseYourExperienceStruct12 == null) {
                chooseYourExperienceStruct12 = null;
            }
            c197039127h.setText(chooseYourExperienceStruct12.personalize_data.button_text);
            C786410Ut5.U8(c197039127h, new ACListenerS147S0100000_12(this, 236));
            View viewFindViewById6 = this.LLJI;
            if (viewFindViewById6 == null) {
                View view7 = getView();
                if (view7 != null) {
                    viewFindViewById6 = view7.findViewById(R.id.iu6);
                } else {
                    viewFindViewById6 = null;
                }
                this.LLJI = (TuxTextView) viewFindViewById6;
            }
            TextView textView4 = (TextView) viewFindViewById6;
            ChooseYourExperienceStruct chooseYourExperienceStruct13 = this.LLJJIJI;
            if (chooseYourExperienceStruct13 == null) {
                chooseYourExperienceStruct13 = null;
            }
            textView4.setText(chooseYourExperienceStruct13.gen_data.title);
            View viewFindViewById7 = this.LLJIJIL;
            if (viewFindViewById7 == null) {
                View view8 = getView();
                if (view8 != null) {
                    viewFindViewById7 = view8.findViewById(R.id.iu5);
                } else {
                    viewFindViewById7 = null;
                }
                this.LLJIJIL = (TuxTextView) viewFindViewById7;
            }
            TextView textView5 = (TextView) viewFindViewById7;
            ChooseYourExperienceStruct chooseYourExperienceStruct14 = this.LLJJIJI;
            if (chooseYourExperienceStruct14 == null) {
                chooseYourExperienceStruct14 = null;
            }
            textView5.setText(chooseYourExperienceStruct14.gen_data.sub_title);
            ChooseYourExperienceStruct chooseYourExperienceStruct15 = this.LLJJIJI;
            if (chooseYourExperienceStruct15 == null) {
                chooseYourExperienceStruct15 = null;
            }
            if (!TextUtils.isEmpty(chooseYourExperienceStruct15.gen_data.link_text)) {
                TuxTextView tuxTextViewPR = PR();
                Context context2 = PR().getContext();
                ChooseYourExperienceStruct chooseYourExperienceStruct16 = this.LLJJIJI;
                if (chooseYourExperienceStruct16 == null) {
                    chooseYourExperienceStruct3 = null;
                } else {
                    chooseYourExperienceStruct3 = chooseYourExperienceStruct16;
                }
                String str3 = chooseYourExperienceStruct3.gen_data.link_text;
                if (chooseYourExperienceStruct16 == null) {
                    chooseYourExperienceStruct16 = null;
                }
                tuxTextViewPR.setText(C0TRW.LIZIZ(context2, str3, chooseYourExperienceStruct16.gen_data.desc, new AwS556S0100000_12(this, 29)));
                PR().setMovementMethod(LinkMovementMethod.getInstance());
            } else {
                TuxTextView tuxTextViewPR2 = PR();
                ChooseYourExperienceStruct chooseYourExperienceStruct17 = this.LLJJIJI;
                if (chooseYourExperienceStruct17 == null) {
                    chooseYourExperienceStruct17 = null;
                }
                tuxTextViewPR2.setText(chooseYourExperienceStruct17.gen_data.desc);
            }
            View viewFindViewById8 = this.LLJILJILJ;
            if (viewFindViewById8 == null) {
                View view9 = getView();
                if (view9 != null) {
                    viewFindViewById8 = view9.findViewById(R.id.iu4);
                } else {
                    viewFindViewById8 = null;
                }
                this.LLJILJILJ = (C197039127h) viewFindViewById8;
            }
            C197039127h c197039127h2 = (C197039127h) viewFindViewById8;
            ChooseYourExperienceStruct chooseYourExperienceStruct18 = this.LLJJIJI;
            if (chooseYourExperienceStruct18 == null) {
                chooseYourExperienceStruct18 = null;
            }
            c197039127h2.setText(chooseYourExperienceStruct18.gen_data.button_text);
            C786410Ut5.U8(c197039127h2, new ACListenerS147S0100000_12(this, 237));
            View viewFindViewById9 = this.LLJILLL;
            if (viewFindViewById9 == null) {
                View view10 = getView();
                if (view10 != null) {
                    viewFindViewById9 = view10.findViewById(R.id.ole);
                } else {
                    viewFindViewById9 = null;
                }
                this.LLJILLL = (TuxTextView) viewFindViewById9;
            }
            TextView textView6 = (TextView) viewFindViewById9;
            ChooseYourExperienceStruct chooseYourExperienceStruct19 = this.LLJJIJI;
            if (chooseYourExperienceStruct19 == null) {
                chooseYourExperienceStruct19 = null;
            }
            textView6.setText(chooseYourExperienceStruct19.more_options_data.title);
            View viewFindViewById10 = this.LLJJ;
            if (viewFindViewById10 == null) {
                View view11 = getView();
                if (view11 != null) {
                    viewFindViewById10 = view11.findViewById(R.id.old);
                } else {
                    viewFindViewById10 = null;
                }
                this.LLJJ = (TuxTextView) viewFindViewById10;
            }
            TextView textView7 = (TextView) viewFindViewById10;
            ChooseYourExperienceStruct chooseYourExperienceStruct20 = this.LLJJIJI;
            if (chooseYourExperienceStruct20 == null) {
                chooseYourExperienceStruct20 = null;
            }
            textView7.setText(chooseYourExperienceStruct20.more_options_data.desc);
            View viewFindViewById11 = this.LLJJI;
            if (viewFindViewById11 == null) {
                View view12 = getView();
                if (view12 != null) {
                    viewFindViewById11 = view12.findViewById(R.id.d7r);
                } else {
                    viewFindViewById11 = null;
                }
                this.LLJJI = (C197039127h) viewFindViewById11;
            }
            C197039127h c197039127h3 = (C197039127h) viewFindViewById11;
            ChooseYourExperienceStruct chooseYourExperienceStruct21 = this.LLJJIJI;
            if (chooseYourExperienceStruct21 == null) {
                chooseYourExperienceStruct21 = null;
            }
            c197039127h3.setText(chooseYourExperienceStruct21.more_options_data.button_text);
            C786410Ut5.U8(c197039127h3, new ACListenerS147S0100000_12(this, 32));
            ChooseYourExperienceStruct chooseYourExperienceStruct22 = this.LLJJIJI;
            if (chooseYourExperienceStruct22 == null) {
                chooseYourExperienceStruct22 = null;
            }
            if (!TextUtils.isEmpty(chooseYourExperienceStruct22.learn_more_data.link_text)) {
                TuxTextView tuxTextViewRR = RR();
                Context context3 = RR().getContext();
                ChooseYourExperienceStruct chooseYourExperienceStruct23 = this.LLJJIJI;
                if (chooseYourExperienceStruct23 == null) {
                    chooseYourExperienceStruct2 = null;
                } else {
                    chooseYourExperienceStruct2 = chooseYourExperienceStruct23;
                }
                String str4 = chooseYourExperienceStruct2.learn_more_data.link_text;
                if (chooseYourExperienceStruct23 != null) {
                    chooseYourExperienceStruct5 = chooseYourExperienceStruct23;
                }
                tuxTextViewRR.setText(C0TRW.LIZIZ(context3, str4, chooseYourExperienceStruct5.learn_more_data.desc, new AwS556S0100000_12(this, 30)));
                RR().setMovementMethod(LinkMovementMethod.getInstance());
                return;
            }
            TuxTextView tuxTextViewRR2 = RR();
            ChooseYourExperienceStruct chooseYourExperienceStruct24 = this.LLJJIJI;
            if (chooseYourExperienceStruct24 != null) {
                chooseYourExperienceStruct5 = chooseYourExperienceStruct24;
            }
            tuxTextViewRR2.setText(chooseYourExperienceStruct5.learn_more_data.desc);
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
