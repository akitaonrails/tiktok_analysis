package com.ss.android.ugc.aweme.upvote.detail.replypanel.assem;

import X.C0DXR;
import X.C1355330lND;
import X.C1389340mG4;
import X.C13LP;
import X.C15438062q;
import X.C418440Gaw;
import X.C449990Hkj;
import X.C451030HmP;
import X.C456320Huw;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC449820HkS;
import android.graphics.Rect;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.emoji2.text.e;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CommentPersonalizedEmoji;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.upvote.RepostReplyStruct;
import com.ss.android.ugc.aweme.upvote.detail.replypanel.assem.RepostReplyKeyboard;
import com.ss.android.ugc.aweme.upvote.experiment.RepostPublicInteractExp;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class RepostQuickEmojiAssem extends UIContentAssem {
    public C1355330lND LLIZLLLIL;
    public FrameLayout LLJ;
    public C449990Hkj LLJI;
    public int LLJIJIL;

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        int i;
        List list;
        super.onViewCreated(view);
        RepostPublicInteractExp.LIZ.getClass();
        RepostPublicInteractExp.RepostPublicInteractConfig repostPublicInteractConfigLIZIZ = RepostPublicInteractExp.LIZIZ();
        int i2 = 1;
        if (repostPublicInteractConfigLIZIZ != null && repostPublicInteractConfigLIZIZ.quickEmojiBar) {
            this.LLIZLLLIL = (C1355330lND) view.findViewById(R.id.grz);
            FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.upvote_quick_emoji_bar);
            this.LLJ = frameLayout;
            final C1355330lND c1355330lND = this.LLIZLLLIL;
            if (c1355330lND == null || frameLayout == null) {
                return;
            }
            String[] strArr = C456320Huw.LIZ;
            ArrayList<String> arrayList = new ArrayList();
            for (String str : strArr) {
                if (e.LJ() || ((list = (List) C456320Huw.LIZIZ.getValue()) != null && list.contains(str))) {
                    arrayList.add(str);
                }
            }
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            for (String str2 : arrayList) {
                C451030HmP c451030HmP = new C451030HmP();
                c451030HmP.LIZIZ = str2;
                arrayList2.add(c451030HmP);
            }
            if (arrayList2.isEmpty()) {
                C786410Ut5.LJZ(8, frameLayout);
                return;
            }
            int size = arrayList2.size();
            int i3 = C1389340mG4.LIZJ(null, null).LIZIZ;
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(40.0f)));
            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(12.0f)));
            int i4 = 2;
            int iLIZIZ3 = ((i3 - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(16.0f))) * 2)) + iLIZIZ2) / (iLIZIZ + iLIZIZ2);
            if (iLIZIZ3 > 1) {
                i4 = iLIZIZ3;
            }
            if (i4 > size) {
                i = size;
            } else {
                i = i4;
            }
            if (i4 < size) {
                this.LLJIJIL = i;
                i++;
            } else {
                int i5 = i - 1;
                if (i5 >= 1) {
                    i2 = i5;
                }
                this.LLJIJIL = i2;
            }
            InterfaceC449820HkS interfaceC449820HkS = new InterfaceC449820HkS(c1355330lND) { // from class: X.0lPR
                public final C1355330lND LIZ;

                @Override // X.InterfaceC449820HkS
                public final /* synthetic */ void E0() {
                }

                @Override // X.InterfaceC449820HkS
                public final void Id() {
                }

                @Override // X.InterfaceC449820HkS
                public final void LIZ(View view2, C451030HmP c451030HmP2) {
                }

                @Override // X.InterfaceC449820HkS
                public final /* synthetic */ void LJIILIIL(Aweme aweme) {
                }

                {
                    this.LIZ = c1355330lND;
                }

                @Override // X.InterfaceC449820HkS
                public final void Jd(int i6, int i7, String str3) throws Throwable {
                    RepostReplyKeyboard repostReplyKeyboard;
                    String str4;
                    String str5;
                    RepostReplyStruct repostReplyStruct;
                    if (str3 == null) {
                        return;
                    }
                    int selectionStart = this.LIZ.getSelectionStart();
                    if (selectionStart < 0) {
                        selectionStart = 0;
                    }
                    String str6 = null;
                    Editable editableJ = C2204961BRm.J(this.LIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP+4dZDa2XyTB6kx8g4CoVwfj8Ig5ARorXFGjhAJTN6xGEWNMdsA8dkDOqGlkHm2XSMRvek=", null));
                    if (editableJ != null) {
                        editableJ.insert(selectionStart, str3);
                    }
                    Fragment fragmentLIZ = C946803n0.LIZ(this.LIZ);
                    if ((fragmentLIZ instanceof RepostReplyKeyboard) && (repostReplyKeyboard = (RepostReplyKeyboard) fragmentLIZ) != null) {
                        VideoItemParams videoItemParams = repostReplyKeyboard.LLJILJIL;
                        if (videoItemParams == null || (str4 = videoItemParams.mEventType) == null) {
                            C1356730lPT c1356730lPT = repostReplyKeyboard.LLJILJILJ;
                            if (c1356730lPT != null) {
                                str4 = c1356730lPT.LJFF;
                            } else {
                                str4 = null;
                            }
                        }
                        C1356730lPT c1356730lPT2 = repostReplyKeyboard.LLJILJILJ;
                        if (c1356730lPT2 != null) {
                            str5 = c1356730lPT2.LJIIIIZZ;
                            if (str5 == null) {
                                str5 = c1356730lPT2.LJI;
                            }
                        } else {
                            str5 = null;
                        }
                        String strMR = repostReplyKeyboard.MR();
                        C1356730lPT c1356730lPT3 = repostReplyKeyboard.LLJILJILJ;
                        if (c1356730lPT3 != null && ((repostReplyStruct = c1356730lPT3.LIZ) == null || (str6 = repostReplyStruct.repostId) == null)) {
                            str6 = c1356730lPT3.LIZIZ;
                        }
                        C1358550lSP.LIZ.getClass();
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        c2344009Gk.LJIIIIZZ("enter_from", str4);
                        c2344009Gk.LJIIIIZZ("enter_method", str5);
                        c2344009Gk.LJIIIIZZ("group_id", strMR);
                        C1358170lRn.LIZ(c2344009Gk, "repost_id", str6);
                        C20684815ws.LJIILLIIL("ttsocial_repost_panel_fast_emoji_click", c2344009Gk.LIZ);
                    }
                }

                @Override // X.InterfaceC449820HkS
                public final void Kd(CommentPersonalizedEmoji commentPersonalizedEmoji, int i6, int i7) throws Throwable {
                    String str3;
                    if (commentPersonalizedEmoji != null && (str3 = commentPersonalizedEmoji.emoji) != null) {
                        Jd(i6, i7, str3);
                    }
                }
            };
            int iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(23));
            List listLL = C13LP.LL(arrayList2, i);
            final AwS550S0100000_6 awS550S0100000_6 = new AwS550S0100000_6(this, 1129);
            View view2 = null;
            this.LLJI = new C449990Hkj(interfaceC449820HkS, frameLayout, null, new LinearLayoutManager(frameLayout.getContext(), 0, false), null, listLL, new C0DXR(awS550S0100000_6) { // from class: X.0I1i
                public final Function0<Integer> LL;

                {
                    this.LL = awS550S0100000_6;
                }

                @Override // X.C0DXR
                public final void LIZIZ(Rect rect, View view3, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                    RecyclerView.LayoutParams layoutParams;
                    int viewLayoutPosition;
                    ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
                    if (layoutParams2 instanceof RecyclerView.LayoutParams) {
                        layoutParams = (RecyclerView.LayoutParams) layoutParams2;
                    } else {
                        layoutParams = null;
                    }
                    int iIntValue = 0;
                    if (layoutParams != null) {
                        viewLayoutPosition = layoutParams.getViewLayoutPosition();
                    } else {
                        viewLayoutPosition = 0;
                    }
                    if (viewLayoutPosition != c21673919s1.LIZIZ() - 1) {
                        iIntValue = this.LL.invoke().intValue();
                    }
                    if (C444960Hcc.LIZIZ()) {
                        rect.left = iIntValue;
                    } else {
                        rect.right = iIntValue;
                    }
                }
            }, i, iLIZIZ4, 2, null, Boolean.FALSE);
            C786410Ut5.LJJJJIZL(frameLayout);
            C449990Hkj c449990Hkj = this.LLJI;
            if (c449990Hkj != null) {
                view2 = c449990Hkj.LL;
            }
            frameLayout.addView(view2);
            C786410Ut5.LJZ(0, frameLayout);
        }
    }
}
