package com.ss.android.ugc.aweme.comment.multipanel;

import X.C01GW;
import X.C0I2X;
import X.C0WZX;
import X.C1233040iBy;
import X.C1350920lG6;
import X.C1353500lKG;
import X.C1389890mGx;
import X.C2204961BRm;
import X.C450690Hlr;
import X.C451030HmP;
import X.C452501pT;
import X.C462450IBn;
import X.C844470XAv;
import X.InterfaceC450680Hlq;
import X.InterfaceC460010I2d;
import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.comment.experiment.PersonalizedEmojiExperiment;
import com.ss.android.ugc.aweme.feed.model.CommentPersonalizedEmoji;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class EmojiInputViewImplV2 implements InterfaceC450680Hlq {
    public final EditText LL;
    public int LLILLJJLI;
    public final InterfaceC460010I2d LLILLL;
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1299));

    @Override // X.InterfaceC450680Hlq
    public final void fU0(C451030HmP c451030HmP) {
    }

    @Override // X.InterfaceC450680Hlq
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public /* bridge */ /* synthetic */ void onDestroy() {
        C450690Hlr.LIZ(this);
    }

    @Override // X.InterfaceC450680Hlq
    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public /* bridge */ /* synthetic */ void onPause() {
        C450690Hlr.LIZIZ(this);
    }

    @Override // X.InterfaceC450680Hlq
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public /* bridge */ /* synthetic */ void onResume() {
        C450690Hlr.LIZJ(this);
    }

    @Override // X.InterfaceC450680Hlq
    public final void Id() {
        KeyEvent keyEvent = new KeyEvent(0, 67);
        if (this.LLILZ.getValue() == null) {
            this.LL.dispatchKeyEvent(keyEvent);
            return;
        }
        InputConnection inputConnection = (InputConnection) this.LLILZ.getValue();
        if (inputConnection != null) {
            inputConnection.sendKeyEvent(keyEvent);
        }
    }

    @Override // X.InterfaceC450680Hlq
    public final void CC(String str) {
        C1350920lG6.LIZ.getClass();
        C1350920lG6.LLIIII(str, "emoji_board", 1, 0, "", null, null);
        if (PersonalizedEmojiExperiment.LIZIZ()) {
            C0I2X.LIZ.getClass();
            C0I2X.LIZ(str);
        }
        if (this.LLILLL.RF()) {
            return;
        }
        if (C2204961BRm.LLJILLL(this.LL, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaL6bIfjgs1uW/kiKgnFvRRS2b9U7feqnpvMeLGR0vog==", null)).length() + str.length() > this.LLILLJJLI) {
            C844470XAv.LIZ.getClass();
            String string = C844470XAv.LIZ().getResources().getString(2131828516);
            C1233040iBy c1233040iBy = new C1233040iBy(C844470XAv.LIZ());
            c1233040iBy.LIZJ(string);
            c1233040iBy.LIZLLL();
            return;
        }
        int selectionStart = this.LL.getSelectionStart();
        int selectionEnd = this.LL.getSelectionEnd();
        int iMax = Math.max(0, selectionStart);
        int iMax2 = Math.max(0, selectionEnd);
        if (iMax == iMax2) {
            C2204961BRm.LLJILLL(this.LL, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaL6bIfjgs1uW/kiKgnFvRRS2b9U7feqnpvMeLGR0vog==", null)).insert(iMax, str);
        } else {
            try {
                C2204961BRm.LLJILLL(this.LL, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaL6bIfjgs1uW/kiKgnFvRRS2b9U7feqnpvMeLGR0vog==", null)).replace(iMax, iMax2, str);
            } catch (IndexOutOfBoundsException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        int length = iMax + str.length();
        if (length >= this.LL.length()) {
            EditText editText = this.LL;
            editText.setSelection(editText.length());
        } else {
            this.LL.setSelection(length);
        }
    }

    @Override // X.InterfaceC450680Hlq
    public final void zm(CommentPersonalizedEmoji commentPersonalizedEmoji) {
        String str;
        if (commentPersonalizedEmoji != null && (str = commentPersonalizedEmoji.emoji) != null) {
            C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
            String str2 = commentPersonalizedEmoji.source;
            Integer num = commentPersonalizedEmoji.score;
            String str3 = commentPersonalizedEmoji.strategy;
            c1350920lG6.getClass();
            C1350920lG6.LLIIII(str, str2, 1, num, str3, null, null);
            if (PersonalizedEmojiExperiment.LIZIZ()) {
                C0I2X.LIZ.getClass();
                C0I2X.LIZ(str);
            }
            if (this.LLILLL.RF()) {
                return;
            }
            if (C2204961BRm.LLJILLL(this.LL, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaL6bIfjgs1uW/kiKgnFvRRS2b9U7feqnpvMeLGR0vog==", null)).length() + str.length() > this.LLILLJJLI) {
                C844470XAv.LIZ.getClass();
                String string = C844470XAv.LIZ().getResources().getString(2131828516);
                C1389890mGx c1389890mGx = new C1389890mGx(this.LL);
                c1389890mGx.LJIIJ(string);
                c1389890mGx.LJIIJJI();
                return;
            }
            SpannableString spannableStringLIZ = C462450IBn.LIZ(commentPersonalizedEmoji);
            int selectionStart = this.LL.getSelectionStart();
            int selectionEnd = this.LL.getSelectionEnd();
            int iMax = Math.max(0, selectionStart);
            int iMax2 = Math.max(0, selectionEnd);
            if (iMax == iMax2) {
                C2204961BRm.LLJILLL(this.LL, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaL6bIfjgs1uW/kiKgnFvRRS2b9U7feqnpvMeLGR0vog==", null)).insert(iMax, spannableStringLIZ);
            } else {
                try {
                    C2204961BRm.LLJILLL(this.LL, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaL6bIfjgs1uW/kiKgnFvRRS2b9U7feqnpvMeLGR0vog==", null)).replace(iMax, iMax2, spannableStringLIZ);
                } catch (IndexOutOfBoundsException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            int length = iMax + str.length();
            if (length >= this.LL.length()) {
                EditText editText = this.LL;
                editText.setSelection(editText.length());
            } else {
                this.LL.setSelection(length);
            }
        }
    }

    public EmojiInputViewImplV2(C1353500lKG c1353500lKG, int i, InterfaceC460010I2d interfaceC460010I2d) {
        this.LL = c1353500lKG;
        this.LLILLJJLI = i;
        this.LLILLL = interfaceC460010I2d;
    }
}
