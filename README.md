# linux commands
| Command                                     | Description                                                      |
| ------------------------------------------- | ---------------------------------------------------------------- |
| `mv file1 file2`                            | Moves or renames `file1` to `file2`.                             |
| `mv intro manual/chap1`                     | Moves the file `intro` into the directory `manual/chap1`.        |
| `mv intro chap3`                            | Renames `intro` to `chap3`.                                      |
| `mv appendix apndx.a`                       | Renames `appendix` to `apndx.a`.                                 |
| `cat filename`                              | Displays the contents of a file on the terminal.                 |
| `vim filename`                              | Opens the file in the `vim` editor for editing.                  |
| `mkdir directory_name`                      | Creates a new directory.                                         |
| `ls`                                        | Lists files and directories in the current directory.            |
| `ls -t`                                     | Lists files sorted by modification time (newest first).          |
| `ls -s`                                     | Lists files with their size in blocks.                           |
| `ls -h`                                     | Lists file sizes in **human-readable** format (e.g., KB, MB).    |
| `ls -r`                                     | Lists files in **reverse** order.                                |
| `cd`                                        | Changes to the home directory (`~/`).                            |
| `cd ..`                                     | Moves up one directory level.                                    |
| `cd ~` or `cd ~/`                           | Changes to the current user's home directory.                    |
| `cd ../../`                                 | Moves up **two** directory levels.                               |
| `mkdir -p dir1/dir2/dir3`                   | Creates nested directories (makes parent directories as needed). |
| `cp source.txt destination.txt`             | Copies a file from source to destination.                        |
| `cp -v source.txt destination.txt`          | Copies with **verbose** output (shows what’s being copied).      |
| `cp -p source.txt destination.txt`          | Preserves file **permissions, ownership, and timestamps**.       |
| `cp -r dir1 dir2`                           | Recursively copies an entire directory and its contents.         |
| `cp file1.txt file2.txt`                    | Copies `file1.txt` to `file2.txt`.                               |
| `cp file1.txt file2.txt /path/to/directory` | Copies both files into the specified directory.                  |
| `echo "Hello, World!"`                      | Prints text to the terminal. Useful in scripts.                  |
| `less filename`                             | Opens a file for **paged viewing** (scrollable).                 |
| `less -E filename`                          | Exits `less` automatically when the end of the file is reached.  |
| `less -n filename`                          | Hides line numbers while viewing.                                |
| `less -N filename`                          | Shows line numbers while viewing.                                |
| `less -s filename`                          | Squeezes multiple blank lines into a single blank line.          |
