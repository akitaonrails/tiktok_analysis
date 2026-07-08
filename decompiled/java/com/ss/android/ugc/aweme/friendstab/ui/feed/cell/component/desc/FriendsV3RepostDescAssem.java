package com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.desc;

import X.C01GW;
import X.C0AIK;
import X.C0SDH;
import X.C1308910kAL;
import X.C13LP;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1697810uHb;
import X.C2097608Jq;
import X.C298740BnM;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C704790Rkj;
import X.C705700RmC;
import X.C724270Sb3;
import X.C786410Ut5;
import X.EnumC452301pR;
import X.InterfaceC1357880lRK;
import X.InterfaceC1361270lWn;
import X.InterfaceC2681011z;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsV3RouterAbility;
import com.ss.android.ugc.aweme.friendstab.repo.FriendsV3RepostModel;
import com.ss.android.ugc.aweme.friendstab.repo.RepostTextExtra;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.base.BaseFriendsV3CellUISlotAssem;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.comment.FriendsV3CommentAssem;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.protocol.FriendsV3CellTrackParamsProtocol;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes12.dex */
public final class FriendsV3RepostDescAssem extends BaseFriendsV3CellUISlotAssem<FriendsV3RepostDescAssem, InterfaceC1361270lWn> implements FriendsV3CellTrackParamsProtocol {
    public List<String> LLJLILLLLZIIL;
    public Integer LLJLL;
    public final C630740Ooa LLJL = C628500Oky.LIZ(new AwS555S0100000_11(this, 440));
    public final C01GW LLJLIL = C452501pT.LIZ(EnumC452301pR.NONE, new AwS555S0100000_11(this, 439));
    public final C0SDH LLJLLIL = new InterfaceC2681011z() { // from class: X.0SDH
        @Override // X.InterfaceC2681011z
        public final void LIZ(String str) {
            IFriendsV3RouterAbility iFriendsV3RouterAbility = (IFriendsV3RouterAbility) this.LIZ.LLJL.getValue();
            if (iFriendsV3RouterAbility != null) {
                iFriendsV3RouterAbility.DE1(this.LIZ.getContext(), str);
            }
        }
    };

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.cbf;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Co() {
        C705700RmC.LIZ(this, R.layout.cbf, new AwS555S0100000_11(this, 438));
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.protocol.FriendsV3CellTrackParamsProtocol
    public final Map<String, Object> J62() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (!((c724270Sb3 != null ? c724270Sb3.LL : null) instanceof InterfaceC1357880lRK)) {
            return C2097608Jq.LJ();
        }
        CharSequence text = ((AppCompatTextView) this.LLJLIL.getValue()).getText();
        return text == null || text.length() == 0 ? C2097608Jq.LJIIIIZZ(new Pair("is_with_caption", CardStruct.IStatusCode.DEFAULT), new Pair("is_unfold_caption", CardStruct.IStatusCode.DEFAULT), new Pair("caption_lines", CardStruct.IStatusCode.DEFAULT)) : C2097608Jq.LJIIIIZZ(new Pair("is_with_caption", "1"), new Pair("is_unfold_caption", CardStruct.IStatusCode.DEFAULT), new Pair("caption_lines", Integer.valueOf(((TextView) this.LLJLIL.getValue()).getLineCount())));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        C1554610qYd.LIZLLL(C1558520qew.LJIIL(this), FriendsV3CellTrackParamsProtocol.class, this);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem, com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), FriendsV3CellTrackParamsProtocol.class, C1697810uHb.LJIILJJIL(this));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        ((TextView) this.LLJLIL.getValue()).setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(Object obj) {
        InterfaceC1357880lRK interfaceC1357880lRK;
        boolean z;
        SpannableStringBuilder spannableStringBuilder;
        final InterfaceC2681011z interfaceC2681011z;
        final int iIntValue;
        Integer numLIZJ;
        int iIntValue2;
        int iIntValue3;
        Integer numLIZJ2;
        List<String> listLJJLIIIJILLIZJL;
        InterfaceC1361270lWn interfaceC1361270lWn = (InterfaceC1361270lWn) obj;
        Context context = LJJIJL().getContext();
        if (context != null && (interfaceC1361270lWn instanceof InterfaceC1357880lRK) && (interfaceC1357880lRK = (InterfaceC1357880lRK) interfaceC1361270lWn) != null) {
            FriendsV3RepostModel friendsV3RepostModelLLD = interfaceC1357880lRK.LLD();
            String str = friendsV3RepostModelLLD.repostText;
            List<RepostTextExtra> list = friendsV3RepostModelLLD.repostTextExtra;
            if (str != null && str.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            String str2 = "";
            if (z) {
                spannableStringBuilder = new SpannableStringBuilder("");
            } else if (list != null && !list.isEmpty()) {
                spannableStringBuilder = new SpannableStringBuilder(str);
                C01GW c01gw = C0AIK.LIZ;
                if (((Boolean) c01gw.getValue()).booleanValue()) {
                    interfaceC2681011z = this.LLJLLIL;
                } else {
                    interfaceC2681011z = new InterfaceC2681011z() { // from class: X.0SDI
                        @Override // X.InterfaceC2681011z
                        public final void LIZ(String str3) {
                            IFriendsV3RouterAbility iFriendsV3RouterAbility = (IFriendsV3RouterAbility) this.LIZ.LLJL.getValue();
                            if (iFriendsV3RouterAbility != null) {
                                iFriendsV3RouterAbility.DE1(this.LIZ.getContext(), str3);
                            }
                        }
                    };
                }
                if (C298740BnM.LIZ()) {
                    if (((Boolean) c01gw.getValue()).booleanValue()) {
                        Integer num = this.LLJLL;
                        if (num != null) {
                            iIntValue = num.intValue();
                        } else {
                            Context context2 = getContext();
                            if (context2 != null && (numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1h, context2)) != null) {
                                iIntValue = numLIZJ2.intValue();
                            } else {
                                iIntValue = 0;
                            }
                            this.LLJLL = Integer.valueOf(iIntValue);
                        }
                    } else {
                        Context context3 = getContext();
                        if (context3 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, context3)) != null) {
                            iIntValue = numLIZJ.intValue();
                        } else {
                            iIntValue = 0;
                        }
                    }
                    for (final RepostTextExtra repostTextExtra : list) {
                        Integer num2 = repostTextExtra.spanStart;
                        if (num2 != null) {
                            iIntValue2 = num2.intValue();
                        } else {
                            iIntValue2 = 0;
                        }
                        Integer num3 = repostTextExtra.spanEnd;
                        if (num3 != null) {
                            iIntValue3 = num3.intValue();
                        } else {
                            iIntValue3 = 0;
                        }
                        ClickableSpan clickableSpan = new ClickableSpan(interfaceC2681011z, iIntValue, repostTextExtra) { // from class: X.011y
                            public final InterfaceC2681011z LL;
                            public final int LLILLJJLI;
                            public final RepostTextExtra LLILLL;

                            @Override // android.text.style.ClickableSpan
                            public final void onClick(View view) {
                                InterfaceC2681011z interfaceC2681011z2;
                                String str3 = this.LLILLL.mentionUserId;
                                if (str3 != null && (interfaceC2681011z2 = this.LL) != null) {
                                    interfaceC2681011z2.LIZ(str3);
                                }
                            }

                            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                            public final void updateDrawState(TextPaint textPaint) {
                                textPaint.setColor(this.LLILLJJLI);
                                textPaint.setUnderlineText(false);
                            }

                            {
                                this.LL = interfaceC2681011z;
                                this.LLILLJJLI = iIntValue;
                                this.LLILLL = repostTextExtra;
                            }
                        };
                        int length = spannableStringBuilder.length();
                        if (iIntValue2 >= 0 && iIntValue3 <= length && iIntValue2 <= iIntValue3) {
                            C786410Ut5.q2(spannableStringBuilder, clickableSpan, iIntValue2, iIntValue3, 33);
                            C786410Ut5.q2(spannableStringBuilder, new StyleSpan(1), iIntValue2, iIntValue3, 33);
                        }
                    }
                }
            } else {
                spannableStringBuilder = new SpannableStringBuilder(str);
            }
            if (((Boolean) C0AIK.LIZ.getValue()).booleanValue()) {
                listLJJLIIIJILLIZJL = this.LLJLILLLLZIIL;
                if (listLJJLIIIJILLIZJL == null) {
                    listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(context.getText(2131838840).toString(), new String[]{"%1$s"}, 0, 6);
                    this.LLJLILLLLZIIL = listLJJLIIIJILLIZJL;
                }
            } else {
                listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(context.getText(2131838840).toString(), new String[]{"%1$s"}, 0, 6);
            }
            TextView textView = (TextView) this.LLJLIL.getValue();
            spannableStringBuilder.insert(0, (CharSequence) ListProtector.get(listLJJLIIIJILLIZJL, 0));
            String str3 = (String) C13LP.LJJJLZIJ(1, listLJJLIIIJILLIZJL);
            if (str3 != null) {
                str2 = str3;
            }
            spannableStringBuilder.append((CharSequence) str2);
            textView.setText(spannableStringBuilder);
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.base.BaseFriendsV3CellUISlotAssem, X.InterfaceC712990Rxx
    public final boolean ur(Object obj) {
        return obj instanceof InterfaceC1357880lRK;
    }

    @Override // X.InterfaceC705620Rm4
    public final boolean va(List<? extends Object> list) {
        int i = FriendsV3CommentAssem.LLJLLIL;
        return !C704790Rkj.LIZ(list);
    }
}
