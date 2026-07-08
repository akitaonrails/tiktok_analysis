package com.ss.android.ugc.aweme.upvote.detail.replypanel.assem;

import X.C019F;
import X.C10EU;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1353540lKK;
import X.C1356800lPa;
import X.C1358490lSJ;
import X.C1358550lSP;
import X.C1359350lTh;
import X.C1359510lTx;
import X.C1359730lUJ;
import X.C1359850lUV;
import X.C1360460lVU;
import X.C13LE;
import X.C15438062q;
import X.C1559260qg8;
import X.C1637806bA;
import X.C188900o3;
import X.C197039127h;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C2189821An6;
import X.C2217381BqS;
import X.C339190DRl;
import X.C384050F3z;
import X.C418440Gaw;
import X.C438710HIf;
import X.C453740Hqm;
import X.C720360SNm;
import X.C723580SZw;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1359800lUQ;
import X.InterfaceC1359760lUM;
import X.InterfaceC2217461Bqa;
import android.animation.AnimatorSet;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentManager;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.widgets.MentionSpan;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.RecReasonEntry;
import com.ss.android.ugc.aweme.feed.model.RecReasonsStruct;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.poi_api.service.IPoiService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.upvote.detail.input.RepostInputFragment;
import com.ss.android.ugc.aweme.upvote.detail.replypanel.vm.RepostInteractListViewModel;
import com.ss.android.ugc.aweme.upvote.event.UpvotePublishExtraData;
import com.ss.android.ugc.aweme.upvote.event.UpvotePublishMobParam;
import com.zhiliaoapp.musically.R;
import irm.AkS89S0100000_21;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS104S1200000_21;
import kotlin.jvm.internal.AwS456S0200000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes22.dex */
public final class RepostThenNoteAssem extends UIContentAssem implements InterfaceC1359760lUM {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723580SZw(this, C1359850lUV.class, null), checkSupervisorPrepared());
    public final AssemVMLazy LLJ;
    public LinearLayout LLJI;
    public TuxTextView LLJIJIL;
    public TuxIconView LLJILJIL;
    public TuxIconView LLJILJILJ;
    public C197039127h LLJILLL;
    public C197039127h LLJJ;
    public C197039127h LLJJI;
    public Integer LLJJIII;
    public AnimatorSet LLJJIJI;
    public boolean LLJJIJIIJIL;
    public boolean LLJJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(RepostThenNoteAssem.class, "interactVM", "getInteractVM()Lcom/ss/android/ugc/aweme/upvote/detail/replypanel/vm/RepostInteractListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public RepostThenNoteAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(RepostInteractListViewModel.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS565S0100000_21(c19719912DlLIZ, 943), AFwS259S0000000_21.get$arr$(255), null, true);
    }

    @Override // X.InterfaceC1359760lUM
    public final void OH(int i, boolean z) {
    }

    @Override // X.InterfaceC1359760lUM
    public final int R8() {
        return 0;
    }

    @Override // X.InterfaceC1359760lUM
    public final void WF() {
    }

    public final void Go() {
        HashMap<String, Editable> map = C1356800lPa.LIZ;
        Aweme aweme = No().LL;
        String strLIZ = C1356800lPa.LIZ(aweme != null ? aweme.getAid() : null, null, null);
        Jo(strLIZ != null ? C1356800lPa.LIZ.get(strLIZ) : null);
    }

    public final void Lo() {
        AnimatorSet animatorSet = this.LLJJIJI;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.LLJJIJI = null;
    }

    public final RepostInteractListViewModel No() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJ;
        return (RepostInteractListViewModel) assemVMLazy.getValue();
    }

    public final boolean Oo() {
        HashMap<String, Editable> map = C1356800lPa.LIZ;
        Aweme aweme = No().LL;
        String strLIZ = C1356800lPa.LIZ(aweme != null ? aweme.getAid() : null, null, null);
        Editable editable = strLIZ != null ? C1356800lPa.LIZ.get(strLIZ) : null;
        return true ^ (editable == null || editable.length() == 0);
    }

    public final void Vo() {
        Aweme aweme;
        String aid;
        Pair pair;
        String uid;
        String string;
        String string2;
        String tabName;
        int size;
        String requestId;
        C2189821An6 c2189821An6;
        User author;
        User author2;
        ArrayList<TextExtraStruct> arrayList;
        VideoItemParams videoItemParams = No().LLILLJJLI;
        if (videoItemParams == null || (aweme = videoItemParams.getAweme()) == null || (aid = aweme.getAid()) == null) {
            return;
        }
        ArrayList arrayList2 = null;
        String strLIZ = C1356800lPa.LIZ(aid, null, null);
        Editable editableRemove = strLIZ == null ? null : C1356800lPa.LIZ.remove(strLIZ);
        C453740Hqm c453740HqmRemove = strLIZ == null ? null : C1359510lTx.LIZ.remove(strLIZ);
        if (editableRemove != null) {
            String string3 = editableRemove.toString();
            String string4 = a0.LJLJJL(string3).toString();
            int length = string3.length() - string4.length();
            MentionSpan[] mentionSpanArr = (MentionSpan[]) C1353540lKK.LIZJ(editableRemove, MentionSpan.class);
            if (mentionSpanArr != null) {
                arrayList = new ArrayList(mentionSpanArr.length);
                for (MentionSpan mentionSpan : mentionSpanArr) {
                    if (mentionSpan.getType() == 0) {
                        TextExtraStruct textExtraStructLIZ = mentionSpan.LIZ();
                        if (textExtraStructLIZ != null) {
                            textExtraStructLIZ.setStart(editableRemove.getSpanStart(mentionSpan));
                        }
                        TextExtraStruct textExtraStructLIZ2 = mentionSpan.LIZ();
                        if (textExtraStructLIZ2 != null) {
                            textExtraStructLIZ2.setEnd(editableRemove.getSpanEnd(mentionSpan));
                        }
                        TextExtraStruct textExtraStructLIZ3 = mentionSpan.LIZ();
                        if (textExtraStructLIZ3 != null) {
                            arrayList.add(textExtraStructLIZ3.m271clone());
                        }
                    }
                }
            } else {
                arrayList = null;
            }
            if (length > 0 && arrayList != null) {
                for (TextExtraStruct textExtraStruct : arrayList) {
                    textExtraStruct.setStart(textExtraStruct.getStart() - length);
                    textExtraStruct.setEnd(textExtraStruct.getEnd() - length);
                }
            }
            pair = new Pair(a0.LJLILLLLZI(string4).toString(), arrayList);
        } else {
            pair = new Pair(null, null);
        }
        String str = (String) pair.getFirst();
        List list = (List) pair.getSecond();
        String str2 = videoItemParams.mEventType;
        Aweme aweme2 = videoItemParams.getAweme();
        String str3 = "";
        if (aweme2 == null || (author2 = aweme2.getAuthor()) == null || (uid = author2.getUid()) == null) {
            uid = "";
        }
        Aweme aweme3 = videoItemParams.getAweme();
        if (aweme3 == null || (author = aweme3.getAuthor()) == null || (string = Integer.valueOf(author.getFollowStatus()).toString()) == null) {
            string = "";
        }
        Aweme aweme4 = videoItemParams.getAweme();
        if (aweme4 == null || (string2 = Integer.valueOf(aweme4.getAwemeType()).toString()) == null) {
            string2 = "";
        }
        Aweme aweme5 = videoItemParams.getAweme();
        RecReasonEntry recReasonTag = aweme5 != null ? aweme5.getRecReasonTag() : null;
        Aweme aweme6 = videoItemParams.getAweme();
        RecReasonsStruct recReasonsStruct = aweme6 != null ? aweme6.getRecReasonsStruct() : null;
        Aweme aweme7 = videoItemParams.getAweme();
        boolean z = aweme7 != null && C720360SNm.LJI(aweme7);
        IPoiService iPoiService = (IPoiService) PluggableExtentionKt.pluggableSpi$default(IPoiService.class, false, false, false, 14, null);
        String strLLIFFJFJJ = iPoiService != null ? iPoiService.LLIFFJFJJ(videoItemParams.getAweme()) : null;
        BaseFeedPageParams baseFeedPageParams = videoItemParams.baseFeedPageParams;
        if (baseFeedPageParams == null || (c2189821An6 = baseFeedPageParams.param) == null || (tabName = c2189821An6.getTabName()) == null) {
            tabName = "";
        }
        C1359850lUV c1359850lUV = (C1359850lUV) this.LLIZLLLIL.getValue();
        String str4 = c1359850lUV != null ? c1359850lUV.LL : null;
        C1359850lUV c1359850lUV2 = (C1359850lUV) this.LLIZLLLIL.getValue();
        String str5 = c1359850lUV2 != null ? c1359850lUV2.LLILLJJLI : null;
        Aweme aweme8 = videoItemParams.getAweme();
        if (aweme8 != null && (requestId = aweme8.getRequestId()) != null) {
            str3 = requestId;
        }
        if (list != null) {
            size = list.size();
            arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((TextExtraStruct) it2.next()).getUserId());
            }
        } else {
            size = 0;
        }
        UpvotePublishMobParam upvotePublishMobParam = new UpvotePublishMobParam(str2, "recommend_panel", aid, uid, string, null, "recommend_panel", false, null, string2, z, recReasonTag, recReasonsStruct, null, strLLIFFJFJJ, 0.0d, false, null, "list", null, size, C188900o3.LIZ(arrayList2), null, tabName, false, null, null, null, str4, str5, str3, null, null, 0, null, null, null, -1512108576, 64639);
        UpvotePublishExtraData upvotePublishExtraData = new UpvotePublishExtraData(videoItemParams.getAweme(), videoItemParams.mPageType);
        C1360460lVU.LIZIZ.LJJJ(null, null, c453740HqmRemove, upvotePublishExtraData, upvotePublishMobParam, 0, aid, str, null, null, list, null, (str == null || str.length() == 0) ? new AwS104S1200000_21(upvotePublishExtraData, upvotePublishMobParam, aid, 11) : null, false);
        Jo(null);
    }

    public static void bp(C197039127h c197039127h) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = c197039127h.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            if (marginLayoutParams.width != -2 || marginLayoutParams.getMarginStart() != C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(8.0f)))) {
                marginLayoutParams.width = -2;
                marginLayoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(8.0f))));
                C786410Ut5.W5(c197039127h, marginLayoutParams);
            }
        }
    }

    public final void Ho(int i) {
        int iLIZIZ;
        LinearLayout linearLayout = this.LLJI;
        if (linearLayout != null && linearLayout.getPaddingEnd() != (iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i))))) {
            linearLayout.setPaddingRelative(linearLayout.getPaddingStart(), linearLayout.getPaddingTop(), iLIZIZ, linearLayout.getPaddingBottom());
        }
    }

    public final void Jo(Editable editable) {
        TuxTextView tuxTextView = this.LLJIJIL;
        if (tuxTextView == null) {
            return;
        }
        int iIntValue = 0;
        if (editable != null && editable.length() != 0) {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, tuxTextView.getContext());
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            }
            tuxTextView.setTextColor(iIntValue);
            tuxTextView.setText(editable);
            return;
        }
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1k, tuxTextView.getContext());
        if (numLIZJ2 != null) {
            iIntValue = numLIZJ2.intValue();
        }
        tuxTextView.setTextColor(iIntValue);
        tuxTextView.setText(2131825003);
    }

    @Override // X.InterfaceC1359760lUM
    public final void QG(Editable editable) {
        boolean z;
        Jo(editable);
        if (editable != null && editable.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        ap(!z);
    }

    public final void So(int i) {
        String str;
        String str2;
        String str3 = null;
        if (!this.LLJJIJIL) {
            this.LLJJIJIL = true;
            C1358550lSP c1358550lSP = C1358550lSP.LIZ;
            VideoItemParams videoItemParams = No().LLILLJJLI;
            if (videoItemParams != null) {
                str2 = videoItemParams.mEventType;
            } else {
                str2 = null;
            }
            str3 = null;
            C1358550lSP.LJIJJLI(c1358550lSP, str2, "recommend_panel", No().LL, "show", "list", 0, null, null, null, null, 992);
        }
        if (i == 1) {
            if (!this.LLJJIJIIJIL) {
                this.LLJJIJIIJIL = true;
                C1359350lTh c1359350lTh = C1359350lTh.LIZ;
                VideoItemParams videoItemParams2 = No().LLILLJJLI;
                if (videoItemParams2 != null) {
                    str = videoItemParams2.mEventType;
                } else {
                    str = str3;
                }
                String strAQ2 = No().AQ2();
                Aweme aweme = No().LL;
                C1359850lUV c1359850lUV = (C1359850lUV) this.LLIZLLLIL.getValue();
                if (c1359850lUV != null) {
                    str3 = c1359850lUV.LLILLJJLI;
                }
                C1359350lTh.LIZIZ(c1359350lTh, str, strAQ2, aweme, "recommend_panel", null, false, 0.0d, "list", "recommend_panel", str3, null, null, 3184);
                return;
            }
            return;
        }
        this.LLJJIJIIJIL = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Zo(EnumC1359800lUQ enumC1359800lUQ) {
        FragmentManager supportFragmentManager;
        boolean z;
        String str;
        String tabName;
        BaseFeedPageParams baseFeedPageParams;
        C2189821An6 c2189821An6;
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ == null) {
            return;
        }
        String str2 = null;
        if ((c19egLIZ instanceof C19GS) && (supportFragmentManager = c19egLIZ.getSupportFragmentManager()) != null) {
            String str3 = RepostInputFragment._pnsPageId;
            if (RepostInputFragment.LLLIILIL == -1) {
                RepostInputFragment.LLLIILIL = System.currentTimeMillis();
            }
            if (((C1358490lSJ) No().getState()).LLILLL.LIZ == 2) {
                z = true;
            } else {
                z = false;
            }
            Aweme aweme = No().LL;
            VideoItemParams videoItemParams = No().LLILLJJLI;
            if (videoItemParams != null) {
                str = videoItemParams.mEventType;
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            VideoItemParams videoItemParams2 = No().LLILLJJLI;
            if (videoItemParams2 == null || (baseFeedPageParams = videoItemParams2.baseFeedPageParams) == null || (c2189821An6 = baseFeedPageParams.param) == null || (tabName = c2189821An6.getTabName()) == null) {
                tabName = "";
            }
            RepostInputFragment repostInputFragmentLIZ = C1359730lUJ.LIZ(aweme, z, str, "recommend_panel", "list", tabName, enumC1359800lUQ, this, null, null, null, null, null, null, 32320);
            repostInputFragmentLIZ.getLifecycle().addObserver(new RepostThenNoteAssem$onPublishRepostTextClick$1(this));
            repostInputFragmentLIZ.show(supportFragmentManager, "REPOST_INPUT");
            C1358550lSP c1358550lSP = C1358550lSP.LIZ;
            VideoItemParams videoItemParams3 = No().LLILLJJLI;
            if (videoItemParams3 != null) {
                str2 = videoItemParams3.mEventType;
            }
            C1358550lSP.LJIJJLI(c1358550lSP, str2, "recommend_panel", No().LL, "click", "list", 0, null, null, null, null, 992);
        }
    }

    public final void ap(boolean z) {
        if (z) {
            Ho(4);
            C197039127h c197039127h = this.LLJJ;
            if (c197039127h != null) {
                C786410Ut5.w5(c197039127h, 1.0f);
                C339190DRl.LIZLLL(c197039127h);
            }
            C197039127h c197039127h2 = this.LLJILLL;
            if (c197039127h2 != null) {
                bp(c197039127h2);
                C339190DRl.LIZIZ(c197039127h2);
            }
            TuxIconView tuxIconView = this.LLJILJIL;
            if (tuxIconView != null) {
                C786410Ut5.x5(tuxIconView, 1.0f);
                C339190DRl.LIZIZ(tuxIconView);
            }
            TuxIconView tuxIconView2 = this.LLJILJILJ;
            if (tuxIconView2 != null) {
                C786410Ut5.x5(tuxIconView2, 1.0f);
                C339190DRl.LIZIZ(tuxIconView2);
                return;
            }
            return;
        }
        Ho(9);
        C197039127h c197039127h3 = this.LLJJ;
        if (c197039127h3 != null) {
            C339190DRl.LIZIZ(c197039127h3);
        }
        Integer num = this.LLJJIII;
        if (num != null) {
            if (num.intValue() == 1) {
                C197039127h c197039127h4 = this.LLJILLL;
                if (c197039127h4 != null) {
                    C786410Ut5.w5(c197039127h4, 1.0f);
                    bp(c197039127h4);
                    C339190DRl.LIZLLL(c197039127h4);
                }
                TuxIconView tuxIconView3 = this.LLJILJIL;
                if (tuxIconView3 != null) {
                    C786410Ut5.x5(tuxIconView3, 1.0f);
                    C339190DRl.LIZIZ(tuxIconView3);
                }
                TuxIconView tuxIconView4 = this.LLJILJILJ;
                if (tuxIconView4 != null) {
                    C786410Ut5.x5(tuxIconView4, 1.0f);
                    C339190DRl.LIZIZ(tuxIconView4);
                    return;
                }
                return;
            }
            if (num.intValue() != 2) {
                return;
            }
            C197039127h c197039127h5 = this.LLJILLL;
            if (c197039127h5 != null) {
                bp(c197039127h5);
                C339190DRl.LIZIZ(c197039127h5);
            }
            TuxIconView tuxIconView5 = this.LLJILJIL;
            if (tuxIconView5 != null) {
                C786410Ut5.x5(tuxIconView5, 1.0f);
                C339190DRl.LIZLLL(tuxIconView5);
            }
            TuxIconView tuxIconView6 = this.LLJILJILJ;
            if (tuxIconView6 == null) {
                return;
            }
            C786410Ut5.x5(tuxIconView6, 1.0f);
            C339190DRl.LIZLLL(tuxIconView6);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C197039127h c197039127h;
        View view2;
        super.onViewCreated(view);
        this.LLJI = (LinearLayout) view.findViewById(R.id.gaw);
        this.LLJIJIL = (TuxTextView) view.findViewById(R.id.gav);
        this.LLJILJIL = (TuxIconView) view.findViewById(R.id.gax);
        this.LLJILJILJ = (TuxIconView) view.findViewById(R.id.gau);
        this.LLJILLL = (C197039127h) view.findViewById(R.id.gay);
        this.LLJJ = (C197039127h) view.findViewById(R.id.gaz);
        Object parent = view.getParent();
        UrlModel avatarThumb = null;
        if ((parent instanceof View) && (view2 = (View) parent) != null) {
            c197039127h = (C197039127h) view2.findViewById(R.id.cwf);
        } else {
            c197039127h = null;
        }
        this.LLJJI = c197039127h;
        LinearLayout linearLayout = this.LLJI;
        if (linearLayout != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(22));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
            linearLayout.setBackground(c384050F3z.LIZ(view.getContext()));
        }
        SmartImageView smartImageView = (SmartImageView) view.findViewById(R.id.gas);
        if (smartImageView != null) {
            User userLIZ = C10EU.LIZ();
            if (userLIZ != null) {
                avatarThumb = userLIZ.getAvatarThumb();
            }
            C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(avatarThumb));
            c1331670kl3LJIIIIZZ.LJJ(smartImageView);
            c1331670kl3LJIIIIZZ.LJIIJJI();
        }
        TuxTextView tuxTextView = this.LLJIJIL;
        if (tuxTextView != null) {
            C786410Ut5.I7(new AkS89S0100000_21(this, 12), tuxTextView);
        }
        C197039127h c197039127h2 = this.LLJILLL;
        if (c197039127h2 != null) {
            C786410Ut5.I7(new AkS89S0100000_21(this, 13), c197039127h2);
        }
        C197039127h c197039127h3 = this.LLJJ;
        if (c197039127h3 != null) {
            C786410Ut5.I7(new AkS89S0100000_21(this, 14), c197039127h3);
        }
        TuxIconView tuxIconView = this.LLJILJIL;
        if (tuxIconView != null) {
            C786410Ut5.I7(new AkS89S0100000_21(this, 15), tuxIconView);
        }
        TuxIconView tuxIconView2 = this.LLJILJILJ;
        if (tuxIconView2 != null) {
            C786410Ut5.I7(new AkS89S0100000_21(this, 16), tuxIconView2);
        }
        Go();
        C736680Sv4.LJIIIIZZ(this, No(), new C2217381BqS() { // from class: X.0lUa
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1358490lSJ) obj).LLILLL;
            }
        }, null, new AwS456S0200000_21(this, view, 11), 6);
    }
}
