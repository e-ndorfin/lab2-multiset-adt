# Git Branch Tutorial

## Creating and Working with Branches

### 1. Create a new branch
```bash
git checkout -b feature-branch-name
```

### 2. Make your changes
Edit your files as needed, then stage and commit:
```bash
git add .
git commit -m "Your commit message"
```

### 3. Push the branch to origin
```bash
git push origin feature-branch-name
```

### 4. Create a Pull Request
Go to your repository on GitHub and click "Compare & pull request" to create a PR for your new branch.

## Quick Reference
- `git branch -all` - List all branches