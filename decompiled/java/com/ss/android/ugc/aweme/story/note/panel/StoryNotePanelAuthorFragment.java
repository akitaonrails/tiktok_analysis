package com.ss.android.ugc.aweme.story.note.panel;

import X.C01GW;
import X.C098200Yq;
import X.C0HCL;
import X.C1256560inu;
import X.C1400005du;
import X.C1685300txQ;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C20584815gk;
import X.C23250099c;
import X.C418440Gaw;
import X.C452501pT;
import X.C461720I8s;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1256590inx;
import X.EnumC1257160ios;
import Y.ACListenerS141S0100000_6;
import Y.AObserverS207S0100000_3;
import Y.ARunnableS106S0100000_6;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.feed.model.story.StoryNoteDataCollection;
import com.ss.android.ugc.aweme.feed.model.story.StoryNoteTextExtra;
import com.ss.android.ugc.aweme.story.note.IStoryThoughtMyDataManager;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS603S0100000_24;

/* JADX INFO: loaded from: classes7.dex */
public final class StoryNotePanelAuthorFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjY4Jj0qZisjPSp9HELIOSOCQiLCN9GzEjOzYdJzEpGS49LSkNPDs7JzcKOy40JSAiPQ==";
    public AvatarComponentView LLIZ;
    public C20584815gk LLIZLLLIL;
    public AvatarComponentView LLJ;
    public TuxTextView LLJI;
    public C197039127h LLJIJIL;
    public TuxIconView LLJILJIL;
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 725));
    public long LLJILLL;

    public final StoryNotePanelAuthorVM SR() {
        return (StoryNotePanelAuthorVM) this.LLJILJILJ.getValue();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        StoryNotePanelAuthorVM storyNotePanelAuthorVMSR = SR();
        ((IStoryThoughtMyDataManager) storyNotePanelAuthorVMSR.LLILZ.getValue()).WB0(storyNotePanelAuthorVMSR);
        super.onDestroy();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLIZ = null;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        StoryNoteDataCollection storyNoteDataCollection;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            Serializable serializable = arguments.getSerializable("StoryNoteDataCollectionKey");
            Integer num = null;
            if (serializable instanceof StoryNoteDataCollection) {
                storyNoteDataCollection = (StoryNoteDataCollection) serializable;
            } else {
                storyNoteDataCollection = null;
            }
            String string = arguments.getString("enter_from");
            String str = "";
            if (string == null) {
                string = "";
            }
            String string2 = arguments.getString("enter_method");
            if (string2 != null) {
                str = string2;
            }
            StoryNotePanelAuthorVM storyNotePanelAuthorVMSR = SR();
            storyNotePanelAuthorVMSR.LLILLJJLI = string;
            storyNotePanelAuthorVMSR.LLILLL = str;
            if (((IStoryThoughtMyDataManager) storyNotePanelAuthorVMSR.LLILZ.getValue()).XO()) {
                StoryNoteDataCollection storyNoteDataCollectionKO = ((IStoryThoughtMyDataManager) storyNotePanelAuthorVMSR.LLILZ.getValue()).KO(false);
                if (storyNoteDataCollectionKO != null) {
                    num = storyNoteDataCollectionKO.publishPrivacySetting;
                }
                MutableLiveData<Integer> mutableLiveData = storyNotePanelAuthorVMSR.LLILZIL;
                if (num == null) {
                    num = -1;
                }
                mutableLiveData.setValue(num);
                storyNotePanelAuthorVMSR.LL = storyNoteDataCollectionKO;
                MutableLiveData<Boolean> mutableLiveData2 = storyNotePanelAuthorVMSR.LLIZ;
                Boolean bool = Boolean.FALSE;
                mutableLiveData2.setValue(bool);
                storyNotePanelAuthorVMSR.LLJ.setValue(bool);
                return;
            }
            storyNotePanelAuthorVMSR.LL = storyNoteDataCollection;
            storyNotePanelAuthorVMSR.LLJ.setValue(Boolean.TRUE);
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(storyNotePanelAuthorVMSR), null, null, new C1400005du(storyNoteDataCollection, storyNotePanelAuthorVMSR, null), 3);
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Context contextN3;
        Resources resources;
        DisplayMetrics displayMetrics;
        int i;
        int height;
        Context contextN32;
        Resources resources2;
        DisplayMetrics displayMetrics2;
        List<StoryNoteTextExtra> list;
        super.onViewCreated(view, bundle);
        this.LLIZLLLIL = (C20584815gk) view.findViewById(R.id.tv_story_note_bubble);
        this.LLJ = (AvatarComponentView) view.findViewById(R.id.bgr);
        this.LLJI = (TuxTextView) view.findViewById(R.id.tv_story_note_under_text);
        this.LLJIJIL = (C197039127h) view.findViewById(R.id.xfl);
        this.LLJILJIL = (TuxIconView) view.findViewById(R.id.lf2);
        C20584815gk c20584815gk = this.LLIZLLLIL;
        View viewFindViewById = null;
        if (c20584815gk != null) {
            c20584815gk.setBubbleStyle(EnumC1257160ios.NORMAL);
            c20584815gk.setMaxWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(262.0f))));
            StoryNoteDataCollection storyNoteDataCollection = SR().LL;
            if (storyNoteDataCollection != null) {
                list = storyNoteDataCollection.textExtras;
            } else {
                list = null;
            }
            c20584815gk.setMentionText(list);
            c20584815gk.setThoughtData(SR().LL);
            c20584815gk.setEnterFrom(SR().LLILLJJLI);
        }
        Context context = getContext();
        if (context != null && (contextN3 = C786410Ut5.N3(context)) != null && (resources = contextN3.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            if (((int) C0HCL.LIZIZ(displayMetrics.heightPixels, getContext())) <= 640) {
                Context context2 = getContext();
                if (context2 != null && (contextN32 = C786410Ut5.N3(context2)) != null && (resources2 = contextN32.getResources()) != null && (displayMetrics2 = resources2.getDisplayMetrics()) != null) {
                    i = displayMetrics2.heightPixels;
                } else {
                    i = 640;
                }
                float f = i / 640;
                View view2 = this.LLIZ;
                if (view2 == null) {
                    View view3 = getView();
                    if (view3 != null) {
                        viewFindViewById = view3.findViewById(R.id.bh2);
                    }
                    this.LLIZ = (AvatarComponentView) viewFindViewById;
                    view2 = viewFindViewById;
                }
                View view4 = view2;
                if (view4 != null) {
                    height = view4.getHeight();
                } else {
                    height = 88;
                }
                int i2 = (int) (f * height);
                AvatarComponentView avatarComponentView = this.LLJ;
                if (avatarComponentView != null) {
                    ViewGroup.LayoutParams layoutParams = avatarComponentView.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.height = i2;
                        layoutParams.width = i2;
                        C786410Ut5.W5(avatarComponentView, layoutParams);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                }
            }
        }
        AvatarComponentView avatarComponentView2 = this.LLJ;
        if (avatarComponentView2 != null) {
            HandlerHook.viewPost(avatarComponentView2, new ARunnableS106S0100000_6(this, 3));
        }
        AvatarComponentView avatarComponentView3 = this.LLJ;
        if (avatarComponentView3 != null) {
            new AwS603S0100000_24(this, 1).invoke(avatarComponentView3.getConfig().LIZ);
            avatarComponentView3.LJFF(avatarComponentView3.getConfig());
        }
        AvatarComponentView avatarComponentView4 = this.LLJ;
        if (avatarComponentView4 != null) {
            C1256560inu.LIZ(C1256560inu.LIZ, avatarComponentView4, this.LLIZLLLIL, getViewLifecycleOwner(), true, null, SR().LL, false, C461720I8s.LIZLLL(), EnumC1256590inx.PANEL, null, null, null, 14824);
        }
        TuxIconView tuxIconView = this.LLJILJIL;
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS141S0100000_6(this, 7));
        }
        C197039127h c197039127h = this.LLJIJIL;
        if (c197039127h != null) {
            C786410Ut5.U8(c197039127h, new ACListenerS141S0100000_6(this, 8));
        }
        SR().LLILZLL.observe(getViewLifecycleOwner(), new Observer() { // from class: X.0HCy
            /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x0098  */
            @Override // androidx.lifecycle.Observer
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onChanged(java.lang.Object r9) {
                /*
                    r8 = this;
                    java.lang.Integer r9 = (java.lang.Integer) r9
                    com.ss.android.ugc.aweme.story.note.panel.StoryNotePanelAuthorFragment r7 = r8.LL
                    com.bytedance.tux.input.TuxTextView r3 = r7.LLJI
                    if (r3 == 0) goto L60
                    int r1 = r9.intValue()
                    r0 = 1
                    r4 = 0
                    if (r1 == 0) goto L8a
                    if (r1 == r0) goto L7c
                    r0 = 2
                    if (r1 == r0) goto L6e
                    java.lang.String r1 = ""
                L17:
                    X.0ID7 r6 = new X.0ID7
                    r0 = 0
                    r6.<init>(r7, r0)
                    android.text.SpannableString r5 = new android.text.SpannableString
                    java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()
                    r2.append(r1)
                    java.lang.String r0 = " · "
                    r2.append(r0)
                    android.content.Context r1 = r7.getContext()
                    if (r1 == 0) goto L38
                    r0 = 2131849039(0x7f116f4f, float:1.93316E38)
                    java.lang.String r4 = r1.getString(r0)
                L38:
                    r2.append(r4)
                    java.lang.String r0 = X.C2188811AlT.LIZIZ(r2)
                    r5.<init>(r0)
                    java.lang.String r4 = r5.toString()
                    java.lang.String r2 = "·"
                    r1 = 6
                    r0 = 0
                    int r0 = kotlin.text.a0.LJJJ(r4, r2, r0, r0, r1)
                    int r2 = r0 + 1
                    java.lang.String r0 = r5.toString()
                    int r1 = r0.length()
                    r0 = 18
                    X.C786410Ut5.p2(r5, r6, r2, r1, r0)
                    r3.setText(r5)
                L60:
                    com.ss.android.ugc.aweme.story.note.panel.StoryNotePanelAuthorFragment r0 = r8.LL
                    com.bytedance.tux.input.TuxTextView r1 = r0.LLJI
                    if (r1 == 0) goto L6d
                    android.text.method.MovementMethod r0 = android.text.method.LinkMovementMethod.getInstance()
                    r1.setMovementMethod(r0)
                L6d:
                    return
                L6e:
                    android.content.Context r1 = r7.getContext()
                    if (r1 == 0) goto L98
                    r0 = 2131849034(0x7f116f4a, float:1.933159E38)
                    java.lang.String r1 = r1.getString(r0)
                    goto L17
                L7c:
                    android.content.Context r1 = r7.getContext()
                    if (r1 == 0) goto L98
                    r0 = 2131849035(0x7f116f4b, float:1.9331593E38)
                    java.lang.String r1 = r1.getString(r0)
                    goto L17
                L8a:
                    android.content.Context r1 = r7.getContext()
                    if (r1 == 0) goto L98
                    r0 = 2131849033(0x7f116f49, float:1.9331588E38)
                    java.lang.String r1 = r1.getString(r0)
                    goto L17
                L98:
                    r1 = r4
                    goto L17
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C437340HCy.onChanged(java.lang.Object):void");
            }
        });
        SR().LLJILJIL.observe(getViewLifecycleOwner(), new AObserverS207S0100000_3(this, 1));
        StoryNotePanelAuthorVM storyNotePanelAuthorVMSR = SR();
        ((IStoryThoughtMyDataManager) storyNotePanelAuthorVMSR.LLILZ.getValue()).e11(storyNotePanelAuthorVMSR, "SCENE_AUTHOR_PANEL_FRAGMENT");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.fdp, viewGroup, false);
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
