package com.bytedance.ies.ugc.aweme.commercialize.compliance.topics.ui;

import X.AbstractC746450TPv;
import X.C01GW;
import X.C098200Yq;
import X.C0I7D;
import X.C0OM1;
import X.C0TQ1;
import X.C1022620cia;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1390920mIc;
import X.C1602160rnK;
import X.C1685300txQ;
import X.C1841350y17;
import X.C1848410yCV;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2211941Bhg;
import X.C2213981Bky;
import X.C2344009Gk;
import X.C312690CNn;
import X.C452501pT;
import X.C746060TOi;
import X.C746390TPp;
import X.C746430TPt;
import X.C746440TPu;
import X.C786410Ut5;
import X.DialogInterfaceOnDismissListenerC786080UsY;
import X.InterfaceC344240DeY;
import X.InterfaceC594300NSq;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import avg.f;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.api.ICommercializeComplianceApi;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.personalization.ComplianceVM;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.topics.model.Gender;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.topics.ui.TopicDialog;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.topics.viewmodel.AdTopicsViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.Intrinsics;
import mf.a;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public final class TopicDialog extends Fragment implements CompoundButton.OnCheckedChangeListener, View.OnClickListener, InterfaceC344240DeY {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWslLDx9PSIvZy4kLSgpZyw8JSgpOyw6KSHELIOSklMyp9KyohOSM6KSsvLGEnJzUlKjx9PSxiHSAjISYIIC4/JyI=";
    public C1841350y17 LL;
    public C1841350y17 LLILLJJLI;
    public C1841350y17 LLILLL;
    public RelativeLayout LLILZ;
    public RelativeLayout LLILZIL;
    public C0I7D LLILZLL;
    public TuxTextView LLIZ;
    public TuxTextView LLIZLLLIL;
    public TuxTextView LLJ;
    public TuxTextView LLJI;
    public View LLJIJIL;
    public TuxTextView LLJILJIL;
    public C19EG LLJILJILJ;
    public C19EG LLJILLL;
    public AdTopicsViewModel LLJJ;
    public ComplianceVM LLJJI;
    public AbstractC746450TPv LLJJIII;
    public Integer LLJJIJI;
    public Integer LLJJIJIL;
    public String LLJJJ;
    public String LLJJJIL;
    public Integer LLJJJJ;
    public Integer LLJJJJJIL;
    public String LLJJJJLIIL;
    public Integer LLJJLIIIJLLLLLLLZ;
    public C746440TPu LLJL;
    public TuxSheet LLJLIL;
    public long LLJLILLLLZIIL;
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(161));
    public String LLJJL = "";

    public final View MR() {
        View viewFindViewById = this.LLJIJIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.a9o) : null;
            this.LLJIJIL = viewFindViewById;
        }
        return viewFindViewById;
    }

    public final C1841350y17 NR() {
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.a9r) : null;
            this.LLILLJJLI = (C1841350y17) viewFindViewById;
        }
        return (C1841350y17) viewFindViewById;
    }

    public final TuxTextView OR() {
        View viewFindViewById = this.LLIZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.a9s) : null;
            this.LLIZ = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final TuxTextView PR() {
        View viewFindViewById = this.LLJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.a9t) : null;
            this.LLJ = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final C1841350y17 RR() {
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.a9v) : null;
            this.LLILLL = (C1841350y17) viewFindViewById;
        }
        return (C1841350y17) viewFindViewById;
    }

    public final TuxTextView SR() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.a9w) : null;
            this.LLIZLLLIL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        String string;
        AbstractC746450TPv abstractC746450TPv = this.LLJJIII;
        AbstractC746450TPv abstractC746450TPv2 = abstractC746450TPv == null ? null : abstractC746450TPv;
        if (abstractC746450TPv2 instanceof C746060TOi) {
            C19EG c19eg = this.LLJILLL;
            if (c19eg == null) {
                c19eg = null;
            }
            string = c19eg.getString(2131835065);
        } else if (abstractC746450TPv2 instanceof C746430TPt) {
            if (abstractC746450TPv == null) {
                abstractC746450TPv = null;
            }
            string = ((C746430TPt) abstractC746450TPv).LIZ.adTopicName;
        } else if (abstractC746450TPv2 instanceof C746390TPp) {
            if (abstractC746450TPv == null) {
                abstractC746450TPv = null;
            }
            string = ((C746390TPp) abstractC746450TPv).LIZ.sensitiveTopicName;
        } else {
            string = null;
        }
        C0OM1 c0om1 = new C0OM1();
        C1250250idj c1250250idj = new C1250250idj();
        if (string == null) {
            C19EG c19eg2 = this.LLJILLL;
            string = (c19eg2 != null ? c19eg2 : null).getString(2131847782);
        }
        c1250250idj.LIZJ = string;
        c0om1.LIZJ = c1250250idj;
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
        c1251150ifB.LIZJ(new AwS556S0100000_12(this, 359));
        c0om1.LIZIZ(c1251150ifB);
        c0om1.LIZLLL = true;
        return c0om1;
    }

    public final TuxTextView UR() {
        View viewFindViewById = this.LLJI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.a9x) : null;
            this.LLJI = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final C1841350y17 VR() {
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.a9y) : null;
            this.LL = (C1841350y17) viewFindViewById;
        }
        return (C1841350y17) viewFindViewById;
    }

    public final C0I7D WR() {
        View viewFindViewById = this.LLILZLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.a9z) : null;
            this.LLILZLL = (C0I7D) viewFindViewById;
        }
        return (C0I7D) viewFindViewById;
    }

    public final TuxTextView ZR() {
        View viewFindViewById = this.LLJILJIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.a_0) : null;
            this.LLJILJIL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
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
        this.LLJIJIL = null;
        this.LLJILJIL = null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        C1841350y17 c1841350y17RR;
        super.onResume();
        AbstractC746450TPv abstractC746450TPv = this.LLJJIII;
        if (abstractC746450TPv == null) {
            abstractC746450TPv = null;
        }
        if (abstractC746450TPv instanceof C746060TOi) {
            C786410Ut5.LLLLZLL(OR(), 8);
            C786410Ut5.LLLLZLL(SR(), 8);
            TuxTextView tuxTextViewPR = PR();
            C19EG c19eg = this.LLJILLL;
            if (c19eg == null) {
                c19eg = null;
            }
            tuxTextViewPR.setText(c19eg.getString(2131835063));
            TuxTextView tuxTextViewUR = UR();
            C19EG c19eg2 = this.LLJILLL;
            if (c19eg2 == null) {
                c19eg2 = null;
            }
            tuxTextViewUR.setText(c19eg2.getString(2131835062));
            C746440TPu c746440TPu = this.LLJL;
            if (c746440TPu != null) {
                int visibility = c746440TPu.getVisibility();
                c746440TPu.setVisibility(0);
                C1602160rnK.LIZIZ(visibility, 0, c746440TPu);
            }
            C786410Ut5.LJLLLLLL(0, MR());
            C746060TOi c746060TOi = (C746060TOi) abstractC746450TPv;
            if (c746060TOi.LIZIZ == 0) {
                TuxTextView tuxTextViewZR = ZR();
                if (tuxTextViewZR != null) {
                    C19EG c19eg3 = this.LLJILLL;
                    tuxTextViewZR.setText((c19eg3 != null ? c19eg3 : null).getString(2131835064));
                }
            } else {
                TuxTextView tuxTextViewZR2 = ZR();
                if (tuxTextViewZR2 != null) {
                    C19EG c19eg4 = this.LLJILLL;
                    tuxTextViewZR2.setText((c19eg4 != null ? c19eg4 : null).getString(2131835060));
                }
            }
            String str = c746060TOi.LIZ.genderType;
            if (str != null) {
                switch (str.hashCode()) {
                    case 48:
                        if (str.equals(CardStruct.IStatusCode.DEFAULT)) {
                            NR().setChecked(true);
                            WR().setText("");
                        }
                        break;
                    case 49:
                        if (str.equals("1")) {
                            RR().setChecked(true);
                            WR().setText("");
                        }
                        break;
                    case BaseNotice.RECOMMEND_LIVE /* 50 */:
                        if (str.equals("2")) {
                            VR().setChecked(true);
                            WR().setText(c746060TOi.LIZ.genderContent);
                        }
                        break;
                }
                return;
            }
            return;
        }
        if (abstractC746450TPv instanceof C746430TPt) {
            ZR().setText(getString(2131824754));
            C786410Ut5.LLLLZLL(OR(), 0);
            C786410Ut5.LLLLZLL(SR(), 0);
            C746440TPu c746440TPu2 = this.LLJL;
            if (c746440TPu2 != null) {
                int visibility2 = c746440TPu2.getVisibility();
                c746440TPu2.setVisibility(8);
                C1602160rnK.LIZIZ(visibility2, 8, c746440TPu2);
            }
            C786410Ut5.LJLLLLLL(8, MR());
            TuxTextView tuxTextViewPR2 = PR();
            C19EG c19eg5 = this.LLJILLL;
            if (c19eg5 == null) {
                c19eg5 = null;
            }
            tuxTextViewPR2.setText(c19eg5.getString(2131821859));
            TuxTextView tuxTextViewUR2 = UR();
            C19EG c19eg6 = this.LLJILLL;
            tuxTextViewUR2.setText((c19eg6 != null ? c19eg6 : null).getString(2131821860));
            Integer num = ((C746430TPt) abstractC746450TPv).LIZ.choice;
            if (num != null) {
                if (num.intValue() == 1) {
                    NR().setChecked(true);
                    return;
                } else {
                    if (num.intValue() == 2) {
                        RR().setChecked(true);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (abstractC746450TPv instanceof C746390TPp) {
            TuxTextView tuxTextViewZR3 = ZR();
            if (tuxTextViewZR3 != null) {
                tuxTextViewZR3.setText(getString(2131822114));
            }
            TuxTextView tuxTextViewOR = OR();
            if (tuxTextViewOR != null) {
                C786410Ut5.LLLLZLL(tuxTextViewOR, 8);
            }
            TuxTextView tuxTextViewSR = SR();
            if (tuxTextViewSR != null) {
                C786410Ut5.LLLLZLL(tuxTextViewSR, 8);
            }
            C746440TPu c746440TPu3 = this.LLJL;
            if (c746440TPu3 != null) {
                int visibility3 = c746440TPu3.getVisibility();
                c746440TPu3.setVisibility(8);
                C1602160rnK.LIZIZ(visibility3, 8, c746440TPu3);
            }
            View viewMR = MR();
            if (viewMR != null) {
                C786410Ut5.LJLLLLLL(8, viewMR);
            }
            TuxTextView tuxTextViewPR3 = PR();
            if (tuxTextViewPR3 != null) {
                C19EG c19eg7 = this.LLJILLL;
                if (c19eg7 == null) {
                    c19eg7 = null;
                }
                tuxTextViewPR3.setText(c19eg7.getString(2131822115));
            }
            TuxTextView tuxTextViewUR3 = UR();
            if (tuxTextViewUR3 != null) {
                C19EG c19eg8 = this.LLJILLL;
                tuxTextViewUR3.setText((c19eg8 != null ? c19eg8 : null).getString(2131822116));
            }
            Integer num2 = ((C746390TPp) abstractC746450TPv).LIZ.choice;
            if (num2 != null) {
                if (num2.intValue() == 1) {
                    C1841350y17 c1841350y17NR = NR();
                    if (c1841350y17NR != null) {
                        c1841350y17NR.setChecked(true);
                        return;
                    }
                    return;
                }
                if (num2.intValue() != 2 || (c1841350y17RR = RR()) == null) {
                    return;
                }
                c1841350y17RR.setChecked(true);
            }
        }
    }

    public final void cS(final String str) {
        if (C312690CNn.LIZIZ(C312690CNn.LIZ)) {
            return;
        }
        ((ICommercializeComplianceApi) this.LLJJIJIIJIL.getValue()).setUserSensitive(str).enqueue(new InterfaceC594300NSq<BaseResponse>() { // from class: X.0TPo
            @Override // X.InterfaceC594300NSq
            public final void onFailure(C0X9S<BaseResponse> c0x9s, Throwable th) {
                int i = AdTopicsViewModel.LLILZLL;
                if (i > 0) {
                    AdTopicsViewModel.LLILZLL = i - 1;
                    this.LL.cS(str);
                }
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // X.InterfaceC594300NSq
            public final void onResponse(C0X9S<BaseResponse> c0x9s, C0X52<BaseResponse> c0x52) {
                BaseResponse baseResponse;
                BaseResponse baseResponse2;
                MutableLiveData<AbstractC746450TPv> mutableLiveData;
                MutableLiveData<AbstractC746450TPv> mutableLiveData2;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("on Response: ");
                C19EG c19eg = null;
                AbstractC746450TPv abstractC746450TPv = null;
                AbstractC746450TPv abstractC746450TPv2 = null;
                if (c0x52 != null) {
                    baseResponse = c0x52.LIZIZ;
                } else {
                    baseResponse = null;
                }
                sbLIZ.append(baseResponse);
                C2188811AlT.LIZIZ(sbLIZ);
                if (c0x52 != null && c0x52.LIZJ() && (baseResponse2 = c0x52.LIZIZ) != null) {
                    if (baseResponse2.status_code == 0) {
                        TopicDialog topicDialog = this.LL;
                        AbstractC746450TPv abstractC746450TPv3 = topicDialog.LLJJIII;
                        if (abstractC746450TPv3 == null) {
                            abstractC746450TPv3 = null;
                        }
                        if (abstractC746450TPv3 instanceof C746060TOi) {
                            C746060TOi c746060TOi = (C746060TOi) abstractC746450TPv3;
                            c746060TOi.LIZ.setGenderType(topicDialog.LLJJJJLIIL);
                            if (Intrinsics.LJFF(this.LL.LLJJJJLIIL, "2")) {
                                c746060TOi.LIZ.setGenderContent(this.LL.LLJJL);
                            }
                            TopicDialog topicDialog2 = this.LL;
                            ComplianceVM complianceVM = topicDialog2.LLJJI;
                            if (complianceVM != null && (mutableLiveData2 = complianceVM.LLJ) != null) {
                                AbstractC746450TPv abstractC746450TPv4 = topicDialog2.LLJJIII;
                                if (abstractC746450TPv4 != null) {
                                    abstractC746450TPv = abstractC746450TPv4;
                                }
                                mutableLiveData2.setValue(abstractC746450TPv);
                            }
                        } else if (abstractC746450TPv3 instanceof C746390TPp) {
                            ((C746390TPp) abstractC746450TPv3).LIZ.setChoice(topicDialog.LLJJLIIIJLLLLLLLZ);
                            TopicDialog topicDialog3 = this.LL;
                            AdTopicsViewModel adTopicsViewModel = topicDialog3.LLJJ;
                            if (adTopicsViewModel != null && (mutableLiveData = adTopicsViewModel.LLILLL) != null) {
                                AbstractC746450TPv abstractC746450TPv5 = topicDialog3.LLJJIII;
                                if (abstractC746450TPv5 != null) {
                                    abstractC746450TPv2 = abstractC746450TPv5;
                                }
                                mutableLiveData.setValue(abstractC746450TPv2);
                            }
                        }
                    } else {
                        C19EG c19eg2 = this.LL.LLJILJILJ;
                        if (c19eg2 != null) {
                            c19eg = c19eg2;
                        }
                        C1389890mGx c1389890mGx = new C1389890mGx(c19eg);
                        c1389890mGx.LJIIIZ(2131837962);
                        c1389890mGx.LJIIJJI();
                    }
                    AdTopicsViewModel.LLILZLL = 3;
                    return;
                }
                int i = AdTopicsViewModel.LLILZLL;
                if (i <= 0) {
                    return;
                }
                AdTopicsViewModel.LLILZLL = i - 1;
                this.LL.cS(str);
            }
        });
    }

    public final void dS(final String str) {
        if (C312690CNn.LIZIZ(C312690CNn.LIZ)) {
            return;
        }
        ((ICommercializeComplianceApi) this.LLJJIJIIJIL.getValue()).setUserTopic(str).enqueue(new InterfaceC594300NSq<BaseResponse>() { // from class: X.0TPs
            @Override // X.InterfaceC594300NSq
            public final void onFailure(C0X9S<BaseResponse> c0x9s, Throwable th) {
                int i = AdTopicsViewModel.LLILZLL;
                if (i > 0) {
                    AdTopicsViewModel.LLILZLL = i - 1;
                    this.LL.dS(str);
                }
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // X.InterfaceC594300NSq
            public final void onResponse(C0X9S<BaseResponse> c0x9s, C0X52<BaseResponse> c0x52) {
                BaseResponse baseResponse;
                BaseResponse baseResponse2;
                MutableLiveData<AbstractC746450TPv> mutableLiveData;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("on Response: ");
                C19EG c19eg = null;
                AbstractC746450TPv abstractC746450TPv = null;
                if (c0x52 != null) {
                    baseResponse = c0x52.LIZIZ;
                } else {
                    baseResponse = null;
                }
                sbLIZ.append(baseResponse);
                C2188811AlT.LIZIZ(sbLIZ);
                if (c0x52 != null && c0x52.LIZJ() && (baseResponse2 = c0x52.LIZIZ) != null) {
                    if (baseResponse2.status_code == 0) {
                        TopicDialog topicDialog = this.LL;
                        AbstractC746450TPv abstractC746450TPv2 = topicDialog.LLJJIII;
                        if (abstractC746450TPv2 == null) {
                            abstractC746450TPv2 = null;
                        }
                        if (abstractC746450TPv2 instanceof C746430TPt) {
                            ((C746430TPt) abstractC746450TPv2).LIZ.setChoice(topicDialog.LLJJJJJIL);
                        }
                        TopicDialog topicDialog2 = this.LL;
                        AdTopicsViewModel adTopicsViewModel = topicDialog2.LLJJ;
                        if (adTopicsViewModel != null && (mutableLiveData = adTopicsViewModel.LLILLL) != null) {
                            AbstractC746450TPv abstractC746450TPv3 = topicDialog2.LLJJIII;
                            if (abstractC746450TPv3 != null) {
                                abstractC746450TPv = abstractC746450TPv3;
                            }
                            mutableLiveData.setValue(abstractC746450TPv);
                        }
                    } else {
                        C19EG c19eg2 = this.LL.LLJILJILJ;
                        if (c19eg2 != null) {
                            c19eg = c19eg2;
                        }
                        C1389890mGx c1389890mGx = new C1389890mGx(c19eg);
                        c1389890mGx.LJIIIZ(2131837962);
                        c1389890mGx.LJIIJJI();
                    }
                    AdTopicsViewModel.LLILZLL = 3;
                    return;
                }
                int i = AdTopicsViewModel.LLILZLL;
                if (i <= 0) {
                    return;
                }
                AdTopicsViewModel.LLILZLL = i - 1;
                this.LL.dS(str);
            }
        });
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Integer numValueOf;
        C1841350y17 c1841350y17VR;
        if (view != null && (numValueOf = Integer.valueOf(view.getId())) != null) {
            if (numValueOf.intValue() == R.id.a9q) {
                C1841350y17 c1841350y17NR = NR();
                if (c1841350y17NR != null) {
                    c1841350y17NR.setChecked(true);
                    return;
                }
                return;
            }
            if (numValueOf.intValue() == R.id.a9u) {
                C1841350y17 c1841350y17RR = RR();
                if (c1841350y17RR == null) {
                    return;
                }
                c1841350y17RR.setChecked(true);
                return;
            }
            if ((numValueOf.intValue() != R.id.a9p && numValueOf.intValue() != R.id.a9z) || (c1841350y17VR = VR()) == null) {
                return;
            }
            c1841350y17VR.setChecked(true);
        }
    }

    public final void aS(String str, String str2) {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(new JSONObject().put("field", "gender_type").put("value", str));
        jSONArray.put(new JSONObject().put("field", "gender_content").put("value", str2));
        String string = jSONArray.toString();
        if (!Intrinsics.LJFF(this.LLJJJ, str)) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("gender_value", str);
            C20684815ws.LJIILLIIL("ad_topic_change_gender", c2344009Gk.LIZ);
        }
        cS(string);
    }

    public final void bS(AbstractC746450TPv abstractC746450TPv, Integer num) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("show dialog for ");
        sbLIZ.append(abstractC746450TPv);
        C1022620cia.LIZ("TopicDialog", C2188811AlT.LIZIZ(sbLIZ));
        this.LLJJIII = abstractC746450TPv;
        this.LLJJIJI = num;
        C19EG c19eg = null;
        if (abstractC746450TPv == null) {
            abstractC746450TPv = null;
        }
        if (abstractC746450TPv instanceof C746060TOi) {
            C746060TOi c746060TOi = (C746060TOi) abstractC746450TPv;
            if (Intrinsics.LJFF(c746060TOi.LIZ.genderSource, "1")) {
                Gender gender = c746060TOi.LIZ;
                this.LLJJJ = gender.genderType;
                this.LLJJJIL = gender.genderContent;
            }
        } else if (abstractC746450TPv instanceof C746430TPt) {
            this.LLJJIJIL = ((C746430TPt) abstractC746450TPv).LIZ.choice;
        } else if (abstractC746450TPv instanceof C746390TPp) {
            this.LLJJJJ = ((C746390TPp) abstractC746450TPv).LIZ.choice;
        }
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJIJI = this;
        tuxSheet.LLILLJJLI = new DialogInterfaceOnDismissListenerC786080UsY(this, 18);
        tuxSheet.LLJJIJIIJIL = true;
        c1390920mIc.LJIIIIZZ(0);
        TuxSheet tuxSheet2 = c1390920mIc.LIZ;
        tuxSheet2.LLJLL = true;
        this.LLJLIL = tuxSheet2;
        C19EG c19eg2 = this.LLJILJILJ;
        if (c19eg2 != null) {
            c19eg = c19eg2;
        }
        tuxSheet2.show(c19eg.getSupportFragmentManager(), "TopicDialog");
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (!z) {
            return;
        }
        int id = compoundButton.getId();
        if (id == R.id.a9r) {
            C1841350y17 c1841350y17RR = RR();
            if (c1841350y17RR != null) {
                c1841350y17RR.setChecked(false);
            }
            C1841350y17 c1841350y17VR = VR();
            if (c1841350y17VR != null) {
                c1841350y17VR.setChecked(false);
                return;
            }
            return;
        }
        if (id == R.id.a9v) {
            C1841350y17 c1841350y17NR = NR();
            if (c1841350y17NR != null) {
                c1841350y17NR.setChecked(false);
            }
            C1841350y17 c1841350y17VR2 = VR();
            if (c1841350y17VR2 == null) {
                return;
            }
            c1841350y17VR2.setChecked(false);
            return;
        }
        if (id != R.id.a9y && id != R.id.a9z) {
            return;
        }
        C1841350y17 c1841350y17NR2 = NR();
        if (c1841350y17NR2 != null) {
            c1841350y17NR2.setChecked(false);
        }
        C1841350y17 c1841350y17RR2 = RR();
        if (c1841350y17RR2 == null) {
            return;
        }
        c1841350y17RR2.setChecked(false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        View.OnClickListener fVar;
        super.onViewCreated(view, bundle);
        C746440TPu c746440TPu = (C746440TPu) view.findViewById(R.id.a9p);
        this.LLJL = c746440TPu;
        if (c746440TPu != null) {
            c746440TPu.setTouchListener(new C0TQ1() { // from class: X.0TPx
                @Override // X.C0TQ1
                public final void LIZ() {
                    C1841350y17 c1841350y17VR = this.LIZ.VR();
                    if (c1841350y17VR != null) {
                        c1841350y17VR.setChecked(true);
                    }
                }
            });
        }
        C786410Ut5.B7(NR(), this);
        C786410Ut5.B7(RR(), this);
        C786410Ut5.B7(VR(), this);
        View viewFindViewById = this.LLILZ;
        View viewFindViewById2 = null;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.a9q);
            } else {
                viewFindViewById = null;
            }
            this.LLILZ = (RelativeLayout) viewFindViewById;
        }
        C786410Ut5.S7((RelativeLayout) viewFindViewById, this);
        View view3 = this.LLILZIL;
        if (view3 == null) {
            View view4 = getView();
            if (view4 != null) {
                viewFindViewById2 = view4.findViewById(R.id.a9u);
            }
            this.LLILZIL = (RelativeLayout) viewFindViewById2;
            view3 = viewFindViewById2;
        }
        C786410Ut5.S7((RelativeLayout) view3, this);
        C746440TPu c746440TPu2 = this.LLJL;
        if (c746440TPu2 != null) {
            if (C1848410yCV.LIZ) {
                fVar = new f(this);
            } else {
                fVar = this;
            }
            a aVar = new a(fVar);
            if (C2213981Bky.LIZIZ.isOffline()) {
                C2211941Bhg.LIZ.injectViewListener(c746440TPu2);
            }
            c746440TPu2.setOnClickListener(aVar);
        }
        C786410Ut5.d9(WR(), this);
        this.LLJLILLLLZIIL = System.currentTimeMillis();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.f6z, viewGroup, false);
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
