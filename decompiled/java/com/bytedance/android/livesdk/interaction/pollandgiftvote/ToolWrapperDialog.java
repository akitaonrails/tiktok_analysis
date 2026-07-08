package com.bytedance.android.livesdk.interaction.pollandgiftvote;

import android.content.DialogInterface;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes8.dex */
public final class ToolWrapperDialog extends PollAndGiftVoteDialog {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9ISs4LD0yKzHELIOSElJiF9OCogJS49LCIlLzslJzEpZxs8JykbOy4jOCA+DSYyJCor";
    public final Function0<Unit> LLJJJ;
    public final Function0<Unit> LLJJJIL;

    public ToolWrapperDialog() {
        this(null, null);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Function0<Unit> function0 = this.LLJJJ;
        if (function0 != null) {
            function0.invoke();
        }
        super.onCancel(dialogInterface);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Function0<Unit> function0 = this.LLJJJIL;
        if (function0 != null) {
            function0.invoke();
        }
        super.onDismiss(dialogInterface);
    }

    public ToolWrapperDialog(Function0<Unit> function0, Function0<Unit> function02) {
        this.LLJJJ = function0;
        this.LLJJJIL = function02;
    }
}
