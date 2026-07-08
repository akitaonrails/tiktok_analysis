package com.ss.ugc.android.editor.core.vm;

import X.C0E48;
import X.C1DRG;
import X.C349830DnZ;
import androidx.lifecycle.ViewModel;

/* JADX INFO: loaded from: classes6.dex */
public class BaseViewModel extends ViewModel {
    public C1DRG diContainer;
    public C0E48 editorContext;

    public final C1DRG getDiContainer() {
        return this.diContainer;
    }

    public final C0E48 getEditorContext() {
        return this.editorContext;
    }

    public final void bindDIContainer(C1DRG c1drg) {
        this.diContainer = c1drg;
        this.editorContext = C349830DnZ.LIZ(c1drg);
    }

    public final void bindEditorContext(C0E48 c0e48) {
        this.editorContext = c0e48;
    }

    public final void setDiContainer(C1DRG c1drg) {
        this.diContainer = c1drg;
    }

    public final void setEditorContext(C0E48 c0e48) {
        this.editorContext = c0e48;
    }
}
