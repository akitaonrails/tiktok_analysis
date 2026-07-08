package com.ss.android.ugc.aweme.favorites.business.comment;

import X.AbstractC683590Qrd;
import X.C786410Ut5;
import android.app.Activity;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.favorites.business.base.BaseCollectListFragment;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentCollectListAdapter extends AbstractC683590Qrd<Comment> {
    public static final int $stable = 8;
    public final boolean isFromMyProfile;
    public final Activity mActivity;
    public final Fragment mFragment;

    public final void removeItem(Comment comment) {
        List<Comment> data = getData();
        if (data != null) {
            data.remove(comment);
        }
        notifyDataSetChanged();
        List<Comment> data2 = getData();
        if (data2 != null && data2.isEmpty()) {
            ((BaseCollectListFragment) this.mFragment).Ng1();
        }
    }

    @Override // X.AbstractC438050HFr
    public void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Comment comment;
        List<Comment> data = getData();
        if (data != null) {
            comment = (Comment) ListProtector.get(data, i);
        } else {
            comment = null;
        }
        ((CommentCollectViewHolder) viewHolder).bindView(comment, this.mActivity, this.mFragment, this);
    }

    @Override // X.AbstractC438050HFr
    public RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        return new CommentCollectViewHolder(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.c6i, viewGroup, false), this.isFromMyProfile);
    }

    public CommentCollectListAdapter(Activity activity, Fragment fragment, boolean z) {
        super(false);
        this.mActivity = activity;
        this.mFragment = fragment;
        this.isFromMyProfile = z;
    }
}
