package com.ss.android.ugc.aweme.story.note.panel;

import X.C01GW;
import X.C098200Yq;
import X.C0HCL;
import X.C0I7D;
import X.C13LP;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20584815gk;
import X.C23250099c;
import X.C418440Gaw;
import X.C437160HCg;
import X.C438290HGp;
import X.C438330HGt;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1257160ios;
import Y.ACListenerS141S0100000_6;
import Y.AObserverS171S0200000_6;
import Y.AObserverS207S0100000_3;
import Y.AObserverS210S0100000_6;
import Y.ARunnableS106S0100000_6;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
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
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class StoryNotePanelUserFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjY4Jj0qZisjPSHELIOSp9OCQiLCN9GzEjOzYdJzEpGS49LSkZOiohDjctLiI2JjE=";
    public AvatarComponentView LLIZ;
    public C20584815gk LLIZLLLIL;
    public AvatarComponentView LLJ;
    public TuxTextView LLJI;
    public View LLJIJIL;
    public C0I7D LLJILJIL;
    public TuxIconView LLJILJILJ;
    public FrameLayout LLJILLL;
    public C437160HCg LLJJ;
    public LinearLayout LLJJI;
    public TuxIconView LLJJIII;
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS550S0100000_6(this, 726));
    public final Map<String, Bitmap> LLJJIJIIJIL = new LinkedHashMap();

    public final StoryNotePanelUserVM UR() {
        return (StoryNotePanelUserVM) this.LLJJIJI.getValue();
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
            StoryNotePanelUserVM storyNotePanelUserVMUR = UR();
            storyNotePanelUserVMUR.LL = storyNoteDataCollection;
            storyNotePanelUserVMUR.LLILLJJLI = string;
            storyNotePanelUserVMUR.LLILLL = str;
            MutableLiveData<Boolean> mutableLiveData = storyNotePanelUserVMUR.LLJIJIL;
            Boolean bool = Boolean.FALSE;
            mutableLiveData.setValue(bool);
            storyNotePanelUserVMUR.LLJILLL.setValue(bool);
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(storyNotePanelUserVMUR), null, null, new C438290HGp(storyNoteDataCollection, storyNotePanelUserVMUR, null), 3);
        }
    }

    public final Bitmap SR(int i, List<String> list) {
        String str = (String) C13LP.LJJJLZIJ(i, list);
        Bitmap bitmapCreateScaledBitmap = null;
        if (str == null) {
            return null;
        }
        Bitmap bitmap = (Bitmap) ((LinkedHashMap) this.LLJJIJIIJIL).get(str);
        if (bitmap != null) {
            return bitmap;
        }
        int iLIZIZ = (int) (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(25)) * 1.5f);
        Paint paint = new Paint(1);
        paint.setTextSize(iLIZIZ);
        paint.setColor(-16777216);
        paint.setTextAlign(Paint.Align.LEFT);
        float f = -paint.ascent();
        int iMeasureText = (int) (paint.measureText(str) + 0.5f);
        int iDescent = (int) (paint.descent() + f + 0.5f);
        if (iMeasureText > 0 && iDescent > 0) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMeasureText, iDescent, Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.eraseColor(0);
            new Canvas(bitmapCreateBitmap).drawText(str, 0.0f, f, paint);
            bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateBitmap, iLIZIZ, iLIZIZ, true);
        }
        this.LLJJIJIIJIL.put(str, bitmapCreateScaledBitmap);
        return bitmapCreateScaledBitmap;
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
        this.LLJIJIL = view.findViewById(R.id.ylc);
        this.LLJILJIL = (C0I7D) view.findViewById(R.id.hdk);
        this.LLJILJILJ = (TuxIconView) view.findViewById(R.id.lw_);
        this.LLJILLL = (FrameLayout) view.findViewById(R.id.ftz);
        this.LLJJ = (C437160HCg) view.findViewById(R.id.ftt);
        this.LLJJI = (LinearLayout) view.findViewById(R.id.nia);
        this.LLJJIII = (TuxIconView) view.findViewById(R.id.lf2);
        C20584815gk c20584815gk = this.LLIZLLLIL;
        if (c20584815gk != null) {
            c20584815gk.setBubbleStyle(EnumC1257160ios.NORMAL);
            c20584815gk.setMaxWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(262.0f))));
            StoryNoteDataCollection storyNoteDataCollection = UR().LL;
            if (storyNoteDataCollection != null) {
                list = storyNoteDataCollection.textExtras;
            } else {
                list = null;
            }
            c20584815gk.setMentionText(list);
            c20584815gk.setThoughtData(UR().LL);
            c20584815gk.setEnterFrom(UR().LLILLJJLI);
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
                View viewFindViewById = this.LLIZ;
                if (viewFindViewById == null) {
                    View view2 = getView();
                    if (view2 != null) {
                        viewFindViewById = view2.findViewById(R.id.bh2);
                    } else {
                        viewFindViewById = null;
                    }
                    this.LLIZ = (AvatarComponentView) viewFindViewById;
                }
                View view3 = viewFindViewById;
                if (view3 != null) {
                    height = view3.getHeight();
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
            HandlerHook.viewPost(avatarComponentView2, new ARunnableS106S0100000_6(this, 2));
        }
        TuxIconView tuxIconView = this.LLJJIII;
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS141S0100000_6(this, 3));
        }
        FrameLayout frameLayout = this.LLJILLL;
        if (frameLayout != null) {
            C786410Ut5.O7(frameLayout, new ACListenerS141S0100000_6(this, 4));
        }
        TuxIconView tuxIconView2 = this.LLJILJILJ;
        if (tuxIconView2 != null) {
            C786410Ut5.a9(tuxIconView2, new ACListenerS141S0100000_6(this, 5));
        }
        View view4 = this.LLJIJIL;
        if (view4 != null) {
            C786410Ut5.I7(new ACListenerS141S0100000_6(this, 6), view4);
        }
        UR().LLIZLLLIL.observe(getViewLifecycleOwner(), new AObserverS210S0100000_6(this, 7));
        UR().LLJILJIL.observe(getViewLifecycleOwner(), new AObserverS210S0100000_6(this, 8));
        MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(UR().LLIZLLLIL, new AObserverS171S0200000_6(mediatorLiveData, this, 0));
        mediatorLiveData.addSource(UR().LLJI, new AObserverS171S0200000_6(mediatorLiveData, this, 1));
        mediatorLiveData.observe(getViewLifecycleOwner(), new AObserverS210S0100000_6(this, 4));
        UR().LLJJ.observe(getViewLifecycleOwner(), new AObserverS210S0100000_6(this, 9));
        UR().LLJJI.observe(getViewLifecycleOwner(), new AObserverS210S0100000_6(this, 10));
        UR().LLJJIII.observe(getViewLifecycleOwner(), new AObserverS210S0100000_6(this, 0));
        UR().LLJJIJIIJIL.observe(getViewLifecycleOwner(), new AObserverS210S0100000_6(this, 1));
        UR().LLJJJ.observe(getViewLifecycleOwner(), new AObserverS210S0100000_6(this, 2));
        UR().LLJJJJ.observe(getViewLifecycleOwner(), new AObserverS210S0100000_6(this, 3));
        UR().LLJJJJLIIL.observe(getViewLifecycleOwner(), new AObserverS207S0100000_3(this, 0));
        UR().LLJJLIIIJLLLLLLLZ.observe(getViewLifecycleOwner(), new AObserverS210S0100000_6(this, 5));
        UR().LLJLIL.observe(getViewLifecycleOwner(), new AObserverS210S0100000_6(this, 6));
        StoryNotePanelUserVM storyNotePanelUserVMUR = UR();
        storyNotePanelUserVMUR.getClass();
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(storyNotePanelUserVMUR), null, null, new C438330HGt(storyNotePanelUserVMUR, null), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.fdu, viewGroup, false);
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
