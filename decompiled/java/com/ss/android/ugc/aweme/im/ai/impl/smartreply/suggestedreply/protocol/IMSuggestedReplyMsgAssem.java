package com.ss.android.ugc.aweme.im.ai.impl.smartreply.suggestedreply.protocol;

import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C0QSJ;
import X.C0Y8T;
import X.C127G;
import X.C1308910kAL;
import X.C13LE;
import X.C1505905uz;
import X.C1606406Qs;
import X.C1637806bA;
import X.C1697810uHb;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C23250099c;
import X.C418440Gaw;
import X.C452501pT;
import X.C687700QyG;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1146704e9;
import X.InterfaceC1587906Jp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC712990Rxx;
import Y.AObjectS378S0100000_2;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.suggestedreply.SmartReplySuggestedReplyViewModel;
import com.ss.android.ugc.aweme.im.chatroom.input.components.inputfield.IInputFieldAbility;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.im.message.content.SuggestedReplyData;
import com.ss.android.ugc.aweme.im.message.content.adapter.BaseContentParserKt;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class IMSuggestedReplyMsgAssem extends ReusedUISlotAssem<IMSuggestedReplyMsgAssem> implements InterfaceC712990Rxx<C1606406Qs>, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLF;
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS546S0100000_2(this, 293));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 292));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 291));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 290));
    public final AssemVMLazy LLJLL;
    public final C01GW LLJLLIL;
    public volatile IInputFieldAbility LLJLLL;
    public C127G LLJZ;
    public InterfaceC665370Q7z LLJZIJLIL;
    public C0QSJ LLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(IMSuggestedReplyMsgAssem.class, "smartReplySuggestedReplyViewModel", "getSmartReplySuggestedReplyViewModel()Lcom/ss/android/ugc/aweme/im/ai/impl/smartreply/suggestedreply/SmartReplySuggestedReplyViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(IMSuggestedReplyMsgAssem.class, "inputFieldAbility", "getInputFieldAbility()Lcom/ss/android/ugc/aweme/im/chatroom/input/components/inputfield/IInputFieldAbility;", 0);
        c09r3.getClass();
        LLLF = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public IMSuggestedReplyMsgAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SmartReplySuggestedReplyViewModel.class);
        this.LLJLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 294), AFwS229S0000000_2.get$arr$(227), null, true);
        this.LLJLLIL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 289));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.cq4;
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{ChatRoomScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ChatRoomScope.class);
        return arrayList;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final C0QSJ op() {
        C0QSJ c0qsj = this.LLL;
        if (c0qsj != null) {
            return c0qsj;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLJZIJLIL;
        if (interfaceC665370Q7zLJIIIZ == null) {
            interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
            this.LLJZIJLIL = interfaceC665370Q7zLJIIIZ;
        }
        C0QSJ c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{ChatRoomScope.class});
        this.LLL = c0qsjLIZLLL;
        return c0qsjLIZLLL;
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJZ;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJZ;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{SmartReplySuggestedReplyViewModel.class, new AObjectS378S0100000_2(this, 1)}, defaultViewModelProviderFactory);
                    this.LLJZ = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C1606406Qs c1606406Qs) {
        try {
            SuggestedReplyData suggestedReplyData = (SuggestedReplyData) BaseContentParserKt.getOrParseJsonContent(c1606406Qs.LL, SuggestedReplyData.class);
            if (suggestedReplyData != null) {
                if (suggestedReplyData.isLoading()) {
                    View viewLJJIJL = LJJIJL();
                    if (viewLJJIJL != null) {
                        C786410Ut5.LJLLLLLL(0, viewLJJIJL);
                    }
                    LinearLayout linearLayout = (LinearLayout) this.LLJJLIIIJLLLLLLLZ.getValue();
                    if (linearLayout != null) {
                        C786410Ut5.LJZL(0, linearLayout);
                    }
                    LinearLayout linearLayout2 = (LinearLayout) this.LLJLIL.getValue();
                    if (linearLayout2 != null) {
                        C786410Ut5.LJZL(8, linearLayout2);
                    }
                    C786410Ut5.Pd((ObjectAnimator) this.LLJLLIL.getValue());
                } else {
                    sp(suggestedReplyData);
                    AssemVMLazy assemVMLazy = this.LLJLL;
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLF;
                    SmartReplySuggestedReplyViewModel smartReplySuggestedReplyViewModel = (SmartReplySuggestedReplyViewModel) assemVMLazy.getValue();
                    C0Y8T c0y8tYQ2 = smartReplySuggestedReplyViewModel.yQ2();
                    if (c0y8tYQ2 != null) {
                        C23250099c.LIZLLL(smartReplySuggestedReplyViewModel.LLIZ, null, null, new C1505905uz(smartReplySuggestedReplyViewModel, c0y8tYQ2, null), 3);
                    }
                }
                if (suggestedReplyData.isStart()) {
                    tp(8388611);
                } else {
                    tp(8388613);
                }
                C786410Ut5.LJLLLLLL(0, LJJIJL());
                return;
            }
            C786410Ut5.LJLLLLLL(8, LJJIJL());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("parse msg content exception info = ");
            sbLIZ.append(e);
            C2188811AlT.LIZIZ(sbLIZ);
            C786410Ut5.LJLLLLLL(8, LJJIJL());
        }
    }

    public final void sp(SuggestedReplyData suggestedReplyData) {
        int size;
        Context context;
        boolean z;
        ((ValueAnimator) this.LLJLLIL.getValue()).cancel();
        List<String> content = suggestedReplyData.getContent();
        if (content != null) {
            size = content.size();
        } else {
            size = 0;
        }
        if (size == 0) {
            View viewLJJIJL = LJJIJL();
            if (viewLJJIJL != null) {
                C786410Ut5.LJLLLLLL(8, viewLJJIJL);
            }
        } else {
            View viewLJJIJL2 = LJJIJL();
            if (viewLJJIJL2 != null) {
                C786410Ut5.LJLLLLLL(0, viewLJJIJL2);
            }
        }
        LinearLayout linearLayout = (LinearLayout) this.LLJLILLLLZIIL.getValue();
        if (linearLayout != null) {
            C786410Ut5.LJJJJJL(linearLayout);
        }
        List<String> content2 = suggestedReplyData.getContent();
        if (content2 != null) {
            int i = 0;
            for (String str : content2) {
                final int i2 = i + 1;
                if (i >= 0) {
                    final String str2 = str;
                    View viewLJJIJL3 = LJJIJL();
                    if (viewLJJIJL3 != null && (context = viewLJJIJL3.getContext()) != null) {
                        if (i == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        final TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                        if (z) {
                            layoutParams.setMargins(0, 0, 0, 0);
                        } else {
                            layoutParams.setMargins(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), 0, 0);
                        }
                        C786410Ut5.R6(tuxTextView, layoutParams);
                        tuxTextView.setMaxWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(260)));
                        tuxTextView.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
                        tuxTextView.setTuxFont(72);
                        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, context);
                        if (numLIZJ != null) {
                            tuxTextView.setTextColor(numLIZJ.intValue());
                        }
                        tuxTextView.setTextSize(12.0f);
                        tuxTextView.setMinTextSize(12.0f);
                        tuxTextView.setBackgroundResource(R.drawable.can);
                        tuxTextView.setElevation(10.0f);
                        tuxTextView.setMaxLines(2);
                        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
                        tuxTextView.setText(str2);
                        C786410Ut5.h9(tuxTextView, new View.OnClickListener() { // from class: X.05v2
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1506105v1(this.LL, i2, str2, tuxTextView, null), 3);
                            }
                        });
                        ViewGroup viewGroup = (ViewGroup) this.LLJLILLLLZIIL.getValue();
                        if (viewGroup != null) {
                            viewGroup.addView(tuxTextView);
                        }
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        View viewLJJIJL4 = LJJIJL();
        if (viewLJJIJL4 != null) {
            C786410Ut5.LJLLLLLL(0, viewLJJIJL4);
        }
        LinearLayout linearLayout2 = (LinearLayout) this.LLJJLIIIJLLLLLLLZ.getValue();
        if (linearLayout2 != null) {
            C786410Ut5.LJZL(8, linearLayout2);
        }
        LinearLayout linearLayout3 = (LinearLayout) this.LLJLIL.getValue();
        if (linearLayout3 != null) {
            C786410Ut5.LJZL(0, linearLayout3);
        }
    }

    public final void tp(int i) {
        LinearLayout linearLayout = (LinearLayout) this.LLJJLIIIJLLLLLLLZ.getValue();
        if (linearLayout != null) {
            linearLayout.setGravity(i);
        }
        LinearLayout linearLayout2 = (LinearLayout) this.LLJL.getValue();
        if (linearLayout2 != null) {
            linearLayout2.setGravity(i);
        }
        LinearLayout linearLayout3 = (LinearLayout) this.LLJLIL.getValue();
        if (linearLayout3 != null) {
            linearLayout3.setGravity(i);
        }
        LinearLayout linearLayout4 = (LinearLayout) this.LLJLILLLLZIIL.getValue();
        if (linearLayout4 != null) {
            linearLayout4.setGravity(i);
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C1606406Qs c1606406Qs) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C1606406Qs c1606406Qs) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
