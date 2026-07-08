package com.ss.android.ugc.aweme.im.sdk.chat.ui.view;

import X.C0I70;
import X.C0I77;
import X.C0I79;
import X.C0I7E;
import X.C0WZX;
import X.C1695010uD5;
import X.C2204961BRm;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C814420VxA;
import X.InterfaceC458980HzE;
import X.InterfaceC458990HzF;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public class SearchableEditText extends C0I7E implements InterfaceC458980HzE {
    public boolean LLJIJIL;
    public final TuxIconDrawable LLJILJIL;
    public final TuxIconDrawable LLJILJILJ;
    public InterfaceC458990HzF LLJILLL;
    public Function0<Boolean> LLJJ;
    public Function2<? super C0I70, ? super Integer, Boolean> LLJJI;
    public List<TextWatcher> LLJJIII;

    public SearchableEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final void LJIIJJI() {
        List<TextWatcher> list = this.LLJJIII;
        if (list != null) {
            Iterator<TextWatcher> it2 = list.iterator();
            while (it2.hasNext()) {
                super.removeTextChangedListener(it2.next());
            }
        }
        List<TextWatcher> list2 = this.LLJJIII;
        if (list2 != null) {
            list2.clear();
        }
        this.LLJJIII = null;
        this.LLJJ = null;
        this.LLJJI = null;
    }

    @Override // android.widget.TextView
    public final void addTextChangedListener(TextWatcher textWatcher) {
        List<TextWatcher> list;
        super.addTextChangedListener(textWatcher);
        if (this.LLJJIII == null) {
            this.LLJJIII = new ArrayList();
        }
        if (textWatcher != null && (list = this.LLJJIII) != null) {
            list.add(textWatcher);
        }
    }

    @Override // X.C0I7E, X.C21410318qb, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (inputConnectionOnCreateInputConnection == null) {
            return null;
        }
        final Function2<? super C0I70, ? super Integer, Boolean> function2 = this.LLJJI;
        if (function2 == null) {
            return inputConnectionOnCreateInputConnection;
        }
        C1695010uD5.LIZ(editorInfo, new String[]{"image/*"});
        return C0I79.LIZ(inputConnectionOnCreateInputConnection, editorInfo, new C0I77() { // from class: X.0I75
            @Override // X.C0I77
            public final boolean LIZ(C0I70 c0i70, int i, Bundle bundle) {
                return function2.invoke(c0i70, Integer.valueOf(i)).booleanValue();
            }
        });
    }

    @Override // X.C21410318qb, android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        Function0<Boolean> function0;
        if ((i != 16908322 && i != 16908337) || (function0 = this.LLJJ) == null || !function0.invoke().booleanValue()) {
            return super.onTextContextMenuItem(i);
        }
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) throws Throwable {
        if (motionEvent.getAction() == 1) {
            Drawable drawable = getCompoundDrawablesRelative()[2];
            if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
                if (drawable != null && motionEvent.getX() >= getLeft() + getPaddingLeft() && motionEvent.getX() <= getLeft() + getPaddingLeft() + drawable.getBounds().width()) {
                    setText("");
                }
            } else if (drawable != null && motionEvent.getX() <= getWidth() - getPaddingRight() && motionEvent.getX() >= (getWidth() - getPaddingRight()) - drawable.getBounds().width()) {
                setText("");
            }
        }
        motionEvent.getAction();
        getLineCount();
        Editable editableLLZZJLIL = C2204961BRm.LLZZJLIL(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOlLYzK13yjN1rdG6KMebi9KwVJ6Bncx0FLyZ0QbgTTG5Zc7xCk", null));
        if (editableLLZZJLIL != null) {
            editableLLZZJLIL.length();
        }
        int lineCount = getLineCount();
        boolean zOnTouchEvent = false;
        for (int i = 0; i < lineCount; i++) {
            getLayout().getLineEnd(i);
            getLayout().getLineStart(i);
        }
        try {
            zOnTouchEvent = super.onTouchEvent(motionEvent);
            return zOnTouchEvent;
        } catch (IndexOutOfBoundsException e) {
            TryCatchGuardChecker.doCheck(e);
            return zOnTouchEvent;
        } catch (SecurityException e2) {
            TryCatchGuardChecker.doCheck(e2);
            return zOnTouchEvent;
        }
    }

    @Override // android.widget.TextView
    public final void removeTextChangedListener(TextWatcher textWatcher) {
        List<TextWatcher> list;
        super.removeTextChangedListener(textWatcher);
        if (textWatcher != null && (list = this.LLJJIII) != null) {
            list.remove(textWatcher);
        }
    }

    @Override // X.InterfaceC458980HzE
    public void setKeyImeChangeListener(InterfaceC458990HzF interfaceC458990HzF) {
        this.LLJILLL = interfaceC458990HzF;
    }

    public void setOnCommitContentListener(Function2<? super C0I70, ? super Integer, Boolean> function2) {
        this.LLJJI = function2;
    }

    public void setOnPasteListener(Function0<Boolean> function0) {
        this.LLJJ = function0;
    }

    public final void setSearchable(boolean z) {
        TuxIconDrawable tuxIconDrawable;
        this.LLJIJIL = z;
        if (z) {
            tuxIconDrawable = this.LLJILJILJ;
        } else {
            tuxIconDrawable = null;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        setCompoundDrawablesRelativeWithIntrinsicBounds(tuxIconDrawable, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        InterfaceC458990HzF interfaceC458990HzF;
        if (keyEvent == null || keyEvent.getAction() != 0 || 4 != keyEvent.getKeyCode() || (interfaceC458990HzF = this.LLJILLL) == null) {
            return false;
        }
        return interfaceC458990HzF.of(i, keyEvent);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SearchableEditText(Context context, AttributeSet attributeSet, int i) {
        int i2;
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        if ((i & 4) != 0) {
            i2 = R.attr.xv;
        } else {
            i2 = 0;
        }
        super(context, attributeSet, i2);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_x_mark_circle_fill;
        Integer numValueOf = Integer.valueOf(R.attr.a1k);
        c419910GdJ.LJ = numValueOf;
        this.LLJILJIL = c419910GdJ.LIZ(context);
        C419910GdJ c419910GdJ2 = new C419910GdJ();
        c419910GdJ2.LIZ = R.raw.icon_tab_explore_fill;
        c419910GdJ2.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        c419910GdJ2.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        c419910GdJ2.LJ = numValueOf;
        this.LLJILJILJ = c419910GdJ2.LIZ(context);
    }

    @Override // X.C0I7D, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        boolean z2;
        Editable editableLLZZJLIL;
        super.onFocusChanged(z, i, rect);
        TuxIconDrawable tuxIconDrawable = null;
        if (z && ((editableLLZZJLIL = C2204961BRm.LLZZJLIL(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOlLYzK13yjN1rdG6KMebi9KwVJ6Bncx0FLyZ0QbgTTG5Zc7xCk", null))) == null || editableLLZZJLIL.length() == 0)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.LLJIJIL && z2) {
            tuxIconDrawable = this.LLJILJIL;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        setCompoundDrawablesRelativeWithIntrinsicBounds(compoundDrawablesRelative[0], compoundDrawablesRelative[1], tuxIconDrawable, compoundDrawablesRelative[3]);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        boolean z;
        TuxIconDrawable tuxIconDrawable;
        super.onTextChanged(charSequence, i, i2, i3);
        if (isFocused() && charSequence.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.LLJIJIL && z) {
            tuxIconDrawable = this.LLJILJIL;
        } else {
            tuxIconDrawable = null;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        setCompoundDrawablesRelativeWithIntrinsicBounds(compoundDrawablesRelative[0], compoundDrawablesRelative[1], tuxIconDrawable, compoundDrawablesRelative[3]);
    }
}
