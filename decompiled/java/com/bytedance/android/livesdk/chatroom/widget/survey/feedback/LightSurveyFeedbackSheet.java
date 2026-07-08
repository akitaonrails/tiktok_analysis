package com.bytedance.android.livesdk.chatroom.widget.survey.feedback;

import X.AnonymousClass0956;
import X.C098200Yq;
import X.C0DXR;
import X.C1390920mIc;
import X.C1391190mJ3;
import X.C1685300txQ;
import X.C1834150xpV;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20736316Cj;
import X.C23250099c;
import X.C343970De7;
import X.C444890HcV;
import X.C483000Iws;
import X.C483120Ix4;
import X.C497740JfY;
import X.C786410Ut5;
import X.DialogInterfaceOnCancelListenerC521720Kd8;
import X.DialogInterfaceOnDismissListenerC521770KdD;
import X.InterfaceC483140Ix6;
import X.InterfaceC483180IxA;
import X.InterfaceC483200IxC;
import Y.ACListenerS142S0100000_7;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.StaticLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.chatroom.widget.survey.feedback.LightSurveyFeedbackSheet;
import com.bytedance.android.livesdk.livesetting.watchlive.LightSurveyDelayConfig;
import com.bytedance.android.livesdk.survey.fullscreenstyle.SurveyViewModel;
import com.bytedance.android.livesdk.survey.model.SurveyOption;
import com.bytedance.android.livesdk.survey.model.SurveySecondQuestion;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final class LightSurveyFeedbackSheet extends BaseFragment implements InterfaceC483200IxC {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9Ky0tPT08JyhiPiY3LyHELIOSA4ZzwmOjMpMGE1LSAoKy4wI2sAICg7PBY5Ozk2MQMpLCsxKSYnGic2LTE=";
    public View LL;
    public TuxTextView LLILLJJLI;
    public RecyclerView LLILLL;
    public final SurveyViewModel LLILZ;
    public AnonymousClass0956 LLILZIL;
    public AnonymousClass0956 LLILZLL;
    public final InterfaceC483180IxA LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;

    public LightSurveyFeedbackSheet() {
    }

    public final void NR(Map<String, String> map) {
        if (this.LLJ) {
            return;
        }
        this.LLJ = true;
        this.LLJI = false;
        InterfaceC483180IxA interfaceC483180IxA = this.LLIZ;
        if (interfaceC483180IxA != null) {
            interfaceC483180IxA.LIZ(map);
        }
    }

    @Override // X.InterfaceC483200IxC
    public final void yx(Map<String, String> map) {
        if (!isVisible()) {
            return;
        }
        AnonymousClass0956 anonymousClass0956 = this.LLILZIL;
        LinkedHashMap linkedHashMap = null;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        AnonymousClass0956 anonymousClass09562 = this.LLILZLL;
        if (anonymousClass09562 != null) {
            anonymousClass09562.LIZIZ(null);
        }
        SurveyViewModel surveyViewModel = this.LLILZ;
        if (surveyViewModel != null) {
            surveyViewModel.EQ2();
        }
        if (this.LLJI) {
            if (map != null) {
                linkedHashMap = new LinkedHashMap(map);
                linkedHashMap.put("exit_method", "submit");
            }
            NR(linkedHashMap);
        } else {
            NR(map);
        }
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJFF(this, C343970De7.LIZ);
    }

    public LightSurveyFeedbackSheet(SurveyViewModel surveyViewModel, InterfaceC483180IxA interfaceC483180IxA) {
        this();
        this.LLILZ = surveyViewModel;
        this.LLIZ = interfaceC483180IxA;
    }

    /* JADX WARN: Type inference failed for: r0v33, types: [X.0Ix8] */
    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        SurveyOption surveyOption;
        List<SurveySecondQuestion> list;
        final boolean z;
        boolean z2;
        RecyclerView.LayoutManager gridLayoutManager;
        SurveyOption surveyOption2;
        String str;
        int i;
        super.onViewCreated(view, bundle);
        this.LL = view.findViewById(R.id.e1g);
        this.LLILLJJLI = (TuxTextView) view.findViewById(R.id.title);
        this.LLILLL = (RecyclerView) view.findViewById(R.id.pqh);
        View view2 = this.LL;
        if (view2 != null) {
            C786410Ut5.I7(new ACListenerS142S0100000_7(this, 48), view2);
        }
        SurveyViewModel surveyViewModel = this.LLILZ;
        if (surveyViewModel != null && (surveyOption2 = surveyViewModel.LLILLL) != null && (str = surveyOption2.mainTitle) != null) {
            int iLJIIZILJ = C497740JfY.LJIIZILJ() - (((int) C497740JfY.LIZIZ(66.0f)) * 2);
            TuxTextView tuxTextView = this.LLILLJJLI;
            if (tuxTextView != null) {
                if (StaticLayout.Builder.obtain(str, 0, str.length(), tuxTextView.getPaint(), iLJIIZILJ).build().getLineCount() > 2) {
                    i = 52;
                } else {
                    i = 33;
                }
                tuxTextView.setTuxFont(i);
                tuxTextView.setText(str);
            }
        }
        SurveyViewModel surveyViewModel2 = this.LLILZ;
        if (surveyViewModel2 != null && (surveyOption = surveyViewModel2.LLILLL) != null && (list = surveyOption.secondList) != null) {
            SurveySecondQuestion next = null;
            if (!list.isEmpty()) {
                Iterator<SurveySecondQuestion> it2 = list.iterator();
                if (it2.hasNext()) {
                    next = it2.next();
                    if (it2.hasNext()) {
                        int length = next.content.length();
                        do {
                            SurveySecondQuestion next2 = it2.next();
                            int length2 = next2.content.length();
                            if (length < length2) {
                                next = next2;
                                length = length2;
                            }
                        } while (it2.hasNext());
                    }
                }
                SurveySecondQuestion surveySecondQuestion = next;
                if (surveySecondQuestion != null) {
                    C444890HcV c444890HcV = new C444890HcV();
                    c444890HcV.LIZ(102);
                    int iLJIIZILJ2 = (C497740JfY.LJIIZILJ() - (((int) C497740JfY.LIZIZ(16.0f)) * 2)) - (((int) C497740JfY.LIZIZ(10.0f)) * 2);
                    int iLJIIZILJ3 = ((C497740JfY.LJIIZILJ() - (((int) C497740JfY.LIZIZ(16.0f)) * 3)) - (((int) C497740JfY.LIZIZ(10.0f)) * 4)) / 2;
                    float fMeasureText = c444890HcV.measureText(surveySecondQuestion.content);
                    if (fMeasureText > iLJIIZILJ3) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (fMeasureText > iLJIIZILJ2) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    final RecyclerView recyclerView = this.LLILLL;
                    if (recyclerView != null) {
                        if (z) {
                            gridLayoutManager = new LinearLayoutManager(getContext(), 1, false);
                        } else {
                            gridLayoutManager = new GridLayoutManager(getContext(), 2);
                        }
                        recyclerView.setLayoutManager(gridLayoutManager);
                        recyclerView.setAdapter(new C483120Ix4(list, new InterfaceC483140Ix6() { // from class: X.0Ix8
                            @Override // X.InterfaceC483140Ix6
                            public final void LIZ(C483130Ix5 c483130Ix5) {
                                C483130Ix5 c483130Ix52;
                                SurveySecondQuestion surveySecondQuestion2;
                                LightSurveyFeedbackSheet lightSurveyFeedbackSheet = this.LIZ;
                                SurveyViewModel surveyViewModel3 = lightSurveyFeedbackSheet.LLILZ;
                                if (surveyViewModel3 != null) {
                                    RecyclerView recyclerView2 = recyclerView;
                                    if (!C13LP.LJJJJ(c483130Ix5.LL, surveyViewModel3.LLILZIL)) {
                                        int childCount = recyclerView2.getChildCount();
                                        for (int i2 = 0; i2 < childCount; i2++) {
                                            RecyclerView.ViewHolder childViewHolder = recyclerView2.getChildViewHolder(recyclerView2.getChildAt(i2));
                                            if (childViewHolder instanceof C483130Ix5) {
                                                c483130Ix52 = (C483130Ix5) childViewHolder;
                                            } else {
                                                c483130Ix52 = null;
                                            }
                                            Set<SurveySecondQuestion> set = surveyViewModel3.LLILZIL;
                                            if (c483130Ix52 != null) {
                                                surveySecondQuestion2 = c483130Ix52.LL;
                                            } else {
                                                surveySecondQuestion2 = null;
                                            }
                                            if (C13LP.LJJJJ(surveySecondQuestion2, set) && c483130Ix52 != null) {
                                                c483130Ix52.itemView.setBackgroundResource(R.drawable.dww);
                                            }
                                        }
                                        surveyViewModel3.LLILZIL.clear();
                                        SurveySecondQuestion surveySecondQuestion3 = c483130Ix5.LL;
                                        if (surveySecondQuestion3 != null) {
                                            surveyViewModel3.LLILZIL.add(surveySecondQuestion3);
                                            surveyViewModel3.LLILZLL.add(surveySecondQuestion3);
                                        }
                                        c483130Ix5.itemView.setBackgroundResource(R.drawable.dwu);
                                        if (LightSurveyDelayConfig.INSTANCE.delay() > 0) {
                                            lightSurveyFeedbackSheet.LLJI = true;
                                            AnonymousClass0956 anonymousClass0956 = lightSurveyFeedbackSheet.LLILZLL;
                                            if (anonymousClass0956 != null) {
                                                anonymousClass0956.LIZIZ(null);
                                            }
                                            lightSurveyFeedbackSheet.LLILZLL = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(lightSurveyFeedbackSheet), null, null, new C483150Ix7(lightSurveyFeedbackSheet, null), 3);
                                        } else {
                                            lightSurveyFeedbackSheet.yx(C2097908Jt.LIZJ(new Pair("exit_method", "submit")));
                                        }
                                    }
                                    AnonymousClass0956 anonymousClass09562 = lightSurveyFeedbackSheet.LLILZIL;
                                    if (anonymousClass09562 != null) {
                                        anonymousClass09562.LIZIZ(null);
                                    }
                                }
                            }
                        }, z2));
                        recyclerView.addItemDecoration(new C0DXR() { // from class: X.0DSO
                            public final int LL = (int) C497740JfY.LIZIZ(8.0f);
                            public final int LLILLJJLI = (int) C497740JfY.LIZIZ(16.0f);
                            public final int LLILLL = (int) C497740JfY.LIZIZ(8.0f);

                            @Override // X.C0DXR
                            public final void LIZIZ(Rect rect, View view3, RecyclerView recyclerView2, C21673919s1 c21673919s1) {
                                int i2;
                                int i3;
                                int i4;
                                int i5;
                                int i6;
                                int childAdapterPosition = recyclerView2.getChildAdapterPosition(view3);
                                if (z) {
                                    if (childAdapterPosition > 0) {
                                        i6 = this.LL;
                                    } else {
                                        i6 = 0;
                                    }
                                    rect.set(0, i6, 0, 0);
                                    return;
                                }
                                int i7 = childAdapterPosition % 2;
                                if (i7 != 0) {
                                    if (i7 != 1) {
                                        return;
                                    }
                                    if (C497740JfY.LJJ()) {
                                        if (childAdapterPosition > 1) {
                                            i5 = this.LLILLJJLI;
                                        } else {
                                            i5 = 0;
                                        }
                                        rect.set(0, i5, this.LLILLL, 0);
                                        return;
                                    }
                                    int i8 = this.LLILLL;
                                    if (childAdapterPosition > 1) {
                                        i4 = this.LLILLJJLI;
                                    } else {
                                        i4 = 0;
                                    }
                                    rect.set(i8, i4, 0, 0);
                                    return;
                                }
                                if (C497740JfY.LJJ()) {
                                    int i9 = this.LLILLL;
                                    if (childAdapterPosition > 1) {
                                        i3 = this.LLILLJJLI;
                                    } else {
                                        i3 = 0;
                                    }
                                    rect.set(i9, i3, 0, 0);
                                    return;
                                }
                                if (childAdapterPosition > 1) {
                                    i2 = this.LLILLJJLI;
                                } else {
                                    i2 = 0;
                                }
                                rect.set(0, i2, this.LLILLL, 0);
                            }
                        });
                    }
                }
            }
        }
    }

    public final void OR(Context context, FragmentManager fragmentManager, Map<String, String> map) {
        if (fragmentManager == null || isVisible()) {
            return;
        }
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LIZ.LLJJIJI = this;
        c1390920mIc.LJIIIIZZ(4);
        Integer numValueOf = Integer.valueOf(C20736316Cj.LIZIZ(R.attr.a1b, C1834150xpV.LJII(context)));
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJI = numValueOf;
        tuxSheet.LLJJIJIIJIL = false;
        tuxSheet.LLILLL = true;
        tuxSheet.LLJLLL = false;
        tuxSheet.LL = new DialogInterfaceOnCancelListenerC521720Kd8(this, 0);
        tuxSheet.LLILLJJLI = new DialogInterfaceOnDismissListenerC521770KdD(this, 0);
        tuxSheet.show(fragmentManager, "LightSurveyFeedbackSheet");
        this.LLILZIL = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C483000Iws(this, null), 3);
        if (!this.LLIZLLLIL) {
            this.LLIZLLLIL = true;
            InterfaceC483180IxA interfaceC483180IxA = this.LLIZ;
            if (interfaceC483180IxA != null) {
                interfaceC483180IxA.LIZIZ(map);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(C1834150xpV.LIZJ(layoutInflater), R.layout.hm2, viewGroup, false);
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
