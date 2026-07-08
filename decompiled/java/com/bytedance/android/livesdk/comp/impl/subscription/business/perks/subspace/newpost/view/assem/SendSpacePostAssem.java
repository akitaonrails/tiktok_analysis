package com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.newpost.view.assem;

import X.AbstractViewOnClickListenerC1637610siV;
import X.C019F;
import X.C13LE;
import X.C1637806bA;
import X.C16FS;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C501810Jm7;
import X.C501930JmJ;
import X.C501940JmK;
import X.C501950JmL;
import X.C501960JmM;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.android.livesdk.chatroom.api.SpaceTopicCategory;
import com.bytedance.android.livesdk.chatroom.api.SpaceTopicContent;
import com.bytedance.android.livesdk.chatroom.api.SpaceTopicInfo;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.feed.vm.SubSpaceFeedAbility;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.newpost.vm.SubSpaceNewPostVM;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.zhiliaoapp.musically.R;
import webcast.api.sub.PostCreateReq;

/* JADX INFO: loaded from: classes8.dex */
public final class SendSpacePostAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public final AssemVMLazy LLIZLLLIL;
    public C501810Jm7 LLJ;
    public C16FS LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SendSpacePostAssem.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/subscription/business/perks/subspace/newpost/vm/SubSpaceNewPostVM;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SendSpacePostAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SubSpaceNewPostVM.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C501950JmL(c19719912DlLIZ), new C501960JmM(), null, true);
    }

    public final SubSpaceNewPostVM Go() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        return (SubSpaceNewPostVM) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C16FS c16fs = (C16FS) view.findViewById(R.id.zsh);
        this.LLJI = c16fs;
        if (c16fs != null) {
            C786410Ut5.I7(new AbstractViewOnClickListenerC1637610siV() { // from class: X.0JmO
                {
                    super(300L);
                }

                @Override // X.AbstractViewOnClickListenerC1637610siV
                public final void LIZ(View view2) {
                    boolean z;
                    C501820Jm8 c501820Jm8;
                    SpaceTopicCategory spaceTopicCategory;
                    C501810Jm7 c501810Jm7XQ2;
                    C501820Jm8 c501820Jm82;
                    SpaceTopicContent spaceTopicContent;
                    C501820Jm8 c501820Jm83;
                    SpaceTopicCategory spaceTopicCategory2;
                    if (view2 != null) {
                        SubSpaceNewPostVM subSpaceNewPostVMGo = this.LLILZ.Go();
                        C501810Jm7 c501810Jm7XQ22 = subSpaceNewPostVMGo.xQ2();
                        if (c501810Jm7XQ22 != null && (c501820Jm83 = c501810Jm7XQ22.LL) != null && (spaceTopicCategory2 = c501820Jm83.LIZIZ) != null && spaceTopicCategory2.topicCategoryId == -1211) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            PostCreateReq postCreateReqWQ2 = subSpaceNewPostVMGo.wQ2();
                            if (postCreateReqWQ2 != null) {
                                subSpaceNewPostVMGo.xQ2();
                                subSpaceNewPostVMGo.setState(new C501990JmP());
                                InterfaceC665370Q7z interfaceC665370Q7z = subSpaceNewPostVMGo.LL;
                                if (interfaceC665370Q7z == null) {
                                    interfaceC665370Q7z = null;
                                }
                                SubSpaceFeedAbility subSpaceFeedAbility = (SubSpaceFeedAbility) C1558520qew.LIZ(interfaceC665370Q7z, SubSpaceFeedAbility.class, null);
                                if (subSpaceFeedAbility != null) {
                                    subSpaceFeedAbility.bG2(postCreateReqWQ2);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        C501810Jm7 c501810Jm7XQ23 = subSpaceNewPostVMGo.xQ2();
                        if (c501810Jm7XQ23 == null || (c501820Jm8 = c501810Jm7XQ23.LL) == null || (spaceTopicCategory = c501820Jm8.LIZIZ) == null || (c501810Jm7XQ2 = subSpaceNewPostVMGo.xQ2()) == null || (c501820Jm82 = c501810Jm7XQ2.LL) == null || (spaceTopicContent = c501820Jm82.LIZLLL) == null) {
                            return;
                        }
                        PostCreateReq postCreateReq = new PostCreateReq();
                        postCreateReq.text = spaceTopicContent.topicContentText;
                        postCreateReq.contentType = EnumC503090JoB.TEXT.getValue();
                        SpaceTopicInfo spaceTopicInfo = new SpaceTopicInfo();
                        spaceTopicInfo.spaceTopicCategory = spaceTopicCategory;
                        spaceTopicInfo.spaceTopicContent = spaceTopicContent;
                        postCreateReq.topicInfo = spaceTopicInfo;
                        subSpaceNewPostVMGo.xQ2();
                        subSpaceNewPostVMGo.setState(new C501990JmP());
                        InterfaceC665370Q7z interfaceC665370Q7z2 = subSpaceNewPostVMGo.LL;
                        if (interfaceC665370Q7z2 == null) {
                            interfaceC665370Q7z2 = null;
                        }
                        SubSpaceFeedAbility subSpaceFeedAbility2 = (SubSpaceFeedAbility) C1558520qew.LIZ(interfaceC665370Q7z2, SubSpaceFeedAbility.class, null);
                        if (subSpaceFeedAbility2 == null) {
                            return;
                        }
                        subSpaceFeedAbility2.bG2(postCreateReq);
                    }
                }
            }, c16fs);
        }
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0JmU
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C502060JmW) obj).LLILLL;
            }
        }, null, new C501930JmJ(this), 6);
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0JmS
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C502060JmW) obj).LLILZLL;
            }
        }, null, new C501940JmK(this), 6);
    }
}
