package com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.newpost.view.fragment;

import X.C019F;
import X.C01D1;
import X.C09JN;
import X.C0J1N;
import X.C0UO0;
import X.C11RD;
import X.C11S5;
import X.C13LE;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C1622206Wu;
import X.C16FS;
import X.C16FZ;
import X.C1701940uOG;
import X.C19719912Dl;
import X.C19EG;
import X.C2097608Jq;
import X.C2217381BqS;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C480460Ism;
import X.C500980Jkm;
import X.C501690Jlv;
import X.C501710Jlx;
import X.C501720Jly;
import X.C501730Jlz;
import X.C501750Jm1;
import X.C501760Jm2;
import X.C501770Jm3;
import X.C501780Jm4;
import X.C501790Jm5;
import X.C501810Jm7;
import X.C501820Jm8;
import X.C501830Jm9;
import X.C510380Jzw;
import X.C723850SaN;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C987103tV;
import X.EnumC510330Jzr;
import X.InterfaceC1555100qZQ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724760Sbq;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.chatroom.api.SpaceTopicCategory;
import com.bytedance.android.livesdk.chatroom.api.SpaceTopicContent;
import com.bytedance.android.livesdk.chatroom.api.SpaceTopicInfo;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.model.repository.SubOnlySpaceApi;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.newpost.vm.SubSpaceNewPostVM;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.sub.SpaceTip;
import webcast.api.sub.TopicByCategory;
import webcast.api.sub.TopicResponse;

