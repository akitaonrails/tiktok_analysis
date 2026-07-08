package com.ss.android.ugc.aweme.base.ui;

import X.C0QB7;
import X.C1264070j01;
import X.C12ES;
import X.C14KQ;
import X.C341940Daq;
import X.C691000R8o;
import X.C786410Ut5;
import X.C960203pA;
import Y.AObjectS64S0000000_11;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.ss.android.ugc.aweme.friends.model.MutualStruct;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.relation.label.RelationLabelTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes12.dex */
public class TagLayout extends LinearLayout {
    public static final /* synthetic */ int LLILLL = 0;
    public final Context LL;
    public String LLILLJJLI;

    public void setFeedFromPage(int i) {
    }

    public void setFromPostPage(boolean z) {
    }

    static {
        C341940Daq.LIZ(5.0d);
    }

    public static int getMutualLablesTotalWidth() {
        return (int) (((double) C14KQ.LJII()) * 0.65d);
    }

    private void setMutualTagView(MutualStruct mutualStruct) {
        if (mutualStruct != null && C691000R8o.LIZ(null, this.LLILLJJLI, null)) {
            View childAt = getChildAt(0);
            if (childAt != null) {
                RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, childAt);
                removeView(childAt);
            }
            ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, (int) C12ES.LIZJ(22.0f, this.LL));
            View viewTd = C786410Ut5.Td(C786410Ut5.ne(this.LL), R.layout.d5e, this, false);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(C960203pA.LIZ(R.attr.bx, this.LL));
            gradientDrawable.setCornerRadius(C12ES.LIZJ(2.0f, this.LL));
            viewTd.setBackground(gradientDrawable);
            C0QB7 c0qb7 = (C0QB7) viewTd.findViewById(R.id.wo4);
            c0qb7.LIZ(mutualStruct, 4);
            c0qb7.LLILLJJLI.setTuxFont(62);
            c0qb7.setTextColor(C960203pA.LIZ(R.attr.a1h, this.LL));
            c0qb7.setTvMaxWidth(getMutualLablesTotalWidth());
            addView(viewTd, 0, layoutParams);
        }
    }

    private void setRelationLabelView(MatchedFriendStruct matchedFriendStruct) {
        if (matchedFriendStruct == null) {
            return;
        }
        View childAt = getChildAt(0);
        if (childAt != null) {
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, childAt);
            removeView(childAt);
        }
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, (int) C12ES.LIZJ(22.0f, this.LL));
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(this.LL), R.layout.b8x, this, false);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(C960203pA.LIZ(R.attr.bx, this.LL));
        gradientDrawable.setCornerRadius(C12ES.LIZJ(2.0f, this.LL));
        viewTd.setBackground(gradientDrawable);
        RelationLabelTextView relationLabelTextView = (RelationLabelTextView) viewTd.findViewById(R.id.t4q);
        relationLabelTextView.setMaxWidth(C14KQ.LJIIIIZZ(this.LL) - C341940Daq.LIZ(130.0d));
        relationLabelTextView.LJJJJJ(matchedFriendStruct, C1264070j01.LJIIL, new AObjectS64S0000000_11(0));
        relationLabelTextView.setTextColor(C960203pA.LIZ(R.attr.a1h, this.LL));
        addView(viewTd, 0, layoutParams);
    }

    public void setEventType(String str) {
        this.LLILLJJLI = str;
    }

    public TagLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = context;
    }
}
