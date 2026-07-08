package j27;

import android.content.Context;
import android.content.MutableContextWrapper;

/* JADX INFO: loaded from: classes21.dex */
public class o extends MutableContextWrapper {
    public boolean LL;
    public final MutableContextWrapper LLILLJJLI;

    public final Context LIZ() {
        return this.LL ? getBaseContext() : this.LLILLJJLI;
    }

    public o(Context context) {
        super(context);
        MutableContextWrapper mutableContextWrapper = new MutableContextWrapper(null);
        this.LLILLJJLI = mutableContextWrapper;
        mutableContextWrapper.setBaseContext(context);
    }

    @Override // android.content.MutableContextWrapper
    public final void setBaseContext(Context context) {
        super.setBaseContext(context);
        this.LLILLJJLI.setBaseContext(context);
    }
}