/* JADX INFO: loaded from: classes8.dex */
public final class SubOnlySpacePostTopicFragment extends LiveDialogFragment {
    public static final C501690Jlv LLIZLLLIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZzwmKjYvOyYjPCwjJ2ExPTYlJyogO2s8LDHELIOS04O2s/PC0gOCQvLGE9LTI8JjwnZjMlLDh9LjctLiI2JjFiGjoxBysgMBwjKSYpGSAgPBEjOSYwDjctLiI2JjE=";
    public C16FS LL;
    public final AssemVMLazy LLILLJJLI;
    public C501810Jm7 LLILLL;
    public String LLILZ;
    public TopicResponse.ResponseData LLILZIL;
    public SpaceTip LLILZLL;
    public FrameLayout LLIZ;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0Jlv] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SubOnlySpacePostTopicFragment.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/subscription/business/perks/subspace/newpost/vm/SubSpaceNewPostVM;", 0);
        C13LE.LIZ.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLIZLLLIL = new Object() { // from class: X.0Jlv
        };
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    public SubOnlySpacePostTopicFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SubSpaceNewPostVM.class);
        C501710Jlx c501710Jlx = new C501710Jlx(c19719912DlLIZ);
        C501830Jm9 c501830Jm9 = new C501830Jm9();
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), c501710Jlx, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new C501750Jm1(this), c501830Jm9, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c501710Jlx, new C501760Jm2(this), c501830Jm9, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), c501710Jlx, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new C501770Jm3(this), c501830Jm9, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLILLJJLI = assemVMLazy;
        this.LLILZ = "";
    }

    public final C501810Jm7 MR() {
        if (this.LLILLL == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJFF(this, null), "source_default_key", C501810Jm7.class, null);
            this.LLILLL = interfaceC1555100qZQLIZIZ != null ? (C501810Jm7) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLILLL;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.gls);
        c500980Jkm.LIZJ = R.style.ahk;
        c500980Jkm.LJI = 0.5f;
        c500980Jkm.LJII = 80;
        c500980Jkm.LJIIJJI = 60;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1554960qZC.LIZ(C1558360qeg.LJFF(this, null), new C501810Jm7(), C501810Jm7.class, "source_default_key");
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        RecyclerView recyclerView;
        SpaceTopicInfo spaceTopicInfo;
        C501810Jm7 c501810Jm7MR;
        C501820Jm8 c501820Jm8;
        SpaceTopicInfo spaceTopicInfo2;
        SpaceTopicContent spaceTopicContent;
        C501810Jm7 c501810Jm7MR2;
        C501820Jm8 c501820Jm82;
        SpaceTopicInfo spaceTopicInfo3;
        SpaceTopicCategory spaceTopicCategory;
        C501810Jm7 c501810Jm7MR3;
        C501820Jm8 c501820Jm83;
        List<TopicByCategory> list;
        C501810Jm7 c501810Jm7MR4;
        C501820Jm8 c501820Jm84;
        super.onViewCreated(view, bundle);
        AssemVMLazy assemVMLazy = this.LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJ;
        ((SubSpaceNewPostVM) assemVMLazy.getValue()).LL = C1558360qeg.LJFF(this, null);
        this.LLILLJJLI.getValue();
        C19EG activity = getActivity();
        if (activity != null) {
            activity.getSupportFragmentManager();
        }
        C501810Jm7 c501810Jm7MR5 = MR();
        if (c501810Jm7MR5 != null) {
            c501810Jm7MR5.LLILLJJLI = this.LLILZ;
        }
        TopicResponse.ResponseData responseData = this.LLILZIL;
        if (responseData != null && (list = responseData.topicByCategoryList) != null && (c501810Jm7MR4 = MR()) != null && (c501820Jm84 = c501810Jm7MR4.LL) != null) {
            c501820Jm84.LIZ = list;
        }
        SpaceTip spaceTip = this.LLILZLL;
        if (spaceTip != null && (spaceTopicInfo3 = spaceTip.topicInfo) != null && (spaceTopicCategory = spaceTopicInfo3.spaceTopicCategory) != null && (c501810Jm7MR3 = MR()) != null && (c501820Jm83 = c501810Jm7MR3.LL) != null) {
            c501820Jm83.LIZIZ = spaceTopicCategory;
        }
        SpaceTip spaceTip2 = this.LLILZLL;
        if (spaceTip2 != null && (spaceTopicInfo2 = spaceTip2.topicInfo) != null && (spaceTopicContent = spaceTopicInfo2.spaceTopicContent) != null && (c501810Jm7MR2 = MR()) != null && (c501820Jm82 = c501810Jm7MR2.LL) != null) {
            c501820Jm82.LIZLLL = spaceTopicContent;
        }
        SpaceTip spaceTip3 = this.LLILZLL;
        if (spaceTip3 != null && (spaceTopicInfo = spaceTip3.topicInfo) != null && (c501810Jm7MR = MR()) != null && (c501820Jm8 = c501810Jm7MR.LL) != null) {
            c501820Jm8.LJ = spaceTopicInfo;
        }
        this.LLIZ = (FrameLayout) view.findViewById(R.id.nlo);
        View view2 = getView();
        if (view2 != null) {
            recyclerView = (RecyclerView) view2.findViewById(R.id.yf9);
        } else {
            recyclerView = null;
        }
        if (recyclerView != null) {
            C723850SaN.LIZ(this, false, null, new C501730Jlz(this, recyclerView), 3);
        }
        C723850SaN.LIZ(this, false, null, new C501790Jm5(this), 3);
        if (this.LLILZIL == null) {
            Context context = getContext();
            if (context != null) {
                FrameLayout frameLayout = this.LLIZ;
                if (frameLayout != null && frameLayout.getChildCount() == 0) {
                    C16FZ c16fz = new C16FZ(context, null);
                    FrameLayout frameLayout2 = this.LLIZ;
                    if (frameLayout2 != null) {
                        frameLayout2.addView(c16fz);
                    }
                }
                FrameLayout frameLayout3 = this.LLIZ;
                if (frameLayout3 != null) {
                    C786410Ut5.LJZ(0, frameLayout3);
                }
            }
            final SubSpaceNewPostVM subSpaceNewPostVM = (SubSpaceNewPostVM) this.LLILLJJLI.getValue();
            final C501780Jm4 c501780Jm4 = new C501780Jm4(this);
            final C501720Jly c501720Jly = new C501720Jly(this);
            C480460Ism.LIZ().getClass();
            C0J1N c0j1n = (C0J1N) C510380Jzw.LJIILJJIL(((SubOnlySpaceApi) C480460Ism.LIZLLL(SubOnlySpaceApi.class)).getSpaceTopics(), EnumC510330Jzr.GENERAL, "SubSpaceNewPostVM", "sub/space/topics", C2097608Jq.LJ(), AFwS237S0000000_7.get$arr$(353)).LJL(C11S5.LIZ()).LJIILIIL(new C0UO0()).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(C11RD.LJ(subSpaceNewPostVM));
            if (c0j1n != null) {
                c0j1n.LIZ(new C09JN() { // from class: X.0JmA
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        TopicResponse.ResponseData responseData2;
                        List<TopicByCategory> list2;
                        ArrayList<AbstractC503810JpL> arrayList;
                        ArrayList<AbstractC503810JpL> arrayList2;
                        C501820Jm8 c501820Jm85;
                        C501810Jm7 c501810Jm7XQ2;
                        C501820Jm8 c501820Jm86;
                        C1C7U.LIZ("SubSpaceNewPostVM@270e.fetchTopics$1");
                        BaseResponse baseResponse = (BaseResponse) obj;
                        SubSpaceNewPostVM subSpaceNewPostVM2 = subSpaceNewPostVM;
                        SpaceTopicCategory spaceTopicCategory2 = null;
                        if (baseResponse != null) {
                            responseData2 = (TopicResponse.ResponseData) baseResponse.data;
                        } else {
                            responseData2 = null;
                        }
                        subSpaceNewPostVM2.getClass();
                        if (responseData2 != null) {
                            List<TopicByCategory> list3 = responseData2.topicByCategoryList;
                            if (list3 != null && (c501810Jm7XQ2 = subSpaceNewPostVM2.xQ2()) != null && (c501820Jm86 = c501810Jm7XQ2.LL) != null) {
                                c501820Jm86.LIZ = list3;
                            }
                            list2 = responseData2.topicByCategoryList;
                        } else {
                            list2 = null;
                        }
                        C501810Jm7 c501810Jm7XQ22 = subSpaceNewPostVM2.xQ2();
                        if (c501810Jm7XQ22 != null && (c501820Jm85 = c501810Jm7XQ22.LL) != null) {
                            spaceTopicCategory2 = c501820Jm85.LIZIZ;
                        }
                        ArrayList<AbstractC503810JpL> arrayListYQ2 = subSpaceNewPostVM2.yQ2(list2, spaceTopicCategory2);
                        if (arrayListYQ2 != null) {
                            C502390Jn3 c502390Jn3 = subSpaceNewPostVM2.LLILLL;
                            if (c502390Jn3 != null && (arrayList2 = c502390Jn3.LL) != null) {
                                arrayList2.clear();
                            }
                            C502390Jn3 c502390Jn32 = subSpaceNewPostVM2.LLILLL;
                            if (c502390Jn32 != null && (arrayList = c502390Jn32.LL) != null) {
                                arrayList.addAll(arrayListYQ2);
                            }
                            C502390Jn3 c502390Jn33 = subSpaceNewPostVM2.LLILLL;
                            if (c502390Jn33 != null) {
                                c502390Jn33.notifyDataSetChanged();
                            }
                        }
                        c501780Jm4.invoke();
                        C1C7U.LIZIZ("SubSpaceNewPostVM@270e.fetchTopics$1");
                    }
                }, new C09JN() { // from class: X.07y5
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        C1C7U.LIZ("SubSpaceNewPostVM@270e.fetchTopics$2");
                        c501720Jly.invoke(obj);
                        C1C7U.LIZIZ("SubSpaceNewPostVM@270e.fetchTopics$2");
                    }
                });
            }
        }
    }
}
