package com.ss.android.ugc.aweme.tako.botpage.cards.carry.bot;

import X.C01GW;
import X.C03IT;
import X.C0GZF;
import X.C0ID4;
import X.C0R2Q;
import X.C123100dR;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1857750yRZ;
import X.C1858030yS1;
import X.C1858120ySA;
import X.C1862330yYx;
import X.C1863850ybP;
import X.C20235014Fo;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C597050NbL;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tako.botpage.actionbar.model.TakoActiveBotItem;
import com.ss.android.ugc.aweme.tako.botpage.cards.carry.bot.TakoBotSeeConversationAssem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBotInfo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBotItem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.jvm.internal.AwS236S0300000_27;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoBotSeeConversationAssem extends ReusedUISlotAssem<TakoBotSeeConversationAssem> implements InterfaceC712990Rxx<C1858030yS1> {
    public C1858030yS1 LLJJLIIIJLLLLLLLZ;
    public TuxTextView LLJL;
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 750));
    public TuxIconDrawable LLJLILLLLZIIL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fmo;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final C1863850ybP up() {
        return (C1863850ybP) this.LLJLIL.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0078  */
    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r5) {
        /*
            r4 = this;
            r0 = 2131378775(0x7f0a4257, float:1.8377792E38)
            android.view.View r3 = r5.findViewById(r0)
            X.0Q7z r2 = X.C1558520qew.LJIIL(r4)
            java.lang.Class<com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility> r1 = com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility.class
            r0 = 0
            X.01wD r0 = X.C1558520qew.LIZ(r2, r1, r0)
            com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility r0 = (com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility) r0
            r2 = 0
            if (r0 == 0) goto L78
            boolean r1 = r0.T91()
            r0 = 1
            if (r1 != r0) goto L78
        L1e:
            X.C1857750yRZ.LJIIIZ(r3, r0, r2)
            r0 = 2131381986(0x7f0a4ee2, float:1.8384305E38)
            android.view.View r1 = r5.findViewById(r0)
            com.bytedance.tux.input.TuxTextView r1 = (com.bytedance.tux.input.TuxTextView) r1
            r4.LLJL = r1
            if (r1 == 0) goto L35
            android.text.method.MovementMethod r0 = android.text.method.LinkMovementMethod.getInstance()
            r1.setMovementMethod(r0)
        L35:
            com.bytedance.tux.input.TuxTextView r0 = r4.LLJL
            if (r0 == 0) goto L3c
            r0.setHighlightColor(r2)
        L3c:
            X.0GdJ r2 = new X.0GdJ
            r2.<init>()
            r1 = 13
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r0 = X.C814420VxA.LIZIZ(r0)
            r2.LIZIZ = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r0 = X.C814420VxA.LIZIZ(r0)
            r2.LIZJ = r0
            r0 = 2130773652(0x7f010694, float:1.7150457E38)
            r2.LIZ = r0
            r0 = 2131099674(0x7f06001a, float:1.7811708E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.LJ = r0
            android.content.Context r0 = r5.getContext()
            com.bytedance.tux.drawable.TuxIconDrawable r0 = r2.LIZ(r0)
            r4.LLJLILLLLZIIL = r0
            return
        L78:
            r0 = 0
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.botpage.cards.carry.bot.TakoBotSeeConversationAssem.onViewCreated(android.view.View):void");
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C1858030yS1 c1858030yS1) {
        String str;
        String str2;
        String str3;
        String str4;
        Long lValueOf;
        Long lValueOf2;
        String str5;
        TakoBotItem takoBotItem;
        TakoBotItem takoBotItem2;
        TakoBotInfo takoBotInfo;
        C1858030yS1 c1858030yS12;
        TakoBotInfo takoBotInfo2;
        String strLIZIZ;
        boolean z;
        String str6;
        TakoBotInfo takoBotInfo3;
        this.LLJJLIIIJLLLLLLLZ = c1858030yS1;
        Context context = getContext();
        String str7 = null;
        if (context != null && (c1858030yS12 = this.LLJJLIIIJLLLLLLLZ) != null && (takoBotInfo2 = c1858030yS12.LLJJIJI) != null) {
            if (C123100dR.LIZ(takoBotInfo2.botAvatar)) {
                TuxIconDrawable tuxIconDrawable = this.LLJLILLLLZIIL;
                if (tuxIconDrawable != null) {
                    op(context, takoBotInfo2, tuxIconDrawable);
                }
                C1858120ySA c1858120ySA = new Object() { // from class: X.0ySA
                };
                Context context2 = getContext();
                C1858030yS1 c1858030yS13 = this.LLJJLIIIJLLLLLLLZ;
                if (c1858030yS13 != null && (takoBotInfo3 = c1858030yS13.LLJJIJI) != null) {
                    str6 = takoBotInfo3.botAvatar;
                } else {
                    str6 = null;
                }
                AwS236S0300000_27 awS236S0300000_27 = new AwS236S0300000_27(this, context, takoBotInfo2, 29);
                c1858120ySA.getClass();
                if (context2 != null) {
                    if (C123100dR.LIZ(str6) && str6 != null) {
                        C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(new C03IT(Collections.singletonList(str6)));
                        c1331670kl3LJIIJ.LJJIJL(context2);
                        c1331670kl3LJIIJ.LJJII(new C0ID4(context2, awS236S0300000_27, 4));
                    } else {
                        awS236S0300000_27.invoke(null);
                    }
                }
            } else {
                String string = context.getString(2131849802);
                if (C123100dR.LIZ(takoBotInfo2.botEmoji)) {
                    Context context3 = getContext();
                    if (context3 != null && C426750GoL.LIZLLL(context3)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(takoBotInfo2.botName);
                        sbLIZ.append(' ');
                        sbLIZ.append(takoBotInfo2.botEmoji);
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    } else {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(takoBotInfo2.botEmoji);
                        sbLIZ2.append(' ');
                        sbLIZ2.append(takoBotInfo2.botName);
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                    }
                } else {
                    strLIZIZ = takoBotInfo2.botName;
                }
                TuxTextView tuxTextView = this.LLJL;
                if (tuxTextView != null) {
                    tuxTextView.setText(tp(context, C786410Ut5.j4(context.getString(2131849801), Arrays.copyOf(new Object[]{string, strLIZIZ}, 2)), string));
                }
            }
        }
        C1858030yS1 c1858030yS14 = this.LLJJLIIIJLLLLLLLZ;
        if (c1858030yS14 != null) {
            C1862330yYx c1862330yYx = C1862330yYx.LIZ;
            C1863850ybP c1863850ybPUp = up();
            if (c1863850ybPUp != null) {
                str = c1863850ybPUp.LLILZIL;
            } else {
                str = null;
            }
            C1863850ybP c1863850ybPUp2 = up();
            if (c1863850ybPUp2 == null || (str2 = c1863850ybPUp2.LLILZLL) == null) {
                str2 = "";
            }
            C1863850ybP c1863850ybPUp3 = up();
            if (c1863850ybPUp3 != null) {
                str3 = c1863850ybPUp3.LL;
            } else {
                str3 = null;
            }
            C1863850ybP c1863850ybPUp4 = up();
            if (c1863850ybPUp4 != null) {
                str4 = c1863850ybPUp4.LLILLJJLI;
            } else {
                str4 = null;
            }
            C1863850ybP c1863850ybPUp5 = up();
            if (c1863850ybPUp5 != null) {
                lValueOf = Long.valueOf(c1863850ybPUp5.LLJILLL);
            } else {
                lValueOf = null;
            }
            TakoMixFeed takoMixFeedLJIIIZ = c1858030yS14.LLJJIJIL.LLILLL.LJIIIZ();
            if (takoMixFeedLJIIIZ != null && (takoBotItem2 = takoMixFeedLJIIIZ.bot) != null && (takoBotInfo = takoBotItem2.botInfo) != null) {
                lValueOf2 = Long.valueOf(takoBotInfo.botId);
            } else {
                lValueOf2 = null;
            }
            TakoMixFeed takoMixFeedLJIIIZ2 = c1858030yS14.LLJJIJIL.LLILLL.LJIIIZ();
            if (takoMixFeedLJIIIZ2 != null && (takoBotItem = takoMixFeedLJIIIZ2.bot) != null) {
                str5 = takoBotItem.botSessionId;
            } else {
                str5 = null;
            }
            C1863850ybP c1863850ybPUp6 = up();
            if (c1863850ybPUp6 != null) {
                str7 = c1863850ybPUp6.LLIZ;
            }
            C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
            c1862330yYx.getClass();
            Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("process_id", str), new Pair("enter_from", str3), new Pair("enter_method", str4), new Pair("last_sub_process_id", str5));
            if (lValueOf2 != null && lValueOf2.longValue() > 0) {
                mapLJIIJ.put("bot_id", String.valueOf(lValueOf2.longValue()));
            }
            if (C123100dR.LIZ(str5) && str5 != null) {
                mapLJIIJ.put("last_sub_process_id", str5);
            }
            if (C0R2Q.LIZIZ(lValueOf) > 0) {
                mapLJIIJ.put("action_item_id", String.valueOf(lValueOf));
            }
            if (C123100dR.LIZ(str2)) {
                mapLJIIJ.put("tako_session_id", str2);
            }
            if (str7 != null && C123100dR.LIZ(str7)) {
                mapLJIIJ.put("tako_chat_id", str7);
            }
            c20235014FoLIZ.LIZ("tikbot_see_conversation_show", mapLJIIJ);
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C1858030yS1 c1858030yS1) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C1858030yS1 c1858030yS1) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }

    public final void op(Context context, TakoBotInfo takoBotInfo, Drawable drawable) {
        boolean z;
        String string = context.getString(2131849802);
        Context context2 = getContext();
        if (context2 != null && C426750GoL.LIZLLL(context2)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(takoBotInfo.botName);
            sbLIZ.append("  ");
            String strLJIIIIZZ = C1857750yRZ.LJIIIIZZ(2131849801, string, C2188811AlT.LIZIZ(sbLIZ));
            TuxTextView tuxTextView = this.LLJL;
            if (tuxTextView != null) {
                tuxTextView.setText(sp(context, strLJIIIIZZ, string, drawable, a0.LJJJ(strLJIIIIZZ, takoBotInfo.botName, 0, false, 6) + takoBotInfo.botName.length() + 1));
                return;
            }
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("  ");
        sbLIZ2.append(takoBotInfo.botName);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        String strLJIIIIZZ2 = C1857750yRZ.LJIIIIZZ(2131849801, string, strLIZIZ);
        TuxTextView tuxTextView2 = this.LLJL;
        if (tuxTextView2 == null) {
            return;
        }
        tuxTextView2.setText(sp(context, strLJIIIIZZ2, string, drawable, a0.LJJJ(strLJIIIIZZ2, strLIZIZ, 0, false, 6)));
    }

    public final SpannableStringBuilder tp(final Context context, String str, String str2) {
        final int iIntValue = 0;
        int iLJJJ = a0.LJJJ(str, str2, 0, false, 6);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1n, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (iLJJJ >= 0) {
            C786410Ut5.q2(spannableStringBuilder, new ClickableSpan() { // from class: X.0yS8
                @Override // android.text.style.ClickableSpan
                public final void onClick(View view) {
                    String str3;
                    String str4;
                    String str5;
                    Long lValueOf;
                    Long lValueOf2;
                    String str6;
                    TakoBotItem takoBotItem;
                    TakoBotItem takoBotItem2;
                    TakoBotInfo takoBotInfo;
                    String str7;
                    String str8;
                    String str9;
                    TakoBotSeeConversationAssem takoBotSeeConversationAssem = this.LL;
                    C1858030yS1 c1858030yS1 = takoBotSeeConversationAssem.LLJJLIIIJLLLLLLLZ;
                    if (c1858030yS1 != null) {
                        Context context2 = context;
                        TakoBotInfo takoBotInfo2 = c1858030yS1.LLJJIJI;
                        String str10 = "";
                        if (takoBotInfo2 != null) {
                            TakoActiveBotItem takoActiveBotItem = new TakoActiveBotItem(takoBotInfo2, "", UUID.randomUUID().toString(), "click_see_conversation", System.currentTimeMillis());
                            C1863710ybB c1863710ybB = C1863710ybB.LIZ;
                            View contentView = takoBotSeeConversationAssem.getContentView();
                            InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(takoBotSeeConversationAssem);
                            C1863850ybP c1863850ybPUp = takoBotSeeConversationAssem.up();
                            if (c1863850ybPUp == null || (str8 = c1863850ybPUp.LL) == null) {
                                str8 = "";
                            }
                            C1863850ybP c1863850ybPUp2 = takoBotSeeConversationAssem.up();
                            if (c1863850ybPUp2 == null || (str9 = c1863850ybPUp2.LLILLJJLI) == null) {
                                str9 = "";
                            }
                            c1863710ybB.getClass();
                            C1863710ybB.LIZ(context2, contentView, interfaceC665370Q7zLJIIL, takoActiveBotItem, false, false, str8, str9, "click_subbot_hint");
                        }
                        C1858030yS1 c1858030yS12 = takoBotSeeConversationAssem.LLJJLIIIJLLLLLLLZ;
                        if (c1858030yS12 != null) {
                            C1862330yYx c1862330yYx = C1862330yYx.LIZ;
                            C1863850ybP c1863850ybPUp3 = takoBotSeeConversationAssem.up();
                            String str11 = null;
                            if (c1863850ybPUp3 != null) {
                                str3 = c1863850ybPUp3.LLILZIL;
                            } else {
                                str3 = null;
                            }
                            C1863850ybP c1863850ybPUp4 = takoBotSeeConversationAssem.up();
                            if (c1863850ybPUp4 != null && (str7 = c1863850ybPUp4.LLILZLL) != null) {
                                str10 = str7;
                            }
                            C1863850ybP c1863850ybPUp5 = takoBotSeeConversationAssem.up();
                            if (c1863850ybPUp5 != null) {
                                str4 = c1863850ybPUp5.LL;
                            } else {
                                str4 = null;
                            }
                            C1863850ybP c1863850ybPUp6 = takoBotSeeConversationAssem.up();
                            if (c1863850ybPUp6 != null) {
                                str5 = c1863850ybPUp6.LLILLJJLI;
                            } else {
                                str5 = null;
                            }
                            C1863850ybP c1863850ybPUp7 = takoBotSeeConversationAssem.up();
                            if (c1863850ybPUp7 != null) {
                                lValueOf = Long.valueOf(c1863850ybPUp7.LLJILLL);
                            } else {
                                lValueOf = null;
                            }
                            TakoMixFeed takoMixFeedLJIIIZ = c1858030yS12.LLJJIJIL.LLILLL.LJIIIZ();
                            if (takoMixFeedLJIIIZ != null && (takoBotItem2 = takoMixFeedLJIIIZ.bot) != null && (takoBotInfo = takoBotItem2.botInfo) != null) {
                                lValueOf2 = Long.valueOf(takoBotInfo.botId);
                            } else {
                                lValueOf2 = null;
                            }
                            TakoMixFeed takoMixFeedLJIIIZ2 = c1858030yS12.LLJJIJIL.LLILLL.LJIIIZ();
                            if (takoMixFeedLJIIIZ2 != null && (takoBotItem = takoMixFeedLJIIIZ2.bot) != null) {
                                str6 = takoBotItem.botSessionId;
                            } else {
                                str6 = null;
                            }
                            C1863850ybP c1863850ybPUp8 = takoBotSeeConversationAssem.up();
                            if (c1863850ybPUp8 != null) {
                                str11 = c1863850ybPUp8.LLIZ;
                            }
                            C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
                            c1862330yYx.getClass();
                            Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("process_id", str3), new Pair("enter_from", str4), new Pair("enter_method", str5), new Pair("tako_session_id", str10), new Pair("tako_chat_id", str11));
                            if (lValueOf2 != null && lValueOf2.longValue() > 0) {
                                mapLJIIJ.put("bot_id", String.valueOf(lValueOf2.longValue()));
                            }
                            if (C123100dR.LIZ(str6) && str6 != null) {
                                mapLJIIJ.put("last_sub_process_id", str6);
                            }
                            if (C0R2Q.LIZIZ(lValueOf) > 0) {
                                mapLJIIJ.put("action_item_id", String.valueOf(lValueOf));
                            }
                            c20235014FoLIZ.LIZ("tikbot_see_conversation_click", mapLJIIJ);
                        }
                    }
                }

                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public final void updateDrawState(TextPaint textPaint) {
                    textPaint.setColor(iIntValue);
                    textPaint.setUnderlineText(false);
                }
            }, iLJJJ, str2.length() + iLJJJ, 17);
        }
        return spannableStringBuilder;
    }

    public final SpannableStringBuilder sp(Context context, String str, String str2, Drawable drawable, int i) {
        SpannableStringBuilder spannableStringBuilderTp = tp(context, str, str2);
        drawable.setBounds(0, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(13)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(13)));
        C0GZF c0gzf = new C0GZF(drawable, 2);
        if (i >= 0 && i < str.length()) {
            C786410Ut5.q2(spannableStringBuilderTp, c0gzf, i, i + 1, 17);
        }
        return spannableStringBuilderTp;
    }
}
