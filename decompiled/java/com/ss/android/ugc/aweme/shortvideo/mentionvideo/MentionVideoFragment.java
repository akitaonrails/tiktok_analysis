package com.ss.android.ugc.aweme.shortvideo.mentionvideo;

import X.AbstractC480470Isn;
import X.C098200Yq;
import X.C0LAB;
import X.C0TLZ;
import X.C11VF;
import X.C1390130mHL;
import X.C1685300txQ;
import X.C1697810uHb;
import X.C189200o6;
import X.C19774712Yn;
import X.C19EG;
import X.C19GS;
import X.C20684815ws;
import X.C21594319fB;
import X.C2188811AlT;
import X.C297750Bll;
import X.C580270MpN;
import X.C746340TPk;
import X.C786410Ut5;
import X.InterfaceC1220720hs6;
import X.InterfaceC836760Ws6;
import Y.ACListenerS163S0100000_29;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.api.VideoInfoFromURLResponse;
import com.ss.android.ugc.aweme.api.VideoRelatedInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.mentionvideo.MentionVideoFragment;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
@InterfaceC836760Ws6
public final class MentionVideoFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYkJj0nPiwoLCHELIOSB9JSAiPSY8JjMlLSo8ZggpJzs6JysaICs2JwM+KCg+LSs4";
    public C746340TPk LLIZLLLIL;
    public C21594319fB LLJ;
    public C1390130mHL LLJI;
    public int LLJJ;
    public String LLJJI;
    public VideoPublishEditModel LLJJIII;
    public String LLIZ = "";
    public final ArrayList<C0TLZ> LLJIJIL = new ArrayList<>();
    public final ArrayList<Fragment> LLJILJIL = new ArrayList<>();
    public String LLJILJILJ = "";
    public String LLJILLL = "";

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        getActivity();
    }

    public final <T extends View> T SR(int i) {
        T t;
        View view = getView();
        if (view != null && (t = (T) view.findViewById(i)) != null) {
            return t;
        }
        throw new IllegalStateException("can't find view");
    }

    public final void VR(int i) {
        boolean z;
        C746340TPk c746340TPk = this.LLIZLLLIL;
        if (c746340TPk == null) {
            c746340TPk = null;
        }
        ArrayList<C0TLZ> arrayList = this.LLJIJIL;
        int i2 = 0;
        for (C0TLZ c0tlz : arrayList) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                C0TLZ c0tlz2 = c0tlz;
                if (i2 == i) {
                    z = true;
                } else {
                    z = false;
                }
                c0tlz2.LIZIZ = z;
                i2 = i3;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        c746340TPk.LIZJ(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v42, types: [X.0neT] */
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
    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        VideoPublishEditModel videoPublishEditModel;
        String string2;
        int i;
        String string3;
        String string4;
        String string5;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        String str = "";
        if (arguments == null || (string = arguments.getString("creation_id")) == null) {
            string = "";
        }
        this.LLJJI = string;
        Bundle arguments2 = getArguments();
        String str2 = null;
        if (arguments2 != null) {
            videoPublishEditModel = (VideoPublishEditModel) arguments2.getSerializable("args");
        } else {
            videoPublishEditModel = null;
        }
        this.LLJJIII = videoPublishEditModel;
        Bundle arguments3 = getArguments();
        if (arguments3 == null || (string2 = arguments3.getString("enter_from")) == null) {
            string2 = "";
        }
        this.LLIZ = string2;
        Bundle arguments4 = getArguments();
        if (arguments4 != null && !arguments4.getBoolean("need_title_bar", true)) {
            C786410Ut5.LJLLLLLL(8, SR(R.id.y08));
        }
        this.LLJI = (C1390130mHL) SR(R.id.nmj);
        C786410Ut5.Q7((ImageView) SR(R.id.e1r), new ACListenerS163S0100000_29(this, 81));
        this.LLIZLLLIL = (C746340TPk) SR(R.id.video_filter_list);
        C21594319fB c21594319fB = (C21594319fB) SR(R.id.video_list_viewpager);
        this.LLJ = c21594319fB;
        c21594319fB.setOffscreenPageLimit(3);
        Bundle arguments5 = getArguments();
        if (arguments5 != null && (string3 = arguments5.getString("music_id")) != null) {
            this.LLJILJILJ = string3;
            Bundle arguments6 = getArguments();
            if (arguments6 == null || (string4 = arguments6.getString("music_title")) == null) {
                string4 = "";
            }
            Bundle arguments7 = getArguments();
            if (arguments7 != null && (string5 = arguments7.getString("music_author")) != null) {
                str = string5;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(string4);
            sbLIZ.append(" — ");
            sbLIZ.append(str);
            this.LLJILLL = C2188811AlT.LIZIZ(sbLIZ);
        }
        C11VF c11vf = C11VF.LIZIZ;
        String str3 = this.LLJJI;
        if (str3 == null) {
            str3 = null;
        }
        c11vf.setCreationId(str3);
        ArrayList<C0TLZ> arrayList = this.LLJIJIL;
        if (this.LLJILJILJ.length() > 0 && this.LLJILLL.length() > 0) {
            arrayList.add(new C0TLZ(getString(2131830021)));
            this.LLJILJIL.add(c11vf.LJIIJJI(this.LLJILJILJ, this.LLJILLL));
        }
        arrayList.add(new C0TLZ(getString(2131830020)));
        this.LLJILJIL.add(c11vf.LJIIIZ(6));
        if (C297750Bll.LIZ()) {
            i = 2131830019;
        } else {
            i = 2131830018;
        }
        arrayList.add(new C0TLZ(getString(i)));
        this.LLJILJIL.add(c11vf.LJIIIZ(9));
        arrayList.add(new C0TLZ(getString(2131830017)));
        this.LLJILJIL.add(c11vf.LIZJ());
        C21594319fB c21594319fB2 = this.LLJ;
        if (c21594319fB2 == null) {
            c21594319fB2 = null;
        }
        final FragmentManager childFragmentManager = getChildFragmentManager();
        c21594319fB2.setAdapter(new AbstractC480470Isn(childFragmentManager) { // from class: X.11VE
            @Override // androidx.viewpager.widget.PagerAdapter
            public final int getCount() {
                return this.LLIZ.LLJILJIL.size();
            }

            @Override // androidx.viewpager.widget.PagerAdapter
            public final CharSequence LJIJJLI(int i2) {
                return ((C0TLZ) ListProtector.get(this.LLIZ.LLJIJIL, i2)).LIZ;
            }

            @Override // X.AbstractC480470Isn
            public final Fragment LJJIJIL(int i2) {
                return (Fragment) ListProtector.get(this.LLIZ.LLJILJIL, i2);
            }
        });
        C746340TPk c746340TPk = this.LLIZLLLIL;
        if (c746340TPk == null) {
            c746340TPk = null;
        }
        c746340TPk.LIZJ(this.LLJIJIL);
        C746340TPk c746340TPk2 = this.LLIZLLLIL;
        if (c746340TPk2 == null) {
            c746340TPk2 = null;
        }
        c746340TPk2.setCallback(new AwS608S0100000_29(this, 224));
        C21594319fB c21594319fB3 = this.LLJ;
        if (c21594319fB3 == null) {
            c21594319fB3 = null;
        }
        c21594319fB3.addOnPageChangeListener(new C19774712Yn(this, 6));
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", "video_post_page");
        String str4 = this.LLJJI;
        if (str4 != null) {
            str2 = str4;
        }
        c0lab.LJ("creation_id", str2);
        C20684815ws.LJIILLIIL("show_credits_page", c0lab.LIZ);
        C19EG activity = getActivity();
        if (activity != null) {
            c11vf.LIZIZ(activity, new InterfaceC1220720hs6() { // from class: X.0neT
                @Override // X.InterfaceC1220720hs6
                public final void LIZ(Integer num) {
                    if (num != null) {
                        num.intValue();
                        this.LIZ.LLJJ = num.intValue();
                    }
                }

                @Override // X.InterfaceC1220720hs6
                public final void LIZIZ(Boolean bool) {
                    if (bool != null) {
                        bool.booleanValue();
                        if (bool.booleanValue()) {
                            C1390130mHL c1390130mHL = this.LIZ.LLJI;
                            if (c1390130mHL == null) {
                                c1390130mHL = null;
                            }
                            C786410Ut5.LLZ(c1390130mHL, 0);
                        }
                    }
                }

                @Override // X.InterfaceC1220720hs6
                public final void LIZJ(C1220690hs3 c1220690hs3) {
                    String str5;
                    MentionVideoFragment mentionVideoFragment = this.LIZ;
                    mentionVideoFragment.getClass();
                    switch (c1220690hs3.LIZIZ) {
                        case 8:
                            str5 = "sound";
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            str5 = "liked";
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            str5 = "favorites";
                            break;
                        default:
                            str5 = "posted";
                            break;
                    }
                    C0LAB c0lab2 = new C0LAB();
                    VideoPublishEditModel videoPublishEditModel2 = mentionVideoFragment.LLJJIII;
                    if (videoPublishEditModel2 != null) {
                        C580270MpN.LIZJ(videoPublishEditModel2, c0lab2, mentionVideoFragment.LLIZ);
                        c0lab2.LJ("to_item_id", c1220690hs3.LIZ);
                        c0lab2.LJ("tab_name", str5);
                        C20684815ws.LJIILLIIL("credit_video_preview", c0lab2.LIZ);
                    }
                }

                @Override // X.InterfaceC1220720hs6
                public final void LIZLLL(C0ZIK c0zik) throws Throwable {
                    if (c0zik == null) {
                        return;
                    }
                    MentionVideoFragment mentionVideoFragment = this.LIZ;
                    mentionVideoFragment.getClass();
                    int i2 = c0zik.subType;
                    String str5 = c0zik.enterMethod;
                    String str6 = "";
                    if (str5 == null) {
                        str5 = "";
                    }
                    String str7 = c0zik.aid;
                    if (str7 != null) {
                        str6 = str7;
                    }
                    mentionVideoFragment.UR(i2, str5, str6);
                    Intent intent = new Intent();
                    intent.putExtra("chainInfo", c0zik);
                    C19EG activity2 = mentionVideoFragment.getActivity();
                    if (activity2 != null) {
                        C2204961BRm.LLJJIJIL(-1, intent, activity2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhkcfLnYUSB+zx062jwoIGBAAv28Dg8tadplF13SbCu0pJ", null));
                    }
                    C19EG activity3 = mentionVideoFragment.getActivity();
                    if (activity3 != null) {
                        activity3.finish();
                    }
                }

                @Override // X.InterfaceC1220720hs6
                public final void LJ(Pair<VideoInfoFromURLResponse, String> pair) throws Throwable {
                    Long lValueOf;
                    if (pair == null) {
                        return;
                    }
                    MentionVideoFragment mentionVideoFragment = this.LIZ;
                    VideoInfoFromURLResponse first = pair.getFirst();
                    String second = pair.getSecond();
                    int i2 = mentionVideoFragment.LLJJ;
                    VideoRelatedInfo videoRelatedInfo = first.videoInfo;
                    if (videoRelatedInfo != null) {
                        lValueOf = Long.valueOf(videoRelatedInfo.awemeId);
                    } else {
                        lValueOf = null;
                    }
                    mentionVideoFragment.UR(i2, second, String.valueOf(lValueOf));
                    Intent intent = new Intent();
                    int i3 = mentionVideoFragment.LLJJ;
                    if (i3 != 0) {
                        intent.putExtra("mention_video_Info_with_subtype", new C0ZIQ(first, i3, second));
                    }
                    C19EG activity2 = mentionVideoFragment.getActivity();
                    if (activity2 != null) {
                        C2204961BRm.LLJJIJIL(-1, intent, activity2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhkcfLnYUSB+zx062jwoIGBAAv28Dg8tadplF13SbCu0pJ", null));
                    }
                    C19EG activity3 = mentionVideoFragment.getActivity();
                    if (activity3 != null) {
                        activity3.finish();
                    }
                }
            });
        }
        VR(0);
    }

    public final void UR(int i, String str, String str2) {
        String str3;
        String str4;
        switch (i) {
            case 8:
                str3 = "sound";
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                str3 = "liked";
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                str3 = "favorites";
                break;
            default:
                str3 = "posted";
                break;
        }
        if (Intrinsics.LJFF(str, "click_panel")) {
            str4 = "dot";
        } else if (Intrinsics.LJFF(str, "click_preview")) {
            str4 = "confirm";
        } else {
            str4 = "";
        }
        C0LAB c0lab = new C0LAB();
        VideoPublishEditModel videoPublishEditModel = this.LLJJIII;
        if (videoPublishEditModel != null) {
            C580270MpN.LIZJ(videoPublishEditModel, c0lab, this.LLIZ);
            c0lab.LJ("tab_name", str3);
            c0lab.LJ("enter_method", str4);
            c0lab.LJ("to_item_id", str2);
            C20684815ws.LJIILLIIL("add_credit_video", c0lab.LIZ);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.c8w, viewGroup, false);
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
