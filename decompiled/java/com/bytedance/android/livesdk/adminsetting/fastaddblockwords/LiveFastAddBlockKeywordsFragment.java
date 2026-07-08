package com.bytedance.android.livesdk.adminsetting.fastaddblockwords;

import X.C01GW;
import X.C0TY5;
import X.C0TY7;
import X.C0TY8;
import X.C0TZ7;
import X.C1697810uHb;
import X.C16F5;
import X.C16FS;
import X.C292401Bi;
import X.C497740JfY;
import X.C500980Jkm;
import X.C745540TMi;
import X.C786410Ut5;
import X.InterfaceC745530TMh;
import Y.ACListenerS147S0100000_12;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.blockword.model.BlockWordRecommend;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveFastAddBlockKeywordsFragment extends LiveDialogFragment implements C0TY8 {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KSEhICEgLTE4ICE0ZiMtOjHELIOSsyLCEuJSAwIzIjOysgZgklPyoVKTY4CCs3CikjKiQYLTw7Jj03OwM+KCg+LSs4";
    public final List<String> LL;
    public RecyclerView LLILZ;
    public C745540TMi LLILZIL;
    public View LLILZLL;
    public C16FS LLIZ;
    public FrameLayout LLIZLLLIL;
    public C16F5 LLJ;
    public final C01GW LLILLJJLI = C292401Bi.LIZ(new AwS556S0100000_12(this, 152));
    public final C01GW LLILLL = C292401Bi.LIZ(new AwS556S0100000_12(this, 150));
    public final C01GW LLJI = C292401Bi.LIZ(new AwS556S0100000_12(this, 151));
    public final C0TY5 LLJIJIL = new InterfaceC745530TMh() { // from class: X.0TY5
        @Override // X.InterfaceC745530TMh
        public final void LIZ(int i) {
            ((C0TY7) this.LIZ.LLJI.getValue()).LIZIZ(i);
        }
    };

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    @Override // X.C0TY8
    public final void nQ() {
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.g82);
        c500980Jkm.LIZJ = R.style.ahx;
        c500980Jkm.LJII = 80;
        c500980Jkm.LJI = 0.0f;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final FrameLayout.LayoutParams getCustomLayoutParams() {
        return new FrameLayout.LayoutParams(-1, -2);
    }

    @Override // X.C0TY8
    public final void qH() {
        dismiss();
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0TY5] */
    public LiveFastAddBlockKeywordsFragment(List<String> list) {
        this.LL = list;
    }

    @Override // X.C0TY8
    public final void gN(List<BlockWordRecommend> list) {
        C745540TMi c745540TMi = this.LLILZIL;
        if (c745540TMi != null) {
            c745540TMi.LLILLJJLI = list;
            c745540TMi.notifyDataSetChanged();
        }
        Iterator<BlockWordRecommend> it2 = list.iterator();
        boolean z = false;
        while (it2.hasNext()) {
            if (it2.next().selected) {
                z = true;
            }
        }
        if (z) {
            C16FS c16fs = this.LLIZ;
            if (c16fs != null) {
                c16fs.j0(R.style.a7b);
            }
            C16FS c16fs2 = this.LLIZ;
            if (c16fs2 != null) {
                c16fs2.setEnabled(true);
                return;
            }
            return;
        }
        C16FS c16fs3 = this.LLIZ;
        if (c16fs3 != null) {
            c16fs3.j0(R.style.a7_);
        }
        C16FS c16fs4 = this.LLIZ;
        if (c16fs4 == null) {
            return;
        }
        c16fs4.setEnabled(false);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String secUid;
        long id;
        User owner;
        super.onViewCreated(view, bundle);
        this.LLILZ = (RecyclerView) view.findViewById(R.id.txq);
        this.LLILZLL = view.findViewById(R.id.view_close);
        this.LLIZ = (C16FS) view.findViewById(R.id.cmo);
        this.LLIZLLLIL = (FrameLayout) view.findViewById(R.id.i7h);
        this.LLJ = (C16F5) view.findViewById(R.id.zf0);
        View view2 = this.LLILZLL;
        if (view2 != null) {
            C786410Ut5.I7(new ACListenerS147S0100000_12(this, 128), view2);
        }
        FrameLayout frameLayout = this.LLIZLLLIL;
        if (frameLayout != null) {
            C786410Ut5.O7(frameLayout, new ACListenerS147S0100000_12(this, 129));
        }
        C16FS c16fs = this.LLIZ;
        if (c16fs != null) {
            C786410Ut5.h8(c16fs, new ACListenerS147S0100000_12(this, 130));
        }
        C745540TMi c745540TMi = new C745540TMi(this.LLJIJIL);
        this.LLILZIL = c745540TMi;
        RecyclerView recyclerView = this.LLILZ;
        if (recyclerView != null) {
            recyclerView.setAdapter(c745540TMi);
        }
        FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(getContext(), 0);
        flexboxLayoutManager.LJJII(1);
        flexboxLayoutManager.LJJI(2);
        flexboxLayoutManager.LJJIII(2);
        RecyclerView recyclerView2 = this.LLILZ;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(flexboxLayoutManager);
        }
        C0TY7 c0ty7 = (C0TY7) this.LLJI.getValue();
        boolean zBooleanValue = ((Boolean) this.LLILLL.getValue()).booleanValue();
        Room room = (Room) this.LLILLJJLI.getValue();
        if (room == null || (owner = room.getOwner()) == null || (secUid = owner.getSecUid()) == null) {
            secUid = "";
        }
        Room room2 = (Room) this.LLILLJJLI.getValue();
        if (room2 != null) {
            id = room2.getId();
        } else {
            id = 0;
        }
        c0ty7.LJ = zBooleanValue;
        c0ty7.LJFF = secUid;
        c0ty7.LJI = id;
        ((C0TY7) this.LLJI.getValue()).LIZLLL(this.LL);
        StringBuffer stringBuffer = new StringBuffer();
        int i = 0;
        for (String str : this.LL) {
            int i2 = i + 1;
            if (i >= 0) {
                String str2 = str;
                if (i > 0) {
                    stringBuffer.append(", ");
                }
                stringBuffer.append(str2);
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        C16F5 c16f5 = this.LLJ;
        if (c16f5 != null) {
            c16f5.setText(C497740JfY.LJIJJ(2131841032, stringBuffer));
        }
        C0TZ7 c0tz7 = C0TZ7.LIZ;
        DataChannel dataChannel = this.dataChannel;
        c0tz7.getClass();
        if (C0TZ7.LIZIZ(dataChannel)) {
            int size = this.LL.size();
            TextView textView = (TextView) view.findViewById(R.id.tv_title);
            if (textView != null) {
                textView.setText(C497740JfY.LJIIJJI(2131755374, size));
            }
            C16F5 c16f52 = this.LLJ;
            if (c16f52 != null) {
                c16f52.setText(C497740JfY.LJIIJJI(2131755375, size));
            }
            C16FS c16fs2 = this.LLIZ;
            if (c16fs2 != null) {
                c16fs2.setText(C497740JfY.LJIJI(2131835604));
            }
            FrameLayout frameLayout2 = this.LLIZLLLIL;
            if (frameLayout2 != null) {
                C786410Ut5.LJZ(8, frameLayout2);
            }
        }
    }
}
